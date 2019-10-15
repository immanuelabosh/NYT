package com.example.nyt;

import java.io.Serializable;

/***
 * Model class for news articles. This should be 100% familiar to you.
 */
public class Article implements Serializable {

    // unique identifier of an article
    private int articleID;

    // Title of the article
    private String headline;
    // Name of the author
    private String author;
    // Short text to be displayed on main page
    private String summary;
    // Full text of the article
    private String content;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;


    public Article(int articleID, String headline, String author, String summary, String content, int imageDrawableId) {
        this.articleID = articleID;
        this.headline = headline;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.imageDrawableId = imageDrawableId;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
