package com.example.nyt.model;

import com.example.nyt.Article;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class NYTArticleResponse {

    List<ArticleModel> results;

    // public constructor is necessary for collections
    public NYTArticleResponse() {
        results = new ArrayList<ArticleModel>();
    }

    public List<ArticleModel> getArticleModels() {
        return results;
    }

    public static NYTArticleResponse parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        NYTArticleResponse nytArticleResponse = gson.fromJson(response, NYTArticleResponse.class);
        return nytArticleResponse;
    }
    public List<Article> getArticleList() {
        ArrayList<Article> articles = new ArrayList<>();
        for (ArticleModel object: this.getArticleModels()){
            articles.add(object.getArticleObject());
        }
        return articles;
    }

}
