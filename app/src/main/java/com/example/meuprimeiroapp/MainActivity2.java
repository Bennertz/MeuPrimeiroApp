package com.example.meuprimeiroapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstFragment = findViewById(R.id.BtnPrimeiroFragmento);
        secondFragment = findViewById(R.id.BtnSegundoFragmento);
        firstFragment.setOnClickListener(v -> {
            Fragment newFragment = new ExemploFragmento();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.flFragment, newFragment);
            transaction.addToBackStack(null);

            transaction.commit();
        });

        secondFragment.setOnClickListener(v -> {
            Fragment newFragment = new SegundoFragmento();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.flFragment, newFragment);
            transaction.addToBackStack(null);

            transaction.commit();
        });
    }
}