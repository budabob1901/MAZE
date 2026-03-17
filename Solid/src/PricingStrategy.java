import java.util.List;

public interface PricingStrategy {
    double calculateTotal(List<Product> items);
}
