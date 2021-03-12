package com.example.nav.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.nav.MainActivity;
import com.example.nav.R;

public class Auth extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_auth, container, false);

        Button authButton = v.findViewById(R.id.auth_button);
        Button moveToRegButton = v.findViewById(R.id.button2);

        EditText editTextTextPersonName = v.findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPassword = v.findViewById(R.id.editTextTextPassword);


        authButton.setOnClickListener(v1 -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.sharedPreferences(editTextTextPersonName.getText().toString(), "AuthName");
            mainActivity.sharedPreferences(editTextTextPassword.getText().toString(), "AuthLastName");

            NavHostFragment.findNavController(Auth.this).navigate(R.id.action_auth_to_sexFragment);
        });

        moveToRegButton.setOnClickListener(v1 -> {
            NavHostFragment.findNavController(Auth.this).navigate(R.id.action_auth_to_registration);
        });

        return v;
    }
}