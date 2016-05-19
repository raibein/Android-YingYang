package com.raben.yingyang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by raben on 18-May-16.
 */
public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button mRegisterLoginButton = (Button) findViewById(R.id.activity_register_login);
        mRegisterLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _intendRegisterLogin = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(_intendRegisterLogin);
            }
        });

        Button mRegisterButton = (Button) findViewById(R.id.activity_register_register_now);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _intendRegister = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(_intendRegister);
            }
        });
    }
}
