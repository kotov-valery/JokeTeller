package org.udacity.jokeactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import org.udacity.jokeactivity.databinding.ActivityJokeBinding;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "org.udacity.jokeactivity.joke";

    ActivityJokeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_joke);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(EXTRA_JOKE)) {
            String joke = intent.getStringExtra(EXTRA_JOKE);
            binding.tvJoke.setText(joke);
        }
    }
}
