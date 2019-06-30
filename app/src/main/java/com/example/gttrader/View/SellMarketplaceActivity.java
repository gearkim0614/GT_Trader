package com.example.gttrader.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gttrader.R;

public class SellMarketplaceActivity extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_marketplace);
        back = findViewById(R.id.back_button_2);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // button clicked
                startActivity(new Intent(SellMarketplaceActivity.this, Main2Activity.class));
            }
        });
    }
}
