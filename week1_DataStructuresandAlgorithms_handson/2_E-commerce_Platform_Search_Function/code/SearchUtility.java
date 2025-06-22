public class SearchUtility {

    
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = products[mid].getProductName().compareToIgnoreCase(targetName);
            if (result == 0) {
                return products[mid];
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    
    public static void sortProductsByName(Product[] products) {
        java.util.Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));
    }
}
