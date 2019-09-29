package com.example.nyt.model;

import java.util.ArrayList;

// Pay close attention to how the fields in this class map to the fields of the JSON.
public class TopStoriesResponse {

    // When mapping the fields in this class to the JSON fields, you don't have to map everything.
    // If the JSON contains a field that you won't be using, you can ignore it.
    public String status;
    public String copyright;
    public String section;
    public String last_updated;
    public int num_results;

    // Because "results" in the JSON is an array of objects, I represent it in this class as an
    // ArrayList of Article. Article is another class, which would map to an object inside the array.
    // You can use List, ArrayList, or just an Array.
    //
    // Note that you could also have Article as an inner class, and it would work the same.
    public ArrayList<Article> results;
}
