package com.sipl.dialogloinapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_login);
        dialog.setCancelable(false);
        username=dialog.findViewById(R.id.login_user);
        password=dialog.findViewById(R.id.login_password);
        btnLogin=dialog.findViewById(R.id.loginButton);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("users")&& password.getText().toString().equals("12345")){
                    dialog.dismiss();
                }else{
                    Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
        dialog.show();
    }
}