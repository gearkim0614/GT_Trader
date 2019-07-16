package com.example.gttrader;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;

import com.example.gttrader.Entity.DifficultyLevel;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.R;
import com.example.gttrader.View.Main2Activity;
import com.example.gttrader.ViewModel.ConfigurationViewModel;
import com.example.gttrader.Entity.Player;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    EditText playerNameText;
    EditText pilotPoints;
    EditText engineerPoints;
    EditText fighterPoints;
    EditText traderPoints;
    Spinner levelSpinner;


    Button start_button;
    Button quit_button;

    private ConfigurationViewModel configuration = new ConfigurationViewModel();

    //private Player player;
    private Gson gson;
    private Universe universe = Universe.getUniverse();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        start_button = findViewById(R.id.startButton);
        quit_button = findViewById(R.id.quitButton);
        playerNameText = findViewById(R.id.PlayerNameText);
        pilotPoints = findViewById(R.id.pilot_points);
        engineerPoints = findViewById(R.id.engineer_points);
        fighterPoints = findViewById(R.id.fighter_points);
        traderPoints = findViewById(R.id.trader_points);
        levelSpinner = findViewById(R.id.difficultySpinner);

        ArrayAdapter<DifficultyLevel> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, DifficultyLevel.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        levelSpinner.setAdapter(adapter);


        //read file
        File path = getApplicationContext().getFilesDir();
        File file = new File(path, "Info.json");
        try {
            int length = (int) file.length();
            byte[] bytes = new byte[length];
            FileInputStream in = new FileInputStream(file);
            in.read(bytes);
            String contents = new String(bytes);
            in.close();
//            Log.d("FileFromLastInstance", contents);
            if (!contents.equals("")) {
                System.out.println("here");
                Player player = gson.fromJson(contents, Player.class);
                universe.setPlayer(player);
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_LONG).show();
//                previousStateReviewText.setText(previousStateReview.getReview());
//                previousStateRatingText.setText(previousStateReview.getRating() + "");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        start_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                String name = playerNameText.getText().toString();
                int pilot_pts = Integer.parseInt(pilotPoints.getText().toString());
                int engineer_pts = Integer.parseInt(engineerPoints.getText().toString());
                int fighter_pts = Integer.parseInt(fighterPoints.getText().toString());
                int trader_pts = Integer.parseInt(traderPoints.getText().toString());
                DifficultyLevel level = (DifficultyLevel) levelSpinner.getSelectedItem();
                if (!ConfigurationViewModel.addUpToSixteen(pilot_pts, engineer_pts, fighter_pts, trader_pts)) {
                    Toast.makeText(getApplicationContext(), "Invalid skill points", Toast.LENGTH_LONG).show();
                }

                else {
                    configuration.initializer(pilot_pts, engineer_pts, fighter_pts, trader_pts, name);
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_LONG).show();

                }
            }});

        quit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                finish();


            }});



    }


}