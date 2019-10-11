package com.example.nyt;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedDocumentView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_document_view);

        //get the serialized article object
        Intent intent = getIntent();
        Article articleObject = (Article)intent.getSerializableExtra("articleObject");

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
