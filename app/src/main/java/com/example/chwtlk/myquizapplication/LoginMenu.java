package com.example.chwtlk.myquizapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginMenu extends AppCompatActivity{
    Button buttonLogin;
    Button buttonAddNewUser;
    TextView txtUserName;
    EditText txtPassword;
    AlertDialog.Builder errorMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);

        login();
        createUser();
    }

    private void login()
    {
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        txtUserName = (TextView) findViewById(R.id.txtUserName);
        txtPassword = (EditText) findViewById(R.id.txtPasswordBox);
        errorMessage = new AlertDialog.Builder(this);



        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtUserName.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin")) {
                    startActivity(new Intent(getApplicationContext(), MainMenu.class));
                }
                else {
                    errorMessage.setTitle("Error");
                    errorMessage.setMessage(R.string.login_error);
                    errorMessage.show();
                }
            }
        });
    }

    private void createUser()
    {
        buttonAddNewUser = (Button) findViewById(R.id.buttonAddNewUser);
        buttonAddNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddNewUser.class));
            }
        });
    }

}
