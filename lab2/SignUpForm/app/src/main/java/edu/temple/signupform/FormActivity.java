package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText userName;
    EditText userEmail;
    EditText userPassword;
    EditText userPassword2;

    TextView nameErr;
    TextView emailErr;
    TextView passwordErr;
    TextView password2Err;

    String name;
    String email;
    String password;
    String password2;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference input fields
        userName = findViewById(R.id.userName);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);
        userPassword2 = findViewById(R.id.userPassword2);

        // reference error messages
        nameErr = findViewById(R.id.nameErr);
        emailErr = findViewById(R.id.emailErr);
        passwordErr = findViewById(R.id.passwordErr);
        password2Err = findViewById(R.id.password2Err);

        // change error message colors to red
        nameErr.setTextColor(Color.parseColor("#FF0000"));
        emailErr.setTextColor(Color.parseColor("#FF0000"));
        passwordErr.setTextColor(Color.parseColor("#FF0000"));
        password2Err.setTextColor(Color.parseColor("#FF0000"));

        // reference button
        button = findViewById(R.id.button);

        // define what happens when button clicked
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get input field values
                name = userName.getText().toString();
                email = userEmail.getText().toString();
                password = userPassword.getText().toString();
                password2 = userPassword2.getText().toString();

                // check for errors
                boolean err = false;

                if (name.length() == 0) { // no name given
                    nameErr.setText("Name required");
                    err = true;

                } else {
                    nameErr.setText("");
                }

                if (email.length() == 0) { // no email given
                    emailErr.setText("Email required");
                    err = true;

                } else {
                    if (!isEmailValid(email)) { // not an email address
                        emailErr.setText("The email you entered is invalid");
                        err = true;

                    } else {
                        emailErr.setText("");
                    }
                }

                if (password.length() == 0) { // no password given
                    passwordErr.setText("Password required");
                    err = true;

                } else {
                    passwordErr.setText("");
                }

                if (password2.length() == 0) { // no password given
                    password2Err.setText("Password confirmation required");
                    err = true;

                } else {
                    if (!password.equals(password2)) { // password not matching
                        password2Err.setText("Password did not match");
                        err = true;

                    } else {
                        password2Err.setText("");
                    }
                }

                if (!err) { // if no errors, display message
                    Toast.makeText(FormActivity.this, "Welcome, " + name + "!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    // check if email follows email patterns
    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

}