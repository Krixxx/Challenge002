package com.hepicode.challenge002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button;
    String tEmail;
    String tPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email_et);
        password = findViewById(R.id.password_et);
    }

    public void btnPressed(View view){

        tEmail = email.getText().toString().trim();
        tPassword = password.getText().toString().trim();

        if (tEmail.equals("") || tPassword.equals("")){

            Toast.makeText(this, "Please fill both fields!", Toast.LENGTH_SHORT).show();

        }else if(!tEmail.contains("@")) {

            Toast.makeText(this, "Please enter correct e-mail address!", Toast.LENGTH_SHORT).show();

        }else {

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("email", tEmail);
            intent.putExtra("password", tPassword);
            startActivity(intent);
        }


    }


    /*
    1, Create 2 Activity classes
    2. Activity A (Launch Activity) will contain 2 EditText and a Button widgets
    3. Activity B will contain 2 TextView widgets which will display the input values from EditTexts in Activity A
    4. Activity A Button is wired with onClick event
    5. The input values in Activity A must be validated for empty or null value before submitting to Activity B
    6. The email value must be validated to make sure the input email address contains @ symbol
    7. The password value must be hidden with asterisk or dot representation.
     */
}
