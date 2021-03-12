package com.example.nav.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nav.R;

public class Registration extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_registration, container, false);

        Button regButton = v.findViewById(R.id.reg_button);
        Button moveAuthFragmentButton = v.findViewById(R.id.move_auth_fragment_button);

        regButton.setOnClickListener(v1 -> {
            NavHostFragment.findNavController(Registration.this).navigate(R.id.action_registration_to_home2);
        });

        moveAuthFragmentButton.setOnClickListener(v1 -> {
            NavHostFragment.findNavController(Registration.this).navigate(R.id.action_registration_to_auth);
        });

        return v;
    }
}