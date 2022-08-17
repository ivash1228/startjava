package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private Book[] books;
    private int countBooks;

    public Bookshelf() {
        books = new Book[10];
    }

    public boolean addBook(Book book) {
        if (getFreeSpace() > 0) {
            books[countBooks] = book;
            countBooks++;
            return true;
        }
        return false;
    }

    public String findBook(String title) {
        for(int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i].getAuthor() + " " + books[i].getTitle() + " " + books[i].getYear();
            }
        }
        return "Book not found";
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
        System.arraycopy(books, position + 1, books, position, countBooks - position - 1);
        countBooks--;
        books[countBooks] = null;
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
}
