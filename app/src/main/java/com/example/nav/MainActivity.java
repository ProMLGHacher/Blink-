package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String APP_PREFERENCES = "mysettings";
    SharedPreferences mSettings;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSettings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
        mSettings.edit().apply();
    }

    public void sharedPreferences(String content, String name) {
        SharedPreferences.Editor editor = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).edit();
        editor.putString(name, content);
        editor.apply();
    }
}