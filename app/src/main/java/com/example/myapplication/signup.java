package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class signup extends AppCompatActivity {
    public MaterialButton button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText username = (EditText) findViewById(R.id.username);
        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1= username.getText().toString();
                Toast.makeText(signup.this, "username is"+username1,Toast.LENGTH_SHORT).show();
            }
        });

        button1= (MaterialButton) findViewById(R.id.signupbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(signup.this, home.class);
                startActivity(intent1);
            }
        });
    }
}