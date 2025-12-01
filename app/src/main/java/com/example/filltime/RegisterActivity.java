package com.example.filltime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        View btnCriarConta = findViewById(R.id.btnCriarConta);
        if (btnCriarConta != null) {
            btnCriarConta.setOnClickListener(v ->
                    startActivity(new Intent(RegisterActivity.this, DashboardOverviewActivity.class))
            );
        }

        TextView linkEntrar = findViewById(R.id.linkEntrar);
        if (linkEntrar != null) {
            linkEntrar.setOnClickListener(v ->
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class))
            );
        }

        View brand = findViewById(R.id.brandFillTime);
        if (brand != null) {
            brand.setOnClickListener(v ->
                    startActivity(new Intent(RegisterActivity.this, HomeActivity.class))
            );
        }
    }
}



