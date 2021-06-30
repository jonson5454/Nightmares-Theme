package com.example.task_22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText userName,password;
    TextView forgotPass,terms;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(uiOptions);

        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        button = findViewById(R.id.login_button);
        forgotPass = findViewById(R.id.forgotPass);
        terms = findViewById(R.id.terms_conditions);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userName.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
/*                    Toast.makeText(Login.this,"Login Successfully",Toast.LENGTH_LONG).show();*/

                    Intent homeIntent = new Intent (Login.this, MobileNumber.class);
                    startActivity(homeIntent);

                }
                else {Toast.makeText(Login.this,"Incorrect Username or Password",Toast.LENGTH_LONG).show();

                }
            }
        });


        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"admin is your Password",Toast.LENGTH_LONG).show();
            }
        });

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent privacyIntent = new Intent (Login.this, PrivacyPolicy.class);
                startActivity(privacyIntent);
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(Login.this, R.color.black));
        }

    }
}