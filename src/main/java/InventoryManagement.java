import enums.ProductCategory;
import models.Product;
import models.Warehouse;

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryManager inventoryManager = InventoryManager.getInstance();

        Warehouse warehouse1 = new Warehouse("Mumbai Warehouse");
        Warehouse warehouse2 = new Warehouse("Kolkata Warehouse");

        inventoryManager.addWarehouse(warehouse1);
        inventoryManager.addWarehouse(warehouse2);

        ProductFactory productFactory = new ProductFactory();
        Product laptop = productFactory.createProduct(ProductCategory.ELECTRONICS, "SKU001", "Laptop", 50000.00, 50, 10);
        Product banana = productFactory.createProduct(ProductCategory.GROCERY, "SKU002", "Banana", 12.00, 500, 100);

        warehouse1.addProduct(laptop, 25);
        warehouse2.addProduct(laptop, 25);
        warehouse1.addProduct(banana, 500);

        warehouse1.removeProduct("SKU001", 30);
        warehouse2.removeProduct("SKU002", 250);
        warehouse1.removeProduct("SKU002", 250);
    }
}
