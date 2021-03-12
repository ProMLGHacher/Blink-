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

public class SexFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_sex, container, false);

        Button button = root.findViewById(R.id.moveOnWorkRoomFragment);

        EditText editTextTextPersonName2 = root.findViewById(R.id.editTextTextPersonName2);

        button.setOnClickListener(v -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.sharedPreferences(editTextTextPersonName2.getText().toString(), "Sex");
            NavHostFragment.findNavController(SexFragment.this).navigate(R.id.action_sexFragment_to_workRoomFragment);
        });

        return root;
    }
}