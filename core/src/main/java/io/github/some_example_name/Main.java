package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Player player;

    @Override
    public void create() {
        batch = new SpriteBatch();
        player = new Player();   // vi laver spilleren her
    }

    @Override
    public void render() {
        // ryd skærmen
        ScreenUtils.clear(0f, 0f, 1f, 1f);

        // beregn delta tid
        float delta = Gdx.graphics.getDeltaTime();

        // opdater spilleren
        player.update(delta);

        // tegn spilleren
        batch.begin();
        player.render(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        player.dispose();
    }
}
