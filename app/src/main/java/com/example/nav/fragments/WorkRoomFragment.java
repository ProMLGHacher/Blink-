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

public class WorkRoomFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_work_room, container, false);

        Button button = root.findViewById(R.id.buttonrfsgbdgf);

        EditText editTextTextPersonName3 = root.findViewById(R.id.editTextTextPersonName3);

        button.setOnClickListener(v -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.sharedPreferences(editTextTextPersonName3.getText().toString(), "AuthName");
            NavHostFragment.findNavController(WorkRoomFragment.this).navigate(R.id.action_workRoomFragment_to_otherInfoFragment);
        });

        return root;
    }
}