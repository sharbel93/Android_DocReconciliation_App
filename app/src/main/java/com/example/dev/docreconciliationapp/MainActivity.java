package com.example.dev.docreconciliationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the patient list button */
    public void sendPatientList(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, PatientListActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the add patient button */
    public void sendAddPatient(View view) {
        Intent intent = new Intent(this, AddPatientActivity.class);
        startActivity(intent);
    }
}
