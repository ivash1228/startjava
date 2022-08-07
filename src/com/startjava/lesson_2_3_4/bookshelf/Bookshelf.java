package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {

    private Book[] books;
    private int booksCounter;

    public Bookshelf() {
        books = new Book[10];
    }

    public void getFromMenu(int num) {
        switch(num) {
            case 1 -> addBook();
            case 2 -> getBook();
            case 3 -> giveAwayAllBooks();
            case 4 -> getBooksQuantity();
            case 5 -> getFreeSpace();
        }
    }

    public void addBook() {
        books[booksCounter] = setBookFromInput();
        booksCounter++;
    }

    public void getBook() {
        Book desiredBook = setBookFromInput();
        for(int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
            if (books[i].getAuthor().equals(desiredBook.getAuthor())
                    && books[i].getTitle().equals(desiredBook.getTitle())
                    && books[i].getYear().equals(desiredBook.getYear())) {
                removeBook(i);
                System.out.println("Get your book");
                break;
            }
        } System.out.println("Book is not on the shelf");
    }

    public void removeBook(int bookSpot){
        books[bookSpot] = null;
        int srcPos = bookSpot + 1;
        System.arraycopy(books, srcPos, books, bookSpot, books.length - 1 - bookSpot);
        booksCounter--;
    }

    public Book[] getAllBooks() {
        return books;
    }

    public void giveAwayAllBooks() {
        Arrays.fill(books, null);
    }

    public void getBooksQuantity() {
        System.out.println("There are " + booksCounter + " on the shelf");
    }

    public void getFreeSpace() {
        System.out.println("There are " + (books.length - booksCounter) + "spaces left");
    }

    public Book setBookFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put author");
        String author = scanner.nextLine();
        System.out.println("Put title");
        String title = scanner.nextLine();
        System.out.println("Put year");
        String year = scanner.nextLine().trim();
        while (!year.matches("[0-9][0-9][0-9][0-9]")) {
            System.out.println("Year can be only 4 digit number");
            System.out.println("Put year");
            year = scanner.nextLine().trim();
        }
        return new Book(author, title, year);
    }
}
