package com.example.alph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity {

    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recycler = findViewById(R.id.Alphabit_recycler);
        setupSharedPrefs();

        String[] Alphabit = new String[Alpha.alpha.length];
        String[] example = new String[Alpha.alpha.length];

        for(int i = 0; i<Alphabit.length;i++){
            Alphabit[i] = Alpha.alpha[i].getCharacter();
            example[i] = Alpha.alpha[i].getExample();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter adapter = new adapter(Alphabit, example);
        recycler.setAdapter(adapter);
    }
    private void setupSharedPrefs() {
        prefs= PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }


}

