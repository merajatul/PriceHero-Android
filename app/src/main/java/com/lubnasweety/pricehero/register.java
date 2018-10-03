package com.lubnasweety.pricehero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText fullName;
    EditText userName;
    EditText storeName;
    EditText location;
    EditText email;
    EditText licence;
    EditText pass;
    Spinner spinner;

Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fullName = (EditText)findViewById(R.id.fullName);
        userName = (EditText)findViewById(R.id.userName);
        storeName = (EditText)findViewById(R.id.storeName);
        location = (EditText)findViewById(R.id.location);
        licence = (EditText)findViewById(R.id.licence);
        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.pass);
        spinner = (Spinner)findViewById(R.id.spinner);

        register = (Button) findViewById(R.id.register);
        View.OnClickListener it = new View.OnClickListener(){
            public void onClick(View v){
                String FullName = String.valueOf(fullName.getText());
                String UserName = String.valueOf(userName.getText());
                String StoreName = String.valueOf(storeName.getText());
                String Location = String.valueOf(location.getText());
                String SellersLicense = String.valueOf(licence.getText());
                String Email = String.valueOf(email.getText());
                String password = String.valueOf(pass.getText());
                String spinnerText = String.valueOf(spinner.getSelectedItem());

                if(FullName.equals("")||UserName.equals("")||Email.equals("")||password.equals("")||spinner.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter the required ornamentsvalues",Toast.LENGTH_LONG).show();
                }
                else {
                    Intent login = new Intent(register.this,login.class);
                    startActivity(login);
                }


            }
        };
        register.setOnClickListener(it);
    }
}
