import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, ProductInventory> inventory = new HashMap<>();

    public void addProduct(ProductInventory product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String name, int quantity, double price) {
        ProductInventory product = inventory.get(productId);
        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.remove(productId) == null) {
            System.out.println("Product not found: " + productId);
        }
    }

    public void showInventory() {
        for (ProductInventory product : inventory.values()) {
            System.out.println(product);
        }
    }
}
