package com.jarp.constraintlayoutsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] validButtons = new int[]{
            R.id.helloworld_btn,
            R.id.bias_btn,
            R.id.inferece_btn,
            R.id.real_world_btn,
            R.id.chain_btn,
            R.id.guidelines_btn

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int idx = 0; idx < validButtons.length; idx++) {
            findViewById(validButtons[idx]).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.helloworld_btn:
                startActivity(new Intent(MainActivity.this, HelloWorldActivity.class));
                return;
            case R.id.bias_btn:
                startActivity(new Intent(MainActivity.this, BiasActivity.class));
                return;
            case R.id.inferece_btn:
                startActivity(new Intent(MainActivity.this, InferenceActivity.class));
                return;
            case R.id.real_world_btn:
                startActivity(new Intent(MainActivity.this, RealExampleActivity.class));
                return;
            case R.id.chain_btn:
                startActivity(new Intent(MainActivity.this, ChainActivity.class));
                return;
            case R.id.guidelines_btn:
                startActivity(new Intent(MainActivity.this, GuideLinesActivity.class));
                return;
            default:
                Toast.makeText(MainActivity.this, "Unknown click view", Toast.LENGTH_SHORT).show();
        }
    }
}
