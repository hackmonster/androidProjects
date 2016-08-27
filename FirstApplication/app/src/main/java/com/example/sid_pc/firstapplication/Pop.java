package com.example.sid_pc.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by SID-PC on 8/27/2016.
 */
public class Pop extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);
        Bundle bun = getIntent().getExtras();
        String message = bun.getString("message");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width  = dm.widthPixels;
        getWindow().setLayout((int)(width*0.8), (int)(height*0.6));
        Button b = (Button)findViewById(R.id.button10);
        Button exit_button = (Button)findViewById(R.id.button11);
        TextView fin_tv = (TextView) findViewById(R.id.textView2);
        fin_tv.setText(message);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        exit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}
