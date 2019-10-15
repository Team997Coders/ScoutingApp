package org.team997.spartanscout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.team997.spartanscout.transfer.InfoTransfer;
import org.team997coders.spartanlib.scouting.data.DeepSpaceData;

public class DeepSpaceRedo extends AppCompatActivity {

    private int match = 0, team = 0;
    private DeepSpaceData.Color alliance = DeepSpaceData.Color.Red;

    private int unselTextColor, unselTintColor, selTextColor, selTintColor;

    private boolean limited = false;

    private int lowCargo = 0, midCargo = 0, highCargo = 0, csCargo = 0,
            lowHatch = 0, midHatch = 0, highHatch = 0,
            autoHab = 0, climb = 0, penalties = 0, defense = 0;

    private Button lowCargoP, midCargoP, highCargoP, csCargoP,
            lowCargoM, midCargoM, highCargoM, csCargoM,
            lowHatchP, midHatchP, highHatchP,
            lowHatchM, midHatchM, highHatchM,
            penaltyP, penaltyM,
            autoHab0, autoHab1, autoHab2,
            defense0, defense1, defense2, defense3,
            climb0, climb1, climb2, climb3,
            limitedToggle, allianceToggle, saveData, saveDataAndExit, exitButton;

    private TextView lowCargoT, midCargoT, highCargoT, csCargoT,
            penaltyT, lowHatchT, midHatchT, highHatchT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_space_redo);

        // Color Setup

        selTintColor = 14079959;
        selTextColor = Color.argb(255, 46, 174, 217); // 783211007;
        unselTintColor = 14079959;
        unselTextColor = Color.argb(255, 35, 35, 35); // 589505535;

        // Togggggggglllllleeee

        allianceToggle = (Button) findViewById(R.id.allianceToggle);
        allianceToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alliance == DeepSpaceData.Color.Blue) {
                    alliance = DeepSpaceData.Color.Red;
                    allianceToggle.setText("RED");
                } else {
                    alliance = DeepSpaceData.Color.Blue;
                    allianceToggle.setText("BLUE");
                }
            }
        });

        limitedToggle = (Button) findViewById(R.id.limitedToggle);
        limitedToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (limited) {
                    limited = false;
                    limitedToggle.setText("No");
                } else {
                    limited = true;
                    limitedToggle.setText("Yes");
                }
            }
        });

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

        // Penalty

        penaltyT = (TextView) findViewById(R.id.penaltyText);

        penaltyP = (Button) findViewById(R.id.penaltyPlus);
        penaltyP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (penalties < 99) penalties++;
                penaltyT.setText("Fouls Incurred: " + penalties);
            }
        });
        penaltyM = (Button) findViewById(R.id.penaltyMinus);
        penaltyM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (penalties > 0) penalties--;
                penaltyT.setText("Fouls Incurred: " + penalties);
            }
        });

        // Defense Stuff

        defense0 = (Button) findViewById(R.id.defense0);
        defense1 = (Button) findViewById(R.id.defense1);
        defense2 = (Button) findViewById(R.id.defense2);
        defense3 = (Button) findViewById(R.id.defense3);

        defense0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (defense != 0) {
                    defense = 0;
                    defense0.setTextColor(selTextColor);
                    defense1.setTextColor(unselTextColor);
                    defense2.setTextColor(unselTextColor);
                    defense3.setTextColor(unselTextColor);
                }
            }
        });
        defense1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (defense != 1) {
                    defense = 1;
                    defense1.setTextColor(selTextColor);
                    defense0.setTextColor(unselTextColor);
                    defense2.setTextColor(unselTextColor);
                    defense3.setTextColor(unselTextColor);
                }
            }
        });
        defense2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (defense != 2) {
                    defense = 2;
                    defense2.setTextColor(selTextColor);
                    defense1.setTextColor(unselTextColor);
                    defense0.setTextColor(unselTextColor);
                    defense3.setTextColor(unselTextColor);
                }
            }
        });
        defense3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (defense != 3) {
                    defense = 3;
                    defense3.setTextColor(selTextColor);
                    defense1.setTextColor(unselTextColor);
                    defense2.setTextColor(unselTextColor);
                    defense0.setTextColor(unselTextColor);
                }
            }
        });

        // Climb

        climb0 = (Button) findViewById(R.id.climb0);
        climb1 = (Button) findViewById(R.id.climb1);
        climb2 = (Button) findViewById(R.id.climb2);
        climb3 = (Button) findViewById(R.id.climb3);

        climb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (climb != 0) {
                    climb = 0;
                    climb0.setTextColor(selTextColor);
                    climb1.setTextColor(unselTextColor);
                    climb2.setTextColor(unselTextColor);
                    climb3.setTextColor(unselTextColor);
                }
            }
        });
        climb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (climb != 1) {
                    climb = 1;
                    climb1.setTextColor(selTextColor);
                    climb0.setTextColor(unselTextColor);
                    climb2.setTextColor(unselTextColor);
                    climb3.setTextColor(unselTextColor);
                }
            }
        });
        climb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (climb != 2) {
                    climb = 2;
                    climb2.setTextColor(selTextColor);
                    climb0.setTextColor(unselTextColor);
                    climb1.setTextColor(unselTextColor);
                    climb3.setTextColor(unselTextColor);
                }
            }
        });
        climb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (climb != 3) {
                    climb = 3;
                    climb3.setTextColor(selTextColor);
                    climb0.setTextColor(unselTextColor);
                    climb2.setTextColor(unselTextColor);
                    climb1.setTextColor(unselTextColor);
                }
            }
        });

        // Write and exit

        saveData = (Button) findViewById(R.id.saveData);
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoTransfer.StoreData(getData());
                Intent current = getIntent();
                finish();
                startActivity(current);
            }
        });
        saveDataAndExit = (Button) findViewById(R.id.saveDataAndExit);
        saveDataAndExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoTransfer.StoreData(getData());
                Intent selection = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(selection);
            }
        });
        exitButton = (Button) findViewById(R.id.exit);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selection = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(selection);
            }
        });
    }

    public DeepSpaceData getData() {
        DeepSpaceData dat = new DeepSpaceData();
        dat.teamNumber = team;
        dat.matchNumber = match;
        dat.alliance = alliance;
        dat.lowCargo = lowCargo;
        dat.midCargo = midCargo;
        dat.highCargo = highCargo;
        dat.csCargo = csCargo;
        dat.lowHatch = lowHatch;
        dat.midHatch = midHatch;
        dat.highHatch = highHatch;
        dat.defense = defense;
        dat.climb = climb;
        dat.autoHab = autoHab;
        dat.penalty = penalties;
        return dat;
    }
}
