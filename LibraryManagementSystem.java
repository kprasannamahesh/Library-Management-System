import java.util.ArrayList;
import java.util.List;

// Book class representing a book in the library
class Book {
    private String title;
    private String author;
    private int id;
    private boolean available;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.available = true;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

// Member class representing a library member
class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}

// Library class representing the library and its operations
class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Add a member to the library
    public void addMember(Member member) {
        members.add(member);
    }

    // Remove a member from the library
    public void removeMember(Member member) {
        members.remove(member);
    }

    // Check out a book
    public void checkoutBook(Book book, Member member) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book " + book.getTitle() + " checked out by " + member.getName());
        } else {
            System.out.println("Book " + book.getTitle() + " is not available.");
        }
    }

    // Check in a book
    public void checkinBook(Book book) {
        book.setAvailable(true);
        System.out.println("Book " + book.getTitle() + " checked in.");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create library instance
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 2);
        library.addBook(book1);
        library.addBook(book2);

        // Add members to the library
        Member member1 = new Member("Alice", 101);
        Member member2 = new Member("Bob", 102);
        library.addMember(member1);
        library.addMember(member2);

        // Example of checking out and checking in books
        library.checkoutBook(book1, member1);
        library.checkoutBook(book2, member2);
        library.checkinBook(book1);
        library.checkoutBook(book1, member2);
    }
}
