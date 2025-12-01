package com.example.filltime;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardResourcesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_resources);

        View brand = findViewById(R.id.brandFillTime);
        if (brand != null) {
            brand.setOnClickListener(v ->
                    startActivity(new android.content.Intent(DashboardResourcesActivity.this, HomeActivity.class))
            );
        }
    }
}



