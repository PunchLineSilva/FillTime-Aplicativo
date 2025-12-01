package com.example.filltime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        View btnEntrar = findViewById(R.id.btnEntrar);
        if (btnEntrar != null) {
            btnEntrar.setOnClickListener(v ->
                    startActivity(new Intent(LoginActivity.this, DashboardOverviewActivity.class))
            );
        }

        TextView linkCadastro = findViewById(R.id.linkCadastro);
        if (linkCadastro != null) {
            linkCadastro.setOnClickListener(v ->
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class))
            );
        }

        View brand = findViewById(R.id.brandFillTime);
        if (brand != null) {
            brand.setOnClickListener(v ->
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class))
            );
        }
    }
}



