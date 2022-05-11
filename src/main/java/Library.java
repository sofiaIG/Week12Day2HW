import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(Integer capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int booksStored(){
        return books.size();
    }

    public void addBook(Book book) {
        int booksStored = booksStored();
        if (booksStored < capacity) {
            books.add(book);
        }
    }
}
