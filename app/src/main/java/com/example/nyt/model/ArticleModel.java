package com.example.nyt.model;

import java.util.List;

import com.example.nyt.Article;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArticleModel {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("byline")
    @Expose
    private String byline;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("abstract")
    @Expose
    private String _abstract;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("multimedia")
    @Expose
    private List<Multimedia> multimedia = null;

    public Article getArticleObject(){
        return new Article(
                this.getId(),
                this.getTitle(),
                this.getByline(),
                this.getAbstract(),
                this.getUrl(),
                this.getPublishedDate(),
                this.getMedia().get(this.getMedia().size() - 1).getUrl()
        );
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Multimedia> getMedia() {
        return multimedia;
    }

    public void setMedia(List<Multimedia> media) {
        this.multimedia = media;
    }

}
