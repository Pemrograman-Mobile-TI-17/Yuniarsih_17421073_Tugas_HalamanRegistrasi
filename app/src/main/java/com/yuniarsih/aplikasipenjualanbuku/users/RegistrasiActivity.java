package com.yuniarsih.aplikasipenjualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yuniarsih.aplikasipenjualanbuku.R;

public class RegistrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        getSupportActionBar().hide();
    }
}
