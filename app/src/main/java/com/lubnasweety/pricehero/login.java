package com.lubnasweety.pricehero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.lubnasweety.pricehero.R.id.editText;

public class login extends AppCompatActivity {

    Button login,signup;
    //EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);
        final EditText inputname = (EditText)findViewById(editText);
        final EditText inputpassword = (EditText)findViewById(R.id.editText2);

        /*login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(login.this,selection5.class);
                startActivity(i);
            }
        });*/

        View.OnClickListener it = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = String.valueOf(inputname.getText());
                String password = String.valueOf(inputpassword.getText());

                if(username.equals("lubna") && password.equals("lubu")){
                    Intent buyerHome = new Intent(login.this,Homepage.class);
                    startActivity(buyerHome);
                }else  if(username.equals("sweety") && password.equals("sweet")){
                    Intent sellerHome = new Intent(login.this, SellerHome.class);
                    startActivity(sellerHome);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Enter the required values",Toast.LENGTH_LONG).show();
                }
            }
        };

        login.setOnClickListener(it);

//        login.setOnClickListener(
//                new View.OnClickListener(){
//                    public void onClick(View v){
//                        String username = String.valueOf(inputname.getText());
//                        String password = String.valueOf(inputpassword.getText());
//
//                        if(username.equals("lubna") && password.equals("lubu")){
//                            Intent home = new Intent(login.this,Homepage.class);
//                            startActivity(home);
//                        }else {
//                            Toast.makeText(getApplicationContext(),"Enter the required ornamentsvalues",Toast.LENGTH_LONG).show();
//                        }
//                    }
//                }
//        );

        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(login.this,register.class);
                startActivity(i);
            }
        });
    }
}
