public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Shoes", "Fashion"),
            new Product("P103", "Keyboard", "Electronics"),
            new Product("P104", "Notebook", "Stationery"),
            new Product("P105", "Watch", "Accessories")
        };

        
        System.out.println("Linear Search:");
        Product found = SearchUtility.linearSearch(products, "Keyboard");
        System.out.println(found != null ? found : "Product not found");

        
        SearchUtility.sortProductsByName(products);
        System.out.println("\nBinary Search:");
        Product foundBinary = SearchUtility.binarySearch(products, "Keyboard");
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}
