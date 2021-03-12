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

public class OtherInfoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_other_info, container, false);

        Button next = root.findViewById(R.id.next);
        Button skip = root.findViewById(R.id.skip);

        EditText editTextTextPersonName4 = root.findViewById(R.id.editTextTextPersonName4);

        next.setOnClickListener(v -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.sharedPreferences(editTextTextPersonName4.getText().toString(), "OtherInfoFragment");
            NavHostFragment.findNavController(OtherInfoFragment.this).navigate(R.id.action_otherInfoFragment_to_home2);
        });

        skip.setOnClickListener(v -> {
            NavHostFragment.findNavController(OtherInfoFragment.this).navigate(R.id.action_otherInfoFragment_to_home2);
        });

        return root;
    }
}