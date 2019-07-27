package com.example.screenloginandcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtUserName,edtPassword;
    private Button btnLogin;

    public static final String KEY_USERNAME = "k";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radiation();
        Event();
    }

    private void Event() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();

                if (username.equals("khuong") && password.equals("123")){
                    Intent intent = new Intent(MainActivity.this,SubActivity.class);
                    intent.putExtra(KEY_USERNAME,username);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Tên Tài Khoản Hoặc Mặc Khẩu không chính sát (khuong & 123)", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    private void Radiation() {
        edtUserName = (EditText) findViewById(R.id.edtUserName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

    }
}
