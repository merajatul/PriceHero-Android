package com.lubnasweety.pricehero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.lubnasweety.pricehero.backEnd.DataHelper;
import com.lubnasweety.pricehero.backEnd.productDetails;

public class Homepage extends AppCompatActivity {

    GridView ornamentsGridView;
    GridView groceryGridView;
    GridView electronicsGridView;
    Intent goToItemDetails;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_new);


        ornamentsGridView = (GridView) findViewById(R.id.ornamentsproducts);
        GridAdapterProducts gridAdapterOrnaments = new GridAdapterProducts(this, DataHelper.getNames("ornaments"), DataHelper.getImages("ornaments"));
        ornamentsGridView.setAdapter(gridAdapterOrnaments);

        groceryGridView = (GridView) findViewById(R.id.groceryproducts);
        GridAdapterProducts gridAdapterGrocery = new GridAdapterProducts(this, DataHelper.getNames("grocery"), DataHelper.getImages("grocery"));
        groceryGridView.setAdapter(gridAdapterGrocery);

        electronicsGridView = (GridView) findViewById(R.id.electronicsproducts);
        GridAdapterProducts gridAdapterElectronics = new GridAdapterProducts(this, DataHelper.getNames("electronics"), DataHelper.getImages("electronics"));
        electronicsGridView.setAdapter(gridAdapterElectronics);

        goToItemDetails = new Intent(Homepage.this, ItemDetails.class);

        GridView.OnItemClickListener gridListener = new GridView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                productDetails details = (productDetails) parent.getAdapter().getItem(position);
                goToItemDetails.putExtra("data", details);
                startActivity(goToItemDetails);
            }
        };

        ornamentsGridView.setOnItemClickListener(gridListener);
        groceryGridView.setOnItemClickListener(gridListener);
        electronicsGridView.setOnItemClickListener(gridListener);

    }

}
