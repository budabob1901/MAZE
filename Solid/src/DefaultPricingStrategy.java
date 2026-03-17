import java.util.List;

public class DefaultPricingStrategy implements PricingStrategy {
    @Override
    public double calculateTotal(List<Product> items) {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
