package com.example.devmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void connexion(View v) {
        EditText e = findViewById(R.id.edt_email);
        EditText emdp = findViewById(R.id.edt_mdp);
        if((e.length()!=0) && (emdp.length()!=0)){
            Intent intent = new Intent(MainActivity.this, ListeActivity.class);

            intent.putExtra("user", e.getText().toString());
            startActivity(intent);
        } else Toast.makeText(this, "Tentative de connexion de " + e.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
