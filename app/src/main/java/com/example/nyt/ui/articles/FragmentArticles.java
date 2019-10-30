package com.example.nyt.ui.articles;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.fragment.app.Fragment;

import com.example.nyt.DocumentAdapter;
import com.example.nyt.FakeAPI;
import com.example.nyt.R;
import com.example.nyt.model.NYTArticleResponse;
import com.example.nyt.model.VolleyJsonGetter;

public class FragmentArticles extends Fragment {


    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_articles, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        RecyclerView rvArticles = view.findViewById(R.id.recycler);
        //improve scrolling performance
        rvArticles.setHasFixedSize(true);
        //get all the articles
        String url = "https://api.nytimes.com/svc/topstories/v2/technology.json?api-key=" + getContext().getString(R.string.key);
        String json = VolleyJsonGetter.getJsonString(url, getContext());
        if (json!=null) {
            NYTArticleResponse NYTResponse = NYTArticleResponse.parseJSON(json);
            // Create adapter and pass in the articles
            DocumentAdapter adapter = new DocumentAdapter(NYTResponse.getArticleList());
            // Attach the adapter to the recycler view to populate items
            rvArticles.setAdapter(adapter);
            // Set layout manager to position the items
            rvArticles.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
    }
}


