import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book b : books) {
                System.out.println("Title: " + b.getTitle() +
                                   ", Author: " + b.getAuthor());
            }
        }
    }
}

public class li {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(new Book("Java Basics", "James Gosling"));
        lib.addBook(new Book("Python Guide", "Guido van Rossum"));

        lib.displayBooks();
    }
}