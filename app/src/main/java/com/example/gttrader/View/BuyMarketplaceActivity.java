package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gttrader.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Button;
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
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Player;

import java.util.HashMap;

/**
 * This class handles the UI for a player buying goods in the marketplace
 */
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

    TextView fur_quantity;
    TextView machines_quantity;
    TextView water_quantity;
    TextView robots_quantity;
    TextView narcotics_quantity;
    TextView food_quantity;
    TextView medicine_quantity;
    TextView games_quantity;
    TextView ore_quantity;
    TextView firearms_quantity;

    Button back;

    TextView credit;

    private final Universe universe = Universe.getUniverse();

    private final BuyGoodViewModel buyGoodVM = new BuyGoodViewModel();

    Player player = universe.getPlayer();

    HashMap<Integer, Integer> scooter_hold =
            (HashMap<Integer, Integer>) player.getScooter().getScooter_hold();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_marketplace);

        fur_quantity = findViewById(R.id.fur_quantity);
        medicine_quantity = findViewById(R.id.medicine_quantity);
        machines_quantity = findViewById(R.id.machine_quantity);
        narcotics_quantity = findViewById(R.id.narcotics_quantity);
        food_quantity = findViewById(R.id.food_quantity);
        water_quantity = findViewById(R.id.water_quantity);
        ore_quantity = findViewById(R.id.ore_quantity);
        games_quantity = findViewById(R.id.games_quantity);
        robots_quantity = findViewById(R.id.robots_quantity);
        firearms_quantity = findViewById(R.id.firearms_quantity);

        waterButton = findViewById(R.id.water);
        furButton =  findViewById(R.id.fur);
        foodButton = findViewById(R.id.food);
        oreButton = findViewById(R.id.ore);
        gamesButton = findViewById(R.id.games);
        firearmsButton = findViewById(R.id.firearms);
        medicineButton = findViewById(R.id.medicine);
        narcoticsButton = findViewById(R.id.narcotics);
        machinesButton = findViewById(R.id.machines);
        robotsButton = findViewById(R.id.robots);

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

        back = findViewById(R.id.TravelBack);

        credit = findViewById(R.id.credit);
        String creditString = "Credit: $" + player.getCredits();
        credit.setText(creditString);


        int techLevel = universe.getPlayer().getBuilding().getTechLevel().getLevel();



        final Water water = new Water();
        if (water.getMinTechLevelProduce() > techLevel) {
            waterButton.setEnabled(false);
        }
        String waterPrice = "$" + water.market_price();
        String waterQuantity = "Quantity: " + scooter_hold.get(water.hashCode());
        water_price.setText(waterPrice);
        water_quantity.setText(waterQuantity);

        final Furs furs = new Furs();
        if (furs.getMinTechLevelProduce() > techLevel) {
            furButton.setEnabled(false);
        }
        String furPrice = "$" + furs.market_price();
        String furQuantity = "Quantity: " + scooter_hold.get(furs.hashCode());
        fur_price.setText(furPrice);
        fur_quantity.setText(furQuantity);

        final Food food = new Food();
        if (food.getMinTechLevelProduce() > techLevel) {
            foodButton.setEnabled(false);
        }
        String foodPrice = "$" + food.market_price();
        String foodQuantity = "Quantity: " + scooter_hold.get(food.hashCode());
        food_price.setText(foodPrice );
        food_quantity.setText(foodQuantity);

        final Ore ore = new Ore();
        if (ore.getMinTechLevelProduce() > techLevel) {
            oreButton.setEnabled(false);
        }
        String orePrice = "$" + ore.market_price();
        String oreQuantity = "Quantity: " + scooter_hold.get(ore.hashCode());
        ore_price.setText(orePrice);
        ore_quantity.setText(oreQuantity );

        final Games games = new Games();
        if (games.getMinTechLevelProduce() > techLevel) {
            gamesButton.setEnabled(false);
        }
        String gamesPrice = "$" + games.market_price();
        String gamesQuantity = "Quantity: " + scooter_hold.get(games.hashCode());
        games_price.setText(gamesPrice);
        games_quantity.setText(gamesQuantity);

        final Firearms firearms = new Firearms();
        if (firearms.getMinTechLevelProduce() > techLevel) {
            firearmsButton.setEnabled(false);
        }
        String firearmsPrice = "$" + firearms.market_price();
        firearms_price.setText(firearmsPrice);
        String firearmsQuantity = "Quantity: " + scooter_hold.get(firearms.hashCode());
        firearms_quantity.setText(firearmsQuantity);

        final Medicine medicine = new Medicine();
        if (medicine.getMinTechLevelProduce() > techLevel) {
            medicineButton.setEnabled(false);
        }
        String medicingPrice = "$" + medicine.market_price();
        String medicineQuantity = "Quantity: " + scooter_hold.get(medicine.hashCode());
        medicine_price.setText(medicingPrice);
        medicine_quantity.setText(medicineQuantity);

        final Narcotics narcotics = new Narcotics();
        if (narcotics.getMinTechLevelProduce() > techLevel) {
            narcoticsButton.setEnabled(false);
        }
        String narcoticsPrice = "$" + narcotics.market_price();
        String narcoticsQuantity = "Quantity: " + scooter_hold.get(narcotics.hashCode());
        narcotics_price.setText(narcoticsPrice);
        narcotics_quantity.setText(narcoticsQuantity);

        final Machines machines = new Machines();
        if (machines.getMinTechLevelProduce() > techLevel) {
            machinesButton.setEnabled(false);
        }
        String machinesPrice = "$" + machines.market_price();
        String machinesQuantity = "Quantity: " + scooter_hold.get(machines.hashCode());
        machines_price.setText(machinesPrice);
        machines_quantity.setText(machinesQuantity);

        final Robots robots = new Robots();
        if (robots.getMinTechLevelProduce() > techLevel) {
            robotsButton.setEnabled(false);
        }
        String robotsPrice = "$" + robots.market_price();
        String robotsQuantity = "Quantity: " + scooter_hold.get(robots.hashCode());
        robots_price.setText(robotsPrice);
        robots_quantity.setText(robotsQuantity);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(BuyMarketplaceActivity.this, Main2Activity.class));
            }
        });


        waterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(water);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String waterQ = "Quantity: " + scooter_hold.get(water.hashCode());
                water_quantity.setText(waterQ);

            }
        });

        furButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(furs);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String furQ = "Quantity: " + scooter_hold.get(furs.hashCode());
                fur_quantity.setText(furQ);

            }
        });

        foodButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(food);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String foodQ = "Quantity: " + scooter_hold.get(food.hashCode());
                food_quantity.setText(foodQ);

            }
        });

        oreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(ore);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String oreQ = "Quantity: " + scooter_hold.get(ore.hashCode());
                ore_quantity.setText(oreQ);

            }
        });

        gamesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(games);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String gamesQ = "Quantity: " + scooter_hold.get(games.hashCode());
                games_quantity.setText(gamesQ);

            }
        });

        firearmsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(firearms);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String firearmsQ = "Quantity: " + scooter_hold.get(firearms.hashCode());
                firearms_quantity.setText(firearmsQ);

            }
        });

        medicineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(medicine);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String medicineQ = "Quantity: " + scooter_hold.get(medicine.hashCode());
                medicine_quantity.setText(medicineQ);

            }
        });

        narcoticsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(narcotics);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String narcoticsQ = "Quantity: " + scooter_hold.get(narcotics.hashCode());
                narcotics_quantity.setText(narcoticsQ);

            }
        });

        machinesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(machines);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String machinesQ = "Quantity: " + scooter_hold.get(machines.hashCode());
                machines_quantity.setText(machinesQ);

            }
        });

        robotsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                buyGoodVM.buyGood(robots);
                String creditString = "Credit: $" + player.getCredits();
                credit.setText(creditString);
                String robotsQ = "Quantity: " + scooter_hold.get(robots.hashCode());
                robots_quantity.setText(robotsQ);

            }
        });



    }




}
