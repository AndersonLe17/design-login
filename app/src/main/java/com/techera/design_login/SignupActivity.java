package com.techera.design_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    // Componentes
    private ImageButton btnBackArrow;
    private TextView tvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initUI();
    }

    private void initUI() {
        btnBackArrow = (ImageButton) findViewById(R.id.btnBackArrow);
        tvSignIn = (TextView) findViewById(R.id.tvSignIn);

        btnBackArrow.setOnClickListener(view -> backActivityMain());
        tvSignIn.setOnClickListener(view -> openSignIn());
    }

    private void openSignIn() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void backActivityMain() {
        finish();
    }
}