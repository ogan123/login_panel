package com.example.login_panel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText loginEditText, passwordEditText, emailEditText;
    private TextView loginTextView, passwordTextView, emailTextView;
    private boolean True;
    boolean unblock = True;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEditText = findViewById(R.id.Login);
        passwordEditText = findViewById(R.id.Password);
        emailEditText = findViewById(R.id.Email);

        loginTextView = findViewById(R.id.Login_Text);
        passwordTextView = findViewById(R.id.Password_Text);
        emailTextView = findViewById(R.id.Email_Text);

        Button submitButton = findViewById(R.id.Button);
        Button button_edit = findViewById(R.id.button_edit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String login = loginEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String email = emailEditText.getText().toString();
                
                loginTextView.setText("Twój login to: " + login);
                passwordTextView.setText("Twoje hasło to: " + password);
                emailTextView.setText("Twój email to: " + email);
            }

        });
        button_edit.setOnClickListener(e->{
            unblock = !unblock;
            loginEditText.setEnabled(unblock);
            passwordEditText.setEnabled(unblock);
            emailEditText.setEnabled(unblock);

        });
    }
}
