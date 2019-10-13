package org.team997.spartanscout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DeepSpaceRedo extends AppCompatActivity {

    private int unselTextColor, unselTintColor, selTextColor, selTintColor;

    private int lowCargo = 0, midCargo = 0, highCargo = 0, csCargo = 0,
            lowHatch = 0, midHatch = 0, highHatch = 0,
            autoHab = 0, climb = 0, penalties = 0, defense = 0;

    private Button lowCargoP, midCargoP, highCargoP, csCargoP,
            lowCargoM, midCargoM, highCargoM, csCargoM,
            lowHatchP, midHatchP, highHatchP,
            lowHatchM, midHatchM, highHatchM,
            autoHab0, autoHab1, autoHab2,
            climb0, climb1, climb2, climb3;

    private TextView lowCargoT, midCargoT, highCargoT, csCargoT,
            lowHatchT, midHatchT, highHatchT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_space_redo);

        // Color Setup

        selTintColor = 14079959;
        selTextColor = Color.argb(255, 46, 174, 217); // 783211007;
        unselTintColor = 14079959;
        unselTextColor = Color.argb(255, 35, 35, 35); // 589505535;

        // Cargo Frontend

        lowCargoT = (TextView) findViewById(R.id.lowCargoText);
        midCargoT = (TextView) findViewById(R.id.midCargoText);
        highCargoT = (TextView) findViewById(R.id.highCargoText);
        csCargoT = (TextView) findViewById(R.id.csCargoText);

        lowCargoP = (Button) findViewById(R.id.lowCargoPlus);
        lowCargoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lowCargo < 48) lowCargo += 1;
                lowCargoT.setText("Low Cargo: " + lowCargo);
            }
        });
        lowCargoM = (Button) findViewById(R.id.lowCargoMinus);
        lowCargoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lowCargo > 0) lowCargo -= 1;
                lowCargoT.setText("Low Cargo: " + lowCargo);
            }
        });
        midCargoP = (Button) findViewById(R.id.midCargoPlus);
        midCargoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midCargo < 48) midCargo += 1;
                midCargoT.setText("Mid Cargo: " + midCargo);
            }
        });
        midCargoM = (Button) findViewById(R.id.midCargoMinus);
        midCargoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midCargo > 0) midCargo -= 1;
                midCargoT.setText("Mid Cargo: " + midCargo);
            }
        });
        highCargoP = (Button) findViewById(R.id.highCargoPlus);
        highCargoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (highCargo < 48) highCargo += 1;
                highCargoT.setText("High Cargo: " + highCargo);
            }
        });
        highCargoM = (Button) findViewById(R.id.highCargoMinus);
        highCargoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (highCargo > 0) highCargo -= 1;
                highCargoT.setText("High Cargo: " + highCargo);
            }
        });
        csCargoP = (Button) findViewById(R.id.csCargoPlus);
        csCargoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (csCargo < 48) csCargo += 1;
                csCargoT.setText("CS Cargo: " + csCargo);
            }
        });
        csCargoM = (Button) findViewById(R.id.csCargoMinus);
        csCargoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (csCargo > 0) csCargo -= 1;
                csCargoT.setText("CS Cargo: " + csCargo);
            }
        });

        // Hatch Frontend

        lowHatchT = (TextView) findViewById(R.id.lowHatchText);
        midHatchT = (TextView) findViewById(R.id.midHatchText);
        highHatchT = (TextView) findViewById(R.id.highHatchText);

        lowHatchP = (Button) findViewById(R.id.lowHatchPlus);
        lowHatchP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lowHatch < 20) lowHatch += 1;
                lowHatchT.setText("Low Hatch: " + lowHatch);
            }
        });
        lowHatchM = (Button) findViewById(R.id.lowHatchMinus);
        lowHatchM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lowHatch > 0) lowHatch -= 1;
                lowHatchT.setText("Low Hatch: " + lowHatch);
            }
        });
        midHatchP = (Button) findViewById(R.id.midHatchPlus);
        midHatchP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midHatch < 20) midHatch += 1;
                midHatchT.setText("Mid Hatch: " + midHatch);
            }
        });
        midHatchM = (Button) findViewById(R.id.midHatchMinus);
        midHatchM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midHatch > 0) midHatch -= 1;
                midHatchT.setText("Mid Hatch: " + midHatch);
            }
        });
        highHatchP = (Button) findViewById(R.id.highHatchPlus);
        highHatchP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (highHatch < 20) highHatch += 1;
                highHatchT.setText(("High Hatch: " + highHatch));
            }
        });
        highHatchM = (Button) findViewById(R.id.highHatchMinus);
        highHatchM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (highHatch > 0) highHatch -= 1;
                highHatchT.setText(("High Hatch: " + highHatch));
            }
        });

        // Auto Frontend

        autoHab0 = (Button) findViewById(R.id.autoClimb0);
        autoHab1 = (Button) findViewById(R.id.autoClimb1);
        autoHab2 = (Button) findViewById(R.id.autoClimb2);

        autoHab0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoHab != 0) {
                    autoHab = 0;
                    autoHab0.setTextColor(selTextColor);
                    // autoHab0.setBackgroundTintList(ColorStateList.valueOf(selTintColor));
                    autoHab1.setTextColor(unselTextColor);
                    // autoHab1.setBackgroundTintList(ColorStateList.valueOf(unselTintColor));
                    autoHab2.setTextColor(unselTextColor);
                    // autoHab2.setBackgroundTintList(ColorStateList.valueOf(unselTintColor));
                }
            }
        });
        autoHab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoHab != 1) {
                    autoHab = 1;
                    autoHab1.setTextColor(selTextColor);
                    // autoHab1.setBackgroundTintList(ColorStateList.valueOf(selTintColor));
                    autoHab0.setTextColor(unselTextColor);
                    // autoHab0.setBackgroundTintList(ColorStateList.valueOf(unselTintColor));
                    autoHab2.setTextColor(unselTextColor);
                    // autoHab2.setBackgroundTintList(ColorStateList.valueOf(unselTintColor));
                }
            }
        });
        autoHab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoHab != 2) {
                    autoHab = 2;
                    autoHab2.setTextColor(selTextColor);
                    // autoHab2.setBackgroundTintList(ColorStateList.valueOf(selTintColor));
                    autoHab1.setTextColor(unselTextColor);
                    // autoHab1.setBackgroundTintList(ColorStateList.valueOf(unselTintColor));
                    autoHab0.setTextColor(unselTextColor);
                    // autoHab0.setBackgroundTintList(ColorStateList.valueOf(unselTintColor));
                }
            }
        });
    }
}
