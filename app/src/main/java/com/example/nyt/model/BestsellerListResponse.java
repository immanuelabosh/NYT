package com.example.nyt.model;

import java.util.ArrayList;

public class BestsellerListResponse {
    public String status;
    public String copyright;
    public String section;
    public String last_updated;
    public int num_results;


    // Be aware that the results field in this case is an object that represents the bestseller list.
    // This should be represented as another Java class, and the actual list of Book would be
    // contained in this other class.
    public BestsellerList results;

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getSection() {
        return section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public int getNum_results() {
        return num_results;
    }

    public BestsellerList getResults() {
        return results;
    }
}
