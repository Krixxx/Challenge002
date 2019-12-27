package com.hepicode.challenge002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView emailText;
    TextView passwordText;
    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        emailText = findViewById(R.id.email_tw);
        passwordText = findViewById(R.id.password_tw);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            email = "Email: " + bundle.getString("email");
            password = "Password: " + bundle.getString("password");
        }

        emailText.setText(email);
        passwordText.setText(password);
    }
}
