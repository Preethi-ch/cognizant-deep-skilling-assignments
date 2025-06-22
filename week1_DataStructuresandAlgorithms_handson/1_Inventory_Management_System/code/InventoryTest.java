public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new ProductInventory("P001", "Laptop", 10, 75000.00));
        manager.addProduct(new ProductInventory("P002", "Mouse", 50, 500.00));
        manager.addProduct(new ProductInventory("P003", "Keyboard", 30, 1500.00));

        System.out.println("Initial Inventory:");
        manager.showInventory();

        manager.updateProduct("P002", "Wireless Mouse", 60, 650.00);
        manager.deleteProduct("P003");

        System.out.println("\nUpdated Inventory:");
        manager.showInventory();
    }
}
