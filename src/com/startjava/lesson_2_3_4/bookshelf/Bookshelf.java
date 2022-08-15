package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

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


    public Book search(String title) {
        for(int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println("Here is your book: " + books[i]);
                return books[i];
            }
        }
        System.out.println("Book is not on the shelf");
        return null;
    }

    public void removeBook(String title) {
        boolean bookFound = false;
        for(int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
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
        for (int i = position + 1; i < books.length; i++) {
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
        for (int i = 0; i < countBooks; i++) {
            books[i] = null;
        }
        countBooks = 0;
    }

    public int getBooksQuantity() {
        return countBooks;
    }

    public int getFreeSpace() {
        return books.length - countBooks;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public void showAll() {
        for (int i = 0; i < countBooks; i++) {
            System.out.println(books[i]);
        }
    }
}
