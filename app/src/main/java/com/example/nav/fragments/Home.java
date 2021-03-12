package com.example.nav.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nav.R;

public class Home extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button button = v.findViewById(R.id.button2678);

        button.setOnClickListener(v1 -> {
            NavHostFragment.findNavController(Home.this).navigate(R.id.action_home2_to_messages);
        });

        return v;
    }
}