package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
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
