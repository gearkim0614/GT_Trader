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
import android.widget.TextView;

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

    TextView water_price;
    TextView fur_price;
    TextView machines_price;
    TextView robots_price;
    TextView ore_price;
    TextView games_price;
    TextView food_price;
    TextView narcotics_price;
    TextView medicine_price;
    TextView firearms_price;

    Button back;

    TextView credit;

    private Universe universe = Universe.getUniverse();

    private BuyGoodViewModel buyGoodVM = new BuyGoodViewModel();

    Player player = universe.getPlayer();

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

        water_price = findViewById(R.id.water_price);
        fur_price = findViewById(R.id.fur_price);
        narcotics_price = findViewById(R.id.narcotics_price);
        food_price = findViewById(R.id.food_price);
        medicine_price = findViewById(R.id.medicine_price);
        machines_price = findViewById(R.id.machine_price);
        robots_price = findViewById(R.id.robots_price);
        firearms_price = findViewById(R.id.firearms_price);
        ore_price = findViewById(R.id.ore_price);
        games_price = findViewById(R.id.games_price);

        back = findViewById(R.id.back_button);

        credit = findViewById(R.id.credit);
        credit.setText("Credit: $" + player.getCredits());

        Region region = universe.getPlayer().getRegion();
        int techLevel = region.getTechLevel().getLevel();

        final Water water = new Water();
        if (water.getMinTechLevelProduce() > techLevel) {
            waterButton.setEnabled(false);
        }
        water_price.setText("$" + water.market_price());

        final Furs furs = new Furs();
        if (furs.getMinTechLevelProduce() > techLevel) {
            furButton.setEnabled(false);
        }
        fur_price.setText("$" + furs.market_price());

        final Food food = new Food();
        if (food.getMinTechLevelProduce() > techLevel) {
            foodButton.setEnabled(false);
        }
        food_price.setText("$" + food.market_price());

        final Ore ore = new Ore();
        if (ore.getMinTechLevelProduce() > techLevel) {
            oreButton.setEnabled(false);
        }
        ore_price.setText("$" + ore.market_price());

        final Games games = new Games();
        if (games.getMinTechLevelProduce() > techLevel) {
            gamesButton.setEnabled(false);
        }
        games_price.setText("$" + games.market_price());

        final Firearms firearms = new Firearms();
        if (firearms.getMinTechLevelProduce() > techLevel) {
            firearmsButton.setEnabled(false);
        }
        firearms_price.setText("$" + firearms.market_price());

        final Medicine medicine = new Medicine();
        if (medicine.getMinTechLevelProduce() > techLevel) {
            medicineButton.setEnabled(false);
        }
        medicine_price.setText("$" + medicine.market_price());

        final Narcotics narcotics = new Narcotics();
        if (narcotics.getMinTechLevelProduce() > techLevel) {
            narcoticsButton.setEnabled(false);
        }
        narcotics_price.setText("$" + narcotics.market_price());

        final Machines machines = new Machines();
        if (machines.getMinTechLevelProduce() > techLevel) {
            machinesButton.setEnabled(false);
        }
        machines_price.setText("$" + machines.market_price());

        final Robots robots = new Robots();
        if (robots.getMinTechLevelProduce() > techLevel) {
            robotsButton.setEnabled(false);
        }
        robots_price.setText("$" + robots.market_price());

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(BuyMarketplaceActivity.this, Main2Activity.class));
            }
        });


        waterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(water);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        furButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(furs);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        foodButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(food);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        oreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(ore);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        gamesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(games);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        firearmsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(firearms);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        medicineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(medicine);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        narcoticsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(narcotics);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        machinesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(machines);
                credit.setText("Credit: $" + player.getCredits());
            }
        });

        robotsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(robots);
                credit.setText("Credit: $" + player.getCredits());
            }
        });



    }




}
