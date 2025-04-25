public class Book {

    // Instance variables for each book
    private String isbn;
    private String title;
    private String author;
    private boolean isBorrowed;

    // Static variable to keep track of total books (use int for count)
    private static int totalNoOfBooks = 0;

    // Constructor with all details
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        totalNoOfBooks++; // Increment total count on object creation
    }

    // Constructor with ISBN only (assuming unknown title and author)
    public Book(String isbn) {
        this(isbn, "unknown", "unknown"); // Call the full constructor
    }

    // Getter for total number of books
    public static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("This book is already borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy reading " + title + "!");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Thank you for returning " + title + ". We hope you enjoyed it!");
        } else {
            System.out.println(title + " is already in the library.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design of Things", "Author");
        Book myBook = new Book("2");
        System.out.println("Total number of books: " + Book.getTotalNoOfBooks());

        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook(); // Already borrowed message will be printed
        designOfThings.returnBook();

    }
}