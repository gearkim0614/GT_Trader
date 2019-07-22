package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.R;
import android.view.View;
import android.widget.Button;
//import android.widget.Toast;

import com.google.gson.Gson;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * UI for the player menu
 * the player can choose to buy a good, sell a good, or travel
 */
public class Main2Activity extends AppCompatActivity {

    Button buyGoods;
    Button sellGoods;
    Button viewCargo;
    Button map;
    Button save;
    Button exitButton;
    private Gson gson = new Gson();
    private Gson gson2 = new Gson();
    private final Universe universe = Universe.getUniverse();
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
        exitButton = findViewById ( R.id.exitButton );
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
                if (universe.getPlayer () == null) {
                    save.setEnabled ( false );
                }


                String pjson = gson.toJson(universe.getPlayer());
                String sjson = gson2.toJson(universe.getPlayer().getScooter ());


                File path = getApplicationContext().getFilesDir();
                File file = new File(path, "PlayerInfo.json");
                File file2 = new File(path, "ScooterInfo.json");

                //write to file
                try {
                    FileOutputStream stream = new FileOutputStream(file);
                    stream.write(pjson.getBytes());
                    stream.close();
                    FileOutputStream stream2 = new FileOutputStream (file2);
                    stream2.write(sjson.getBytes());
                    stream2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }



            }
        });







        exitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked@Override

                finish();
                //System.exit ( 0 );
            }
        });







    }


}
