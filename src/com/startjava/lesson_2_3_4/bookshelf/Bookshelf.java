package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {

    private Book[] books;
    private int countBooks;

    public Bookshelf() {
        books = new Book[10];
    }

    public void addBook() {
        books[countBooks] = setBook();
        countBooks++;
    }

    public void giveawayBook() {
        Book desiredBook = setBook();
        for(int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
            if (books[i].getAuthor().equals(desiredBook.getAuthor())
                    && books[i].getTitle().equals(desiredBook.getTitle())
                    && books[i].getYear().equals(desiredBook.getYear())) {
                moveBooks(i);
                System.out.println("Get your book");
                break;
            }
        } System.out.println("Book is not on the shelf");
    }

    private void moveBooks(int position) {
        books[position] = null;
        Book[] copy = getAllBooks();
        int srcPos = 0;
        int destPos = 0;
        int elementNums = 0;

        for(int i = 0; i < copy.length; i++) {
            if (copy[i] == null) {
                srcPos++;
                continue;
            } else {
                while (copy[i] != null) {
                    elementNums++;
                    i++;
                }
                System.arraycopy(copy, srcPos, books, destPos, elementNums);
                countBooks--;
            }
        }
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public void clearShelf() {
        Arrays.fill(books, null);
    }

    public void showBooksQuantity() {
        System.out.println("There are " + countBooks + " on the shelf");
    }

    public void showFreeSpace() {
        System.out.println("There are " + (books.length - countBooks) + "spaces left");
    }

    private Book setBook() {
        String info[] = BookTest.putBookInfoFromInput();
        return new Book(info[0], info[1], info[2]);
    }

    public void terminate() {
        System.exit(0);
    }

}
