package org.team997.spartanscout;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.team997.spartanscout.transfer.InfoTransfer;

public class MainActivity extends AppCompatActivity {

    private Button openDeepSpace, write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openDeepSpace = (Button) findViewById(R.id.openDeepSpace);
        openDeepSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DeepSpaceRedo.class);
                startActivity(i);
            }
        });

        write = (Button) findViewById(R.id.write);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoTransfer.WrtieStoredData(getApplicationContext());
            }
        });

        requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
        requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 2);
        requestPermissions(new String[]{Manifest.permission.ACCESS_MEDIA_LOCATION}, 2);
    }
}
