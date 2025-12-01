package com.example.filltime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        View btnTrial = findViewById(R.id.btnTrial);
        if (btnTrial != null) {
            btnTrial.setOnClickListener(v -> {
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            });
        }

        View btnMenu = findViewById(R.id.btnMenu);
        if (btnMenu != null) {
            btnMenu.setOnClickListener(v -> {
                PopupMenu popup = new PopupMenu(HomeActivity.this, v);
                popup.getMenu().add(0, 1, 0, "Login");
                popup.getMenu().add(0, 2, 1, "Cadastro");
                popup.setOnMenuItemClickListener((MenuItem item) -> {
                    if (item.getItemId() == 1) {
                        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
                        return true;
                    } else if (item.getItemId() == 2) {
                        startActivity(new Intent(HomeActivity.this, RegisterActivity.class));
                        return true;
                    }
                    return false;
                });
                popup.show();
            });
        }
    }
}



