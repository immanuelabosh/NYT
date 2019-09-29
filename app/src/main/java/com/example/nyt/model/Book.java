package com.example.nyt.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Book {

    // ISBN can be our ID for books (we use isbn13 instead of isbn10)
    @SerializedName("primary_isbn13")
    private long isbn;

    private int rank;
    private String description;

    private String title;
    private String author;

    @SerializedName("book_image")
    private String bookImage;

    @SerializedName("buy_links")
    private List<BuyLink> buyLinks;

    public long getIsbn() {
        return isbn;
    }

    public int getRank() {
        return rank;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookImage() {
        return bookImage;
    }

    public List<BuyLink> getBuyLinks() {
        return buyLinks;
    }

    // Here I decide to write BuyLink as an inner class rather than in a separate file, because
    // it's very unlikely that BuyLink will be important anywhere else. It will always be part of a
    // book, and only part of a book.
    public class BuyLink {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }
    }
}