package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in);
        do {
            BookTest.visualizeShelf(shelf.getAllBooks());
            showMenu();
            System.out.println("Choose from menu");
            shelf.getFromMenu(scanner.nextInt());
            BookTest.visualizeShelf(shelf.getAllBooks());
            System.out.println("Do you want something else?");
            } while (checkResponse(scanner));
    }

    public static void visualizeShelf(Book[] books) {
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

    public static void showMenu() {
        String name = """
               1. Add book
               2. Get Book
               3. Get all books
               4. Get books QTY
               5. Get free space QTY
                """;
        System.out.println(name);
    }

    public static boolean checkResponse(Scanner scanner) {
        scanner.nextLine();
        String input = scanner.nextLine();
        if (input.equals("yes")) {
            return true;
        } else if (input.equals("no")) return false;
        else {
            System.out.println("Your response is incorrect, put yes or no");
            return checkResponse(scanner);
        }
    }
}
