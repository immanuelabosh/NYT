package com.example.nyt.ui.books;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.nyt.DocumentAdapter;
import com.example.nyt.FakeAPI;
import com.example.nyt.R;
import com.example.nyt.model.NYTArticleResponse;
import com.example.nyt.model.VolleyJsonGetter;

import java.util.ArrayList;

public class FragmentBooks extends Fragment {


    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_books, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        RecyclerView rvBooks = view.findViewById(R.id.recycler);
        //improve scrolling performance
        rvBooks.setHasFixedSize(true);
        //get all the books
        NYTArticleResponse NYTResponse = NYTArticleResponse.parseJSON(FakeAPI.getMostViewedStoriesJsonString());
        // Create adapter and pass in the articles
        DocumentAdapter adapter = new DocumentAdapter(NYTResponse.getArticleList());
        // Attach the adapter to the recycler view to populate items
        rvBooks.setAdapter(adapter);
        // Set layout manager to position the items
        rvBooks.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }
}


