package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gttrader.Entity.Universe;
import com.example.gttrader.R;
import android.widget.LinearLayout;
import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.Scooter;

/**
 * UI for viewing a player's cargo hold
 */
public class ViewCargoHoldActivity extends AppCompatActivity {

    LinearLayout layout;
    private Universe universe = Universe.getUniverse();
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cargo_hold);
        back = findViewById(R.id.back);
        layout = findViewById(R.id.linear_layout);
        Player player = universe.getPlayer();
        Scooter scooter = player.getScooter();


        ArrayList<String> hold = scooter.holdToList();
        int size = hold.size();

        TextView[] tv = new TextView[size];


        TextView temp;
        for (int i = 0; i < size; i++) {
            temp = new TextView(this);
            temp.setText(hold.get(i));
            layout.addView(temp);
            tv[i] = temp;
        }

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(ViewCargoHoldActivity.this, Main2Activity.class));
            }
        });
    }


}
