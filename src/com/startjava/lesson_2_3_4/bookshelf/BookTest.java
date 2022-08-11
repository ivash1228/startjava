package com.startjava.lesson_2_3_4.bookshelf;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Choose from menu: ");
            try {
                chooseMenuItem(scanner.nextInt(), shelf);
            } catch(InputMismatchException e) {
                System.out.println("Your input is incorrect");
                scanner.next();
            }
            visualizeShelf(shelf.getAllBooks());
        } while(true);
    }

    private static void showMenu() {
        System.out.println("""
               1. Add book
               2. Get Book
               3. Get all books
               4. Get books QTY
               5. Get free space QTY
               6. Terminate the program
               """);
    }

    private static void chooseMenuItem(int num, Bookshelf bookshelf) {
        switch(num) {
            case 1 -> bookshelf.addBook(requestBook());
            case 2 -> bookshelf.giveawayBook(requestBook());
            case 3 -> bookshelf.clearShelf();
            case 4 -> bookshelf.showBooksQuantity();
            case 5 -> bookshelf.showFreeSpace();
            case 6 -> System.exit(0);
        }
    }

    private static void visualizeShelf(Book[] books) {
        for(int i = 0; i < 10; i++) {
            if (books[i] == null) {
                System.out.print("[]");
            } else System.out.print("[K]");
        }
        System.out.println();
        for(Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public static Book requestBook() {
        String[] info = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put author");
        info[0] = scanner.nextLine();
        System.out.println("Put title");
        info[1] = scanner.nextLine();
        System.out.println("Put year");
        String year = scanner.nextLine().trim();
        while (!year.matches("[0-9][0-9][0-9][0-9]")) {
            System.out.println("Year can be only 4 digit number");
            System.out.println("Put year");
            year = scanner.next().trim();
        }
        info[2] = year;
        return new Book(info[0], info[1], info[2]);
    }
}
