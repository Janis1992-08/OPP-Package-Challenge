package org.example;



public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Hallo Welt", "Hans Müller", "123456789");
        Book book2 = new Book("Wunderbare Welt", "Hannelore Schmidt", "987654321");

        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2);



        System.out.println(library);


        library.removeBook("987654321");


        System.out.println(library);
    }
    }

