package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Choose from menu: ");
            chooseFromMenu(scanner.nextInt(), shelf);
            visualizeShelf(shelf.getAllBooks());
            System.out.println("Do you want something else? [y/n]");
        } while (checkResponse(scanner));
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

    private static void chooseFromMenu(int num, Bookshelf bookshelf) {

        switch(num) {
            case 1 -> bookshelf.addBook();
            case 2 -> bookshelf.giveawayBook();
            case 3 -> bookshelf.clearShelf();
            case 4 -> bookshelf.showBooksQuantity();
            case 5 -> bookshelf.showFreeSpace();
            case 6 -> bookshelf.terminate();
        }
    }

    private static boolean checkResponse(Scanner scanner) {
        String input = scanner.next();
        if (input.equals("y")) {
            return true;
        } else if (input.equals("n")) return false;
        else {
            System.out.println("Your response is incorrect, put y or n");
            return checkResponse(scanner);
        }
    }

    public static String[] putBookInfoFromInput() {
        String[] bookInfo = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put author");
        bookInfo[0] = scanner.nextLine();
        System.out.println("Put title");
        bookInfo[1] = scanner.nextLine();
        System.out.println("Put year");
        String year = scanner.nextLine().trim();
        while (!year.matches("[0-9][0-9][0-9][0-9]")) {
            System.out.println("Year can be only 4 digit number");
            System.out.println("Put year");
            year = scanner.next().trim();
        }
        bookInfo[2] = year;
        return bookInfo;
    }
}
