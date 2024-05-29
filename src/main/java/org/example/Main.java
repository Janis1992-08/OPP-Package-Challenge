package org.example;



public class Main {
    public static void main(String[] args) {


        Library library = new Library();


        library.addBook(library.book1);
        library.addBook(library.book2);




        System.out.println(library);


        library.removeBook("987654321");

        library.addBook(library.book3);


        System.out.println(library);
    }
    }

