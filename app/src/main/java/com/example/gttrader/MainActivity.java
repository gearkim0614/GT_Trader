package com.example.gttrader;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.example.gttrader.Entity.DifficultyLevel;
import com.example.gttrader.ViewModel.ConfigurationViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText playerNameText;
    EditText pilotPoints;
    EditText engineerPoints;
    EditText fighterPoints;
    EditText traderPoints;
    Spinner levelSpinner;


    Button start_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        start_button = findViewById(R.id.startButton);
        playerNameText = findViewById(R.id.PlayerNameText);
        pilotPoints = findViewById(R.id.pilot_points);
        engineerPoints = findViewById(R.id.engineer_points);
        fighterPoints = findViewById(R.id.fighter_points);
        traderPoints = findViewById(R.id.trader_points);
        levelSpinner = findViewById(R.id.difficultySpinner);

        ArrayAdapter<DifficultyLevel> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, DifficultyLevel.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        levelSpinner.setAdapter(adapter);



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
            }});


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
    }


}