public class LibraryTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B101", "The Alchemist", "Paulo Coelho"),
            new Book("B102", "Java Programming", "James Gosling"),
            new Book("B103", "Design Patterns", "Erich Gamma"),
            new Book("B104", "Effective Java", "Joshua Bloch")
        };

       
        System.out.println("Linear Search for 'Design Patterns':");
        Book result1 = LibrarySearchUtility.linearSearch(books, "Design Patterns");
        System.out.println(result1 != null ? result1 : "Book not found");

        
        LibrarySearchUtility.sortBooksByTitle(books);

        System.out.println("\nBinary Search for 'Design Patterns':");
        Book result2 = LibrarySearchUtility.binarySearch(books, "Design Patterns");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
