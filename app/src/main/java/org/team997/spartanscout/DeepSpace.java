package org.team997.spartanscout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DeepSpace extends AppCompatActivity {

    // Data
    private int
            autoHabScore = 0,
            cargoScored = 0,
            hatchScored = 0,
            climbScore = 0;

    private Button
            autoHabPlus, autoHabMinus,
            cargoPlus, cargoMinus,
            hatchPlus, hatchMinus,
            climbPlus, climbMinus;

    private TextView autoHabText, cargoText, hatchText, climbText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_space);

        autoHabText = (TextView) findViewById(R.id.autoHabText);
        cargoText = (TextView) findViewById(R.id.cargoText);
        hatchText = (TextView) findViewById(R.id.hatchText);
        climbText = (TextView) findViewById(R.id.climbText);

        autoHabPlus = (Button) findViewById(R.id.autoHabPlus);
        autoHabPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (autoHabScore) {
                    case 0:
                        autoHabScore = 3;
                        autoHabText.setText("Auto Hab\nLevel 1");
                        break;
                    case 3:
                        autoHabScore = 6;
                        autoHabText.setText("Auto Hab\nLevel 2");
                        break;
                }
            }
        });
        autoHabMinus = (Button) findViewById(R.id.autoHabMinus);
        autoHabMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (autoHabScore) {
                    case 6:
                        autoHabScore = 3;
                        autoHabText.setText("Auto Hab\nLevel 1");
                        break;
                    case 3:
                        autoHabScore = 0;
                        autoHabText.setText("Auto Hab\nDidn't Score");
                        break;
                }
            }
        });
        cargoPlus = (Button) findViewById(R.id.cargoPlus);
        cargoPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargoScored += 1;
                cargoText.setText("Cargo\n" + cargoScored);
            }
        });
        cargoMinus = (Button) findViewById(R.id.cargoMinus);
        cargoMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cargoScored > 0) cargoScored -= 1;
                cargoText.setText("Cargo\n" + cargoScored);
            }
        });

        hatchPlus = (Button) findViewById(R.id.hatchPlus);
        hatchPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hatchScored += 1;
                hatchText.setText("Hatches\n" + hatchScored);
            }
        });
        hatchMinus = (Button) findViewById(R.id.hatchMinus);
        hatchMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hatchScored > 0) hatchScored -= 1;
                hatchText.setText("Hatches\n" + hatchScored);
            }
        });
        climbPlus = (Button) findViewById(R.id.climbPlus);
        climbPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (climbScore) {
                    case 0:
                        climbScore = 3;
                        climbText.setText("Climb\nLevel 1");
                        break;
                    case 3:
                        climbScore = 6;
                        climbText.setText("Climb\nLevel 2");
                        break;
                    case 6:
                        climbScore = 12;
                        climbText.setText("Climb\nLevel 3");
                        break;
                }
            }
        });
        climbMinus = (Button) findViewById(R.id.climbMinus);
        climbMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (climbScore) {
                    case 12:
                        climbScore = 6;
                        climbText.setText("Climb\nLevel 2");
                        break;
                    case 6:
                        climbScore = 3;
                        climbText.setText("Climb\nLevel 1");
                        break;
                    case 3:
                        climbScore = 0;
                        climbText.setText("Climb\nNo Climb");
                        break;
                }
            }
        });
    }
}
