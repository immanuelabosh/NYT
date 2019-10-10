package com.example.nyt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Article> articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvArticles = findViewById(R.id.recycler);
        //improve scrolling performance
        rvArticles.setHasFixedSize(true);
        //get all the articles
        articles = FakeDatabase.getAllArticles();
        // Create adapter and pass in the articles
        ArticlesAdapter adapter = new ArticlesAdapter(articles);
        // Attach the adapter to the recycler view to populate items
        rvArticles.setAdapter(adapter);
        // Set layout manager to position the items
        rvArticles.setLayoutManager(new LinearLayoutManager(this));

        //set the article images
        // (i could do this in fake database but i want to leave it untouched for now)
        articles.get(0).setImageDrawableId(R.drawable.russians_diamonds);
        articles.get(1).setImageDrawableId(R.drawable.france_mourns);
        articles.get(2).setImageDrawableId(R.drawable.biden);
        articles.get(3).setImageDrawableId(R.drawable.artist_north_pole);
        articles.get(4).setImageDrawableId(R.drawable.inmates_escape);
        articles.get(5).setImageDrawableId(R.drawable.post_happiness_world);


    }
}


