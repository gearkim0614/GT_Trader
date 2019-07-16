package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.R;
import android.view.View;
import android.widget.Button;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Main2Activity extends AppCompatActivity {

    Button buyGoods;
    Button sellGoods;
    Button viewCargo;
    Button map;
    Button save;
    private Gson gson;
    private Universe universe = Universe.getUniverse();
    private Player player = universe.getPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buyGoods = findViewById(R.id.buyGoods);
        sellGoods = findViewById(R.id.sellGoods);
        viewCargo = findViewById(R.id.see_cargo);
        map = findViewById(R.id.map);
        save = findViewById(R.id.save_button);
        gson = new Gson();

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

        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked@Override

                //make object and JSON

                String json = gson.toJson(player);
//                System.out.println("hi");
//                System.out.println(json);
//                Log.d("CurrentFile", json);


                //Make file
                File path = getApplicationContext().getFilesDir();
                File file = new File(path, "Info.json");

                //write to file
                try {
                    FileOutputStream stream = new FileOutputStream(file);
                    stream.write(json.getBytes());
                    stream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }



            }
        });

    }


}
