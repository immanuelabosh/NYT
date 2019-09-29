package com.example.nyt.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

// Represents one bestseller list of books
public class BestsellerList {

    @SerializedName("list_name")
    private String listName;

    @SerializedName("published_date")
    private String publishedDate;

    // Like with Article, I have put this in its own class rather than an inner class.
    // This is because a Book is conceptually not exclusively belonging to a BestsellerList. I could
    // have a book that's not part of a bestseller list, so it's not accurate to define it as an
    // inner class of BestsellerList.
    private ArrayList<Book> books;


    public String getListName() {
        return listName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
