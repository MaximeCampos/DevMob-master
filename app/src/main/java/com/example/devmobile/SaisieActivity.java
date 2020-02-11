package com.example.devmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SaisieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);
    }

    public void valider(View view) {
        EditText ePoster = findViewById(R.id.edt_noposter);

        EditText eComp = findViewById(R.id.edt_comp);
        EditText eTravail = findViewById(R.id.edt_travail);
        EditText eQualite = findViewById(R.id.edt_quali);

        if (TextUtils.isEmpty(ePoster.getText()) || TextUtils.isEmpty(eQualite.getText())
                || TextUtils.isEmpty(eTravail.getText()) || TextUtils.isEmpty(eComp.getText())) {
            Toast.makeText(this, this.getString(R.string.err1), Toast.LENGTH_LONG).show();
        } else if ((Double.parseDouble(eComp.getText().toString()) > 5)
                || (Double.parseDouble(eTravail.getText().toString()) > 5) || (Double.parseDouble(eQualite.getText().toString()) > 5)) {
            Toast.makeText(this, this.getString(R.string.err2), Toast.LENGTH_LONG).show();
        } else Toast.makeText(this, this.getString(R.string.ok), Toast.LENGTH_LONG).show();
    }
}
