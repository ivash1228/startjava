package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookTest {

    private static Scanner scanner = new Scanner(System.in, "cp866");

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        int answer = 0;

        do {
            if (answer != 8) {
                showMenu();
                visualizeShelf(shelf.getAllBooks());
                System.out.println("Choose from menu: ");
                try {
                    answer = scanner.nextInt();
                    inputMenuItem(answer, shelf);
                } catch(InputMismatchException e) {
                    System.out.println("Your input is incorrect");
                    scanner.next();
                }
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

    private static void visualizeShelf(Book[] books) {
        for(int i = 0; i < books.length; i++) {
            System.out.print((books[i] != null) ? "[K]" : "[]");
        }
        System.out.println();
    }

    private static void inputMenuItem(int menuItem, Bookshelf bookshelf) {
        switch(menuItem) {
            case 1 -> System.out.println(bookshelf.addBook(createBook()) ? "Book added to the shelf" : "Shelf is full");
            case 2 -> bookshelf.removeBook(inputTitle());
            case 3 -> System.out.println(bookshelf.findBook(inputTitle()));
            case 4 -> System.out.println("Books on the shelf: " + bookshelf.getBooksQuantity());
            case 5 -> System.out.println("Free spots: " + bookshelf.getFreeSpace());
            case 6 -> printAll(bookshelf.getAllBooks());
            case 7 -> bookshelf.clearShelf();
            case 8 -> System.exit(0);
        }
    }

    private static Book createBook() {
        String[] info = new String[3];
        info[0] = inputAuthor();
        info[1] = inputTitle();
        info[2] = inputYear();
        return new Book(info[0], info[1], info[2]);
    }

    private static String inputAuthor() {
        System.out.print("Put author ");
        return scanner.next();
    }

    private static String inputTitle() {
        System.out.print("Put title ");
        return scanner.next();
    }

    private static String inputYear() {
        System.out.print("Put year ");
        String year = scanner.next().trim();
        while (!year.matches("[0-9][0-9][0-9][0-9]")) {
            System.out.println("Year can be only 4 digit number");
            System.out.print("Put year  ");
            year = scanner.next().trim();
        }
        return year;
    }

    private static void printAll(Book[] allBooks) {
        for (Book book : allBooks) {
            if (book == null) {
                break;
            }
            System.out.println(book);
        }
    }
}
