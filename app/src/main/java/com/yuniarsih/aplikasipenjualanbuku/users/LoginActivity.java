package com.yuniarsih.aplikasipenjualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yuniarsih.aplikasipenjualanbuku.R;

public class LoginActivity extends AppCompatActivity {

    Button btndaftardisini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btndaftardisini = (Button) findViewById(R.id.btndaftardisini);
        btndaftardisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(i);
                finish();
            }
        });


        getSupportActionBar().hide();
    }
}
