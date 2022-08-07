package com.startjava.lesson_2_3_4.bookshelf;

public class Book {

    private String author;
    private String title;
    private String year;

    public Book(String author, String title, String year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "[" + author + " | " + title + " | " + year + "]";
    }
}
