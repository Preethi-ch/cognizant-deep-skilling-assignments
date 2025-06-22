public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 1500.50),
            new Order("O002", "Bob", 700.00),
            new Order("O003", "Charlie", 2150.75),
            new Order("O004", "David", 990.00)
        };

        System.out.println("Original Orders:");
        SortUtility.printOrders(orders);

       
        System.out.println("\nSorted by Bubble Sort:");
        SortUtility.bubbleSort(orders);
        SortUtility.printOrders(orders);

        
        Order[] orders2 = {
            new Order("O001", "Alice", 1500.50),
            new Order("O002", "Bob", 700.00),
            new Order("O003", "Charlie", 2150.75),
            new Order("O004", "David", 990.00)
        };

        System.out.println("\nSorted by Quick Sort:");
        SortUtility.quickSort(orders2, 0, orders2.length - 1);
        SortUtility.printOrders(orders2);
    }
}
