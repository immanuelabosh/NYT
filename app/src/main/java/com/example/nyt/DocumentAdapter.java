package com.example.nyt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DocumentAdapter extends RecyclerView.Adapter<DocumentAdapter.ViewHolder> {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {

        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView headline;
        public TextView summary;
        public ImageView bookmarkButton;
        public ImageView shareButton;
        public ImageView newsPhoto;
        boolean bookmarkButtonState = false;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(final View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            headline = itemView.findViewById(R.id.newsHeadline);
            summary = itemView.findViewById(R.id.newsDetails);
            bookmarkButton = itemView.findViewById(R.id.newsSaveButton);
            shareButton = itemView.findViewById(R.id.newsShareButton);
            newsPhoto = itemView.findViewById(R.id.newsPhoto);

        }
    }

    private List<Article> mArticle;

    public DocumentAdapter(List<Article> articles) {
        mArticle = articles;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public DocumentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View articleView = inflater.inflate(R.layout.article, parent, false);

        // Return a new holder instance
        return new ViewHolder(articleView);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(final DocumentAdapter.ViewHolder viewHolder, final int position) {
        // Get the data model based on position
        final Article article = mArticle.get(position);

        //get the context
        final Context context = viewHolder.itemView.getContext();

        // Set item views based on your views and data model
        viewHolder.headline.setText(article.getHeadline());
        viewHolder.summary.setText(article.getSummary());
        viewHolder.newsPhoto.setImageResource(article.getImageDrawableId());

        //init the buttons
        viewHolder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Check out this Article " + article.getHeadline());
                context.startActivity(intent);
            }
        });

        final boolean[] buttonState = {viewHolder.bookmarkButtonState};
        final ImageView bookmark = viewHolder.bookmarkButton;
        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Click " + position + " Registered", Toast.LENGTH_SHORT).show();
                if(!buttonState[0]) {
                    bookmark.setImageResource(R.drawable.ic_bookmark_black_24dp);
                } else {
                    bookmark.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
                }
                buttonState[0] = !buttonState[0];
            }
        });

        // Attach a click listener to the entire row view
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go to detailed article page when article is clicked
                Intent intent = new Intent(context, DetailedDocumentView.class);
                intent.putExtra("articleObject", article);
                //animate the common elements (i.e. image and title)
                Pair<View, String> p1 = Pair.create((View)viewHolder.newsPhoto, "imageMain");
                Pair<View, String> p2 = Pair.create((View)viewHolder.headline, "title");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation((Activity)context, p1, p2);
                //switch activity
                context.startActivity(intent,options.toBundle());

                //this is supposed to do a crossfade but i think makescenetransition is overriding it
                //((Activity)context).overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });



    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mArticle.size();
    }

}
