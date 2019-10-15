package com.example.nyt;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.nyt.ui.articles.FragmentArticles;
import com.example.nyt.ui.books.FragmentBooks;
import com.example.nyt.ui.profile.FragmentProfile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //this is here so i can use it in my onBackPress method
    BottomNavigationView navView;
    //this is here to preserve states between fragment transitions even though material design
    // guidelines say they should reset when switched away
    Fragment fragmentArticles = new FragmentArticles();
    Fragment fragmentBooks = new FragmentBooks();
    Fragment fragmentProfile = new FragmentProfile();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navView = findViewById(R.id.nav_view);

        //replace the first fragment, without this you'd be staring at a blank screen
        openFragment(fragmentArticles);

        //when navView button is pressed
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //check which button is pressed then open that fragment
                switch (item.getItemId()) {
                    case R.id.navigation_articles:
                        openFragment(fragmentArticles);
                        break;
                    case R.id.navigation_books:
                        openFragment(fragmentBooks);
                        break;
                    case R.id.navigation_profile:
                        openFragment(fragmentProfile);
                        break;
                }
                return true;
            }
        });
    }

    //simple method that lets me reuse fragment transaction code
    private void openFragment(Fragment fragment) {
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.fragment_placeholder, fragment);
        // or ft.add(R.id.your_placeholder, new FooFragment());
        //set transition between fragments
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        //ft.addToBackStack(null);
        // this would record fragment transitions and move back through them as back is pressed
        // Complete the changes added above
        ft.commit();
    }

    //I'm using this instead of a backstack because I don't need to go very far back and
    //the backstack can pop the first fragment replacement leaving a blank screen
    // which I want to avoid
    @Override
    public void onBackPressed() {
        //if articles isnt currently selected
        if (R.id.navigation_articles != navView.getSelectedItemId()) {
            // select articles
            navView.setSelectedItemId(R.id.navigation_articles);
        } else {
            super.onBackPressed();
        }
    }
}


