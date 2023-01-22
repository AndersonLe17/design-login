package com.techera.design_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    // Componentes
    private ImageButton btnBackArrow;
    private TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initUI();
    }

    private void initUI() {
        btnBackArrow = (ImageButton) findViewById(R.id.btnBackArrow);
        tvSignUp = (TextView) findViewById(R.id.tvSignUp);

        btnBackArrow.setOnClickListener(view -> backActivityMain());
        tvSignUp.setOnClickListener(view -> openSignUp());
    }

    private void openSignUp() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
        finish();
    }

    private void backActivityMain() {
        finish();
    }
}