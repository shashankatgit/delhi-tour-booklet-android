package com.example.fragger.delhitourbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{

    private String[][] users={
        {"root","toor"},
        {"any","one"},
        {"guest",""}

    };
    Button loginButton;
    EditText loginUserName;
    EditText loginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton= (Button) findViewById(R.id.loginButton);
        loginUserName= (EditText) findViewById(R.id.loginUserNameField);
        loginPassword= (EditText) findViewById(R.id.loginPasswordField);

        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String username=loginUserName.getText().toString().trim();
        String password=loginPassword.getText().toString().trim();

        if(validateLogin(username,password)) {
            Intent intent = new Intent(Login.this,Menu.class);
            Toast.makeText(Login.this, "Welcome User", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }

        else {
            Toast.makeText(Login.this, "Trespassing Not Allowed Dear", Toast.LENGTH_LONG).show();
        }


    }

    boolean validateLogin(String username,String password) {
    int i=0;
    while(i<users.length)
    {

        if(username.equals(users[i][0]) && password.equals(users[i][1]))
            return true;
        i++;
    }

        return false;
    }
}
