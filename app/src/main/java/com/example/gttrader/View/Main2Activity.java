package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.gttrader.R;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {

    Button buyGoods;
    Button sellGoods;
    Button viewCargo;
    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buyGoods = findViewById(R.id.buyGoods);
        sellGoods = findViewById(R.id.sellGoods);
        viewCargo = findViewById(R.id.see_cargo);
        map = findViewById(R.id.map);

        buyGoods.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                    startActivity(new Intent(Main2Activity.this, BuyMarketplaceActivity.class));

                }
            });

        sellGoods.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(Main2Activity.this, SellMarketplaceActivity.class));

            }
        });


        viewCargo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(Main2Activity.this, ViewCargoHoldActivity.class));
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(Main2Activity.this, MapsActivity.class));

            }
        });
    }


}
