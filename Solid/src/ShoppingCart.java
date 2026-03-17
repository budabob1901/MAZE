import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;
    private PricingStrategy pricingStrategy;

    public ShoppingCart(PricingStrategy pricingStrategy) {
        this.items = new ArrayList<>();
        this.pricingStrategy = pricingStrategy;
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        return pricingStrategy.calculateTotal(items);
    }

    public void displayItems() {
        System.out.println("Items in the cart:");
        for (Product item : items) {
            System.out.println(item.getName());
        }
    }
}
