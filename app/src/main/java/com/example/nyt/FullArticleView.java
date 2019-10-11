package com.example.nyt;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FullArticleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_article_view);

        //get the article id
        Intent intent = getIntent();
        int articleID = intent.getIntExtra("ID", 0);

        //get the article using the ID
        Article articleObject = FakeDatabase.getArticleById(articleID);

        TextView headline = findViewById(R.id.headline);
        TextView summary = findViewById(R.id.summary);
        TextView author = findViewById(R.id.author);
        ImageView image = findViewById(R.id.imageView);

        //set the text and images
        headline.setText(articleObject.getHeadline());
        headline.setTextColor(Color.BLACK);
        headline.setTypeface(null, Typeface.BOLD);
        summary.setText(articleObject.getContent());
        author.setText("by " + articleObject.getAuthor());
        image.setImageResource(articleObject.getImageDrawableId());

    }
}
