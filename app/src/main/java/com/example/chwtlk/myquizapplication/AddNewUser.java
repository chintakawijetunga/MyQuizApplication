package com.example.chwtlk.myquizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.chwtlk.myquizapplication.Database.DbHandler;

public class AddNewUser extends AppCompatActivity {

    protected DbHandler mDbHandler;
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Users.db";
    Button btnAddUser;
    TextView txtUserName;
    TextView txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_user);
        btnAddUser = (Button) findViewById(R.id.btnAddUser);
        mDbHandler = new DbHandler(this, DATABASE_NAME, null, DATABASE_VERSION);

        btnAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUserName = (TextView) findViewById(R.id.txtUserName);
                txtPassword = (EditText) findViewById(R.id.txtPassword);

                if (!(txtUserName.getText().toString().equals("") || txtPassword.getText().toString().equals(""))) {
                    mDbHandler.addInfo(txtUserName.getText().toString(), txtPassword.getText().toString());
                }
            }
        });
    }
}
