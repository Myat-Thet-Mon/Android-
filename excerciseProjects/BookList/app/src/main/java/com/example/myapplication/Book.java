package com.example.myapplication;

public class Book {
    private String url;
    private String title;
    private String author;
    private String date;

    public Book(String url, String title, String author, String date) {
        this.url = url;
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }
}
