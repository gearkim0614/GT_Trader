package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.gttrader.R;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;

import com.example.gttrader.ViewModel.BuyGoodViewModel;
import com.example.gttrader.Entity.Firearms;
import com.example.gttrader.Entity.Food;
import com.example.gttrader.Entity.Furs;
import com.example.gttrader.Entity.Games;
import com.example.gttrader.Entity.Machines;
import com.example.gttrader.Entity.Medicine;
import com.example.gttrader.Entity.Narcotics;
import com.example.gttrader.Entity.Ore;
import com.example.gttrader.Entity.Robots;
import com.example.gttrader.Entity.Water;
import com.example.gttrader.Entity.Goods;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Player;
import com.example.gttrader.ViewModel.ConfigurationViewModel;
import com.example.gttrader.Entity.Region;





public class BuyMarketplaceActivity extends AppCompatActivity {

    ImageButton waterButton;
    ImageButton  furButton;
    ImageButton  foodButton;
    ImageButton  oreButton;
    ImageButton  gamesButton;
    ImageButton  firearmsButton;
    ImageButton  medicineButton;
    ImageButton  narcoticsButton;
    ImageButton  machinesButton;
    ImageButton  robotsButton;
    Button back;
    private Universe universe = Universe.getUniverse();

    private BuyGoodViewModel buyGoodVM = new BuyGoodViewModel();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_marketplace);
        waterButton = (ImageButton) findViewById(R.id.water);
        furButton = (ImageButton) findViewById(R.id.fur);
        foodButton = (ImageButton) findViewById(R.id.food);
        oreButton = (ImageButton) findViewById(R.id.ore);
        gamesButton = (ImageButton) findViewById(R.id.games);
        firearmsButton = (ImageButton) findViewById(R.id.firearms);
        medicineButton = (ImageButton) findViewById(R.id.medicine);
        narcoticsButton = (ImageButton) findViewById(R.id.narcotics);
        machinesButton = (ImageButton) findViewById(R.id.machines);
        robotsButton = (ImageButton) findViewById(R.id.robots);
        back = findViewById(R.id.back_button);

        Region region = universe.getPlayer().getRegion();
        int techLevel = region.getTechLevel().getLevel();

        final Water water = new Water();
        if (water.getMinTechLevelProduce() > techLevel) {
            waterButton.setEnabled(false);
        }

        final Furs furs = new Furs();
        if (furs.getMinTechLevelProduce() > techLevel) {
            furButton.setEnabled(false);
        }

        final Food food = new Food();
        if (food.getMinTechLevelProduce() > techLevel) {
            foodButton.setEnabled(false);
        }


        final Ore ore = new Ore();
        if (ore.getMinTechLevelProduce() > techLevel) {
            oreButton.setEnabled(false);
        }

        final Games games = new Games();
        if (games.getMinTechLevelProduce() > techLevel) {
            gamesButton.setEnabled(false);
        }

        final Firearms firearms = new Firearms();
        if (firearms.getMinTechLevelProduce() > techLevel) {
            firearmsButton.setEnabled(false);
        }


        final Medicine medicine = new Medicine();
        if (medicine.getMinTechLevelProduce() > techLevel) {
            medicineButton.setEnabled(false);
        }

        final Narcotics narcotics = new Narcotics();
        if (narcotics.getMinTechLevelProduce() > techLevel) {
            narcoticsButton.setEnabled(false);
        }

        final Machines machines = new Machines();
        if (machines.getMinTechLevelProduce() > techLevel) {
            machinesButton.setEnabled(false);
        }

        final Robots robots = new Robots();
        if (robots.getMinTechLevelProduce() > techLevel) {
            robotsButton.setEnabled(false);
        }

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(BuyMarketplaceActivity.this, Main2Activity.class));
            }
        });


        waterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(water);
            }
        });

        furButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(furs);

            }
        });

        foodButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(food);
            }
        });

        oreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(ore);
            }
        });

        gamesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(games);

            }
        });

        firearmsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(firearms);

            }
        });

        medicineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(medicine);

            }
        });

        narcoticsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(narcotics);
            }
        });

        machinesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(machines);

            }
        });

        robotsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(robots);

            }
        });



    }




}
