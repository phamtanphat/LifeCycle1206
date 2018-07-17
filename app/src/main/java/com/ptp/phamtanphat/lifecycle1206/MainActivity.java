package com.ptp.phamtanphat.lifecycle1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate");
    }

    @Override
    protected void onStart() {
        Log.d("BBB","onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("BBB","onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("BBB","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("BBB","onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("BBB","onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("BBB","onRestart");
        super.onRestart();
    }
}
