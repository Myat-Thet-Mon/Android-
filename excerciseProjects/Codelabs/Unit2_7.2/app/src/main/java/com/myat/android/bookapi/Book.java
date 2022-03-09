package com.myat.android.bookapi;

public class Book {
    private String imageUrl;
    private String title;
    private String author ;
    private String date;

    public Book(String url, String title, String author, String date) {
        this.imageUrl = url;
        this.title = title;
        this.author = author;
        this.date=date;
    }

    public String getImageUrl() {
        return imageUrl;
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
