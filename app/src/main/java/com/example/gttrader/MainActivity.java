package com.example.gttrader;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;

import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.DifficultyLevel;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.View.ConfigurationActivity;
import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.Scooter;
import com.example.gttrader.View.Main2Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.gson.Gson;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    TextView title;
    Button start_gameButton;
    Button saveExitButton;

    //private ConfigurationViewModel configuration = new ConfigurationViewModel();

    //private Player player;
    private Gson gson= new Gson();
    private Gson gson2 = new Gson();
    private Universe universe = Universe.getUniverse();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_gameButton = findViewById(R.id.start_gameButton);
        saveExitButton = findViewById (R.id.saveExitButton);

        start_gameButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity (new Intent(MainActivity.this, ConfigurationActivity.class) );

            }
        });

        saveExitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                //make object and JSON
                System.out.println(universe.getPlayer ());
                if (universe.getPlayer () == null) {
                    saveExitButton.setEnabled ( false );
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


                finish();
                System.exit ( 0 );
            }
        });

        //read file
        File path = getApplicationContext().getFilesDir();
        File file = new File(path, "PlayerInfo.json");
        File file2 = new File(path, "ScooterInfo.json");
        try {
            int length = (int) file.length();
            byte[] bytes = new byte[length];
            FileInputStream in = new FileInputStream(file);
            in.read(bytes);
            String contents = new String(bytes);
            in.close();

            int length2 = (int) file2.length();
            byte[] bytes2 = new byte[length2];
            FileInputStream in2 = new FileInputStream(file2);
            in2.read(bytes2);
            String contents2 = new String(bytes2);
            in2.close();
//            Log.d("FileFromLastInstance", contents);
            if (!contents.equals("")) {
                System.out.println("here");
                Player player = gson.fromJson(contents, Player.class);
                Scooter scooter = gson2.fromJson(contents2, Scooter.class);
                universe.setPlayer(player);
                player.setScooter ( scooter );
                startActivity (new Intent( MainActivity.this, Main2Activity.class) );
                Toast.makeText (getApplicationContext (), "Welcome!", Toast.LENGTH_LONG ).show ();
//                previousStateReviewText.setText(previousStateReview.getReview());
//                previousStateRatingText.setText(previousStateReview.getRating() + "");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
