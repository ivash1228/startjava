package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {

    private Book[] books;
    private int countBooks;

    public Bookshelf() {
        books = new Book[10];
    }

    public void addBook(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public void giveawayBook(Book book) {
        boolean bookFound = false;
        for(int i = 0; i < books.length; i++) {
            if (books[i] == null
                    || (books[i].getAuthor().equals(book.getAuthor())
                    && books[i].getTitle().equals(book.getTitle())
                    && books[i].getYear().equals(book.getYear()))) {
                moveBooks(i);
                bookFound = true;
                break;
            }
        }
        System.out.println(bookFound ? "Get your book" : "Book is not on the shelf");
    }

    private void moveBooks(int position) {
        books[position] = null;
        int counter = 0;
        for(int i = position + 1; i < books.length; i++) {
            if (books[i] != null) {
                counter++;
            } else break;
            System.arraycopy(books, position + 1, books, position, counter);
            books[counter + 1] = null;
            countBooks--;
            counter = 0;
            }
        }

    public void clearShelf() {
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
            if(books[i] == null) {
                break;
            }
        }
    }

    public void showBooksQuantity() {
        System.out.println("There are " + countBooks + " on the shelf");
    }

    public void showFreeSpace() {
        System.out.println("There are " + (books.length - countBooks) + "spaces left");
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, books.length);
    }
}
