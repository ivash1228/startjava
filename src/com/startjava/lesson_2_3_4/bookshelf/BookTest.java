package com.startjava.lesson_2_3_4.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in, "cp866");
        do {
            showMenu();
            visualizeShelf(shelf.getAllBooks());
            System.out.println("Choose from menu: ");
            try {
                item(scanner.nextInt(), shelf);
            } catch(InputMismatchException e) {
                System.out.println("Your input is incorrect");
                scanner.next();
            }

        } while(true);
    }

    private static void showMenu() {
        System.out.print("""
               1. Add book
               2. Remove Book
               3. Search Book
               4. Get books QTY
               5. Get free space QTY
               6. Get all books info
               7  Clear shelf
               8. Terminate the program
               """);
    }

    private static void item(int num, Bookshelf bookshelf) {
        switch(num) {
            case 1 -> bookshelf.addBook(createBook());
            case 2 -> bookshelf.removeBook(retrieveTitle());
            case 3 -> bookshelf.search(retrieveTitle());
            case 4 -> bookshelf.getBooksQuantity();
            case 5 -> bookshelf.getFreeSpace();
            case 6 -> bookshelf.showAll();
            case 7 -> bookshelf.clearShelf();
            case 8 -> System.exit(0);
        }
    }

    private static void visualizeShelf(Book[] books) {
        for(int i = 0; i < books.length; i++) {
            System.out.print((books[i] != null) ? "[K]" : "[]");
        }
        System.out.println();
    }

    private static Book createBook() {
        String[] info = new String[3];
        info[0] = retrieveAuthor();
        info[1] = retrieveTitle();
        info[2] = retrieveYear();
        return new Book(info[0], info[1], info[2]);
    }

    private static String retrieveAuthor() {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.print("Put author ");
        return scanner.next();
    }

    private static String retrieveTitle() {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.print("Put title ");
        return scanner.next();
    }

    private static String retrieveYear() {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.print("Put year ");
        String year = scanner.next().trim();
        while (!year.matches("[0-9][0-9][0-9][0-9]")) {
            System.out.println("Year can be only 4 digit number");
            System.out.print("Put year  ");
            year = scanner.next().trim();
        }
        return year;
    }


}
