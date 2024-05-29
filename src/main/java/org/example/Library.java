package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    Book book1 = new Book("Hallo Welt", "Hans Müller", "123456789");
    Book book2 = new Book("Wunderbare Welt", "Hannelore Schmidt", "987654321");
    Book book3 = new Book("Wunderbare Erde", "Janis Schmidt", "9876543345");

    private List<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library contains:\n");
        for (Book book : books) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }
}
