package com.example.nyt.ui.books;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import com.example.nyt.Article;
import com.example.nyt.ArticlesAdapter;
import com.example.nyt.FakeDatabase;
import com.example.nyt.R;

public class FragmentBooks extends Fragment {

    ArrayList<Article> articles;

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
        RecyclerView rvArticles = view.findViewById(R.id.recycler);
        //improve scrolling performance
        //rvArticles.setHasFixedSize(true);
        //get all the articles
        articles = FakeBookDatabase.getAllArticles();
        // Create adapter and pass in the articles
        ArticlesAdapter adapter = new ArticlesAdapter(articles);
        // Attach the adapter to the recycler view to populate items
        rvArticles.setAdapter(adapter);
        // Set layout manager to position the items
        rvArticles.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }
}


