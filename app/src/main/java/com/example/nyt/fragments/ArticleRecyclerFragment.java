package com.example.nyt.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.nyt.ArticleAdapter;
import com.example.nyt.FakeAPI;
import com.example.nyt.FakeDatabase;
import com.example.nyt.activities.MainActivity;
import com.example.nyt.R;
import com.example.nyt.model.TopStoriesResponse;
import com.google.gson.Gson;

import java.util.ArrayList;


public class ArticleRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

    public ArticleRecyclerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_article_recycler, container, false);
        recyclerView = view.findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // REFER to the comments in BookRecyclerAdapter

        final ArticleAdapter articleAdapter = new ArticleAdapter();
        final RequestQueue requestQueue =  Volley.newRequestQueue(getActivity());
        String url = "https://api.nytimes.com/svc/mostpopular/v2/viewed/1.json?api-key="+getString(R.string.nyt_api_key);

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                TopStoriesResponse topStoriesResponse = gson.fromJson(response, TopStoriesResponse.class);
                articleAdapter.setData(topStoriesResponse.results);
                FakeDatabase.saveArticlesToFakeDatabase(topStoriesResponse.results);
                recyclerView.setAdapter(articleAdapter);
                requestQueue.stop();
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(),"The request failed: " + error.getMessage(), Toast.LENGTH_SHORT).show();
                requestQueue.stop();
            }
        };

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, responseListener,
                errorListener);
        requestQueue.add(stringRequest);

        return view;
    }

    // This is just an example of a way that the Fragment can communicate with the parent Activity.
    // Specifically, this is using a method belonging to the parent.
    @Override
    public void onResume() {
        super.onResume();
        MainActivity parent = (MainActivity) getActivity();
        parent.showCoolMessage("cool (from ArticleRecyclerFragment onResume)");
    }
}
