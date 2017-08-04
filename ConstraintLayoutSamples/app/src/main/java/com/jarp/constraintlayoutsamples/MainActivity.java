package com.jarp.constraintlayoutsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                startActivity(new Intent(MainActivity.this,HelloWorldActivity.class));
                return;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this,HelloWorldActivity.class));
                return;
            default:
                Toast.makeText(MainActivity.this,"Unknown click view",Toast.LENGTH_SHORT).show();
        }
    }
}
