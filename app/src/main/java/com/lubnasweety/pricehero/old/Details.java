package com.lubnasweety.pricehero.old;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lubnasweety.pricehero.Booking;
import com.lubnasweety.pricehero.R;

public class Details extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        button=(Button)findViewById(R.id.button1boking);
        View.OnClickListener it=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent booking=new Intent(Details.this,Booking.class);
                startActivity(booking);

            }
        };
        button.setOnClickListener(it);
    }
}
