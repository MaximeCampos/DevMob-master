package com.example.devmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListeActivity extends AppCompatActivity {

    public String utilisateur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);

        this.utilisateur=this.getIntent().getStringExtra("user");

        TextView bvn2 = findViewById(R.id.bvn2);
        bvn2.setText(String.format(
                                    getString(R.string.bvn2),
                                    this.utilisateur
                )
        );
    }
}
