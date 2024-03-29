package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button getJoke = root.findViewById(R.id.bt_tell_a_joke);
        getJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tellJoke(v);
            }
        });

        return root;
    }

    public void tellJoke(View view) {
        Context context = view.getContext();
        if (ConnectivityChecker.isConnected(context)) {
            new EndpointsAsyncTask().execute(context);
        } else {
            Toast.makeText(context, getString(R.string.no_connection_error),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
