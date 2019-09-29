package com.example.nyt.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.nyt.ArticleAdapter;
import com.example.nyt.BookAdapter;
import com.example.nyt.FakeAPI;
import com.example.nyt.FakeDatabase;
import com.example.nyt.R;
import com.example.nyt.model.BestsellerList;
import com.example.nyt.model.BestsellerListResponse;
import com.example.nyt.model.Book;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookRecyclerFragment extends Fragment {
    private RecyclerView recyclerView;


    public BookRecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_book_recycler, container, false);
        recyclerView = view.findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        final BookAdapter bookAdapter = new BookAdapter();

        // Start Volley stuff
        // 1. Create request queue.
        // 2. Create response listener and error listener
        // 3. Create Request object using url, response listener, error listener.
        // 4. Put Request object into request queue.

        final RequestQueue requestQueue =  Volley.newRequestQueue(getActivity());

        // To get the url, you need to read the documentation of the API.
        // Figure out what data you want, and they should tell you how to get the correct URL.
        // Also in this case, I've put my API key in an XML file (secrets.xml).
        // This helps me easily reuse the API key by calling getString.
        // It also makes it easy for me to hide the API key if I want to share my code
        // (I can just ignore the secrets.xml file instead of having to go into all the files and delete it.)
        // You will need to go into the file and put in your own API key first.
        String url = "https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key="+getString(R.string.nyt_api_key);

        // Response.Listener<String>. We define what to do after a response is received.
        // Response.Listener means that it is referring to the inner class Listener, which has been
        // defined inside another class Response.
        // The <String> part corresponds to the type of the response.
        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // This method, onResponse, is executed after a response is received for your request.
                // Logically, this means it is the only place where you are guarantee that a response
                // has been received.
                // So, you must write all the code that depends on having a response here.
                // For example, converting the response to objects using Gson.

                Gson gson = new Gson();
                BestsellerListResponse bestsellerListResponse = gson.fromJson(response, BestsellerListResponse.class);
                BestsellerList bestsellerList = bestsellerListResponse.getResults();

                List<Book> bestsellers = bestsellerList.getBooks();

                // I save my results to the database so I can retrieve it later in my other activities.
                FakeDatabase.saveBooksToFakeDatabase(bestsellers);

                bookAdapter.setData(bestsellers);
                recyclerView.setAdapter(bookAdapter);

                // It is a good idea to include this line after we are done with the requestQueue.
                // It just closes the queue.
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

        // This line simply adds the request to the queue. It's not necessarily going to be executed
        // immediately (there could possibly be other requests in the queue).
        // Also, because requests to the internet take time, we cannot guarantee that the response
        // will be received right away.
        // We are NOT GUARANTEED to have a response after this line.
        // That is the purpose of the onResponse method in the response listener.
        requestQueue.add(stringRequest);

        return view;
    }

}
