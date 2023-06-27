package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.baitaplon.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = binding.signupUser.getText().toString();
                String email =binding.signupEmail.getText().toString();
                String password = binding.signupPassword.getText().toString();
                String confirmpassword =binding.signupConfirmpassword.getText().toString();

                if(account.equals("") || password.equals("") ||confirmpassword.equals("") || email.equals(""))
                {
                    Toast.makeText(RegisterActivity.this,"All fields are mandatory",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (password.equals(confirmpassword)){
                        Boolean checkUserEmail = databaseHelper.checkEmail(email);

                        if(checkUserEmail == false){
                            Boolean insert = databaseHelper.insertData(account,password,email);

                                if(insert == true){
                                    Toast.makeText(RegisterActivity.this,"Signup successfully!",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                                    startActivity(intent);
                                }
                                else {
                                    Toast.makeText(RegisterActivity.this,"Signup Failed",Toast.LENGTH_SHORT).show();
                                }
                        }
                        else {
                            Toast.makeText(RegisterActivity.this,"User already exists! Please login",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(RegisterActivity.this,"Invalid Password!",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

    }

    public void Login(View view)
    {
        startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
    }
}