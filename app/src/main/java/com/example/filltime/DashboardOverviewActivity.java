package com.example.filltime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardOverviewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_overview);

        View cardAgendamentos = findViewById(R.id.cardAgendamentos);
        if (cardAgendamentos != null) {
            cardAgendamentos.setOnClickListener(v ->
                    startActivity(new Intent(DashboardOverviewActivity.this, DashboardResourcesActivity.class))
            );
        }

        View brand = findViewById(R.id.brandFillTime);
        if (brand != null) {
            brand.setOnClickListener(v ->
                    startActivity(new Intent(DashboardOverviewActivity.this, HomeActivity.class))
            );
        }
    }
}



