package com.example.nyt.model;

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

    public List<ArticleModel> getArticles() {
        return results;
    }

    public static NYTArticleResponse parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        NYTArticleResponse nytArticleResponse = gson.fromJson(response, NYTArticleResponse.class);
        return nytArticleResponse;
    }

}
