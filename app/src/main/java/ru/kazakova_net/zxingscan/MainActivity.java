package ru.kazakova_net.zxingscan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(getApplicationContext(),CaptureActivity.class);
//        intent.setAction("com.google.zxing.client.android.SCAN");
//        intent.putExtra("SAVE_HISTORY", false);
//        startActivityForResult(intent, 0);
    }
}
