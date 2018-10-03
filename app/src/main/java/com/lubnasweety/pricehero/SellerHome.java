package com.lubnasweety.pricehero;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class SellerHome extends AppCompatActivity implements HomeFragment.HomeFragmentListener {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.content,new HomeFragment()).addToBackStack("HomeFragment").commit();
                    return true;
                case R.id.navigation_post:
                    transaction.replace(R.id.content,new PostFragment()).addToBackStack("PostFragment").commit();

                    return true;
                case R.id.navigation_notifications:
                    transaction.replace(R.id.content,new NotificationFragment()).addToBackStack("NotificationFragment").commit();

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.content,new HomeFragment()).addToBackStack("HomeFragment").commit();



        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void goToEditProfile() {
        Intent goToEditProfile = new Intent(this, EditProfile.class);
        startActivity(goToEditProfile);
    }

    @Override
    public void goToLogout() {
        Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show();
    }
}
