package com.example.nyt; // <============= CHANGE ME

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/***
 * Model class for news articles. This should be 100% familiar to you.
 */
public class Article implements Serializable {

    // unique identifier of an article
    private Long id;

    // Title of the article
    private String title;
    // Name of the author
    private String byline;
    // Short text to be displayed on main page
    private String summary;
    // Full text of the article
    private String url;

    //data published
    private String published_date;

    // Resource ID of associated image (e.g. R.drawable.my_image)
    private String imageDrawableURL;


    public Article(Long articleID, String headline, String author, String summary, String content,String published_date, String imageDrawableURL) {
        this.id = articleID;
        this.title = headline;
        this.byline = author;
        this.summary = summary;
        this.url = content;
        this.published_date = published_date;
        this.imageDrawableURL = imageDrawableURL;
    }

    public Long getArticleID() {
        return id;
    }

    public void setArticleID(Long articleID) {
        this.id = articleID;
    }


    public String getHeadline() {
        return title;
    }

    public void setHeadline(String headline) {
        this.title = headline;
    }

    public String getAuthor() {
        return byline;
    }

    public void setAuthor(String author) {
        this.byline = author;
    }

    public String getSummary() { return summary; }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return url;
    }

    public void setContent(String content) {
        this.url = content;
    }

    public String getImageDrawableURL() {
        return imageDrawableURL;
    }

    public void setImageDrawableURL(String imageDrawableURL) {
        this.imageDrawableURL = imageDrawableURL;
    }

    public String getPublished_date() { return published_date;}

    public void setPublished_date(String published_date) {this.published_date = published_date;}

}
