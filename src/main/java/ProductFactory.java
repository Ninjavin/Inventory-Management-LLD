import enums.ProductCategory;
import models.ElectronicsProduct;
import models.GroceryProduct;
import models.Product;

public class ProductFactory {
    public Product createProduct(ProductCategory category, String sku, String name, double price, int quantity, int threshold) {
        switch (category) {
            case ELECTRONICS:
                return new ElectronicsProduct(sku, name, price, quantity, threshold);
            case GROCERY:
                return new GroceryProduct(sku, name, price, quantity, threshold);
            default:
                throw new IllegalArgumentException("Unsupported product category : " + category);
        }
    }
}
