package org.team997.spartanscout;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
        requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 2);
        requestPermissions(new String[]{Manifest.permission.ACCESS_MEDIA_LOCATION}, 2);
    }
}
