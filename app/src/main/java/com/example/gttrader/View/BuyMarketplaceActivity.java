package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.gttrader.R;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class BuyMarketplaceActivity extends AppCompatActivity {

    ImageButton water;
    ImageButton  fur;
    ImageButton  food;
    ImageButton  ore;
    ImageButton  games;
    ImageButton  firearms;
    ImageButton  medicine;
    ImageButton  narcotics;
    ImageButton  machines;
    ImageButton  robots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_marketplace);
        water = findViewById(R.id.water);
        fur = findViewById(R.id.fur);
        food = findViewById(R.id.food);
        ore = findViewById(R.id.ore);
        games = findViewById(R.id.games);
        firearms = findViewById(R.id.firearms);
        medicine = findViewById(R.id.medicine);
        narcotics = findViewById(R.id.narcotics);
        machines = findViewById(R.id.machines);
        robots = findViewById(R.id.robots);



    }
}
