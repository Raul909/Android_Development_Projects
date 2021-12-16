package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("life cycle Event", "In onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("life cycle Event", "In onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("life cycle Event", "In onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("life cycle Event", "In onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("life cycle Event", "In onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("life cycle Event", "In onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("life cycle Event", "In onRestart()");
    }
}