package com.lol.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AllView allView;
    final String TAG = "WORK";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        allView = findViewById(R.id.all_view);
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onCreate1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onCreate2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onCreate3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onCreate4");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onCreate5");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onCreate6");
    }

    public void plusPenguin(View view) {
        allView.penguins[allView.n] = new Penguin(200, 200);
        allView.n++;
    }
}
