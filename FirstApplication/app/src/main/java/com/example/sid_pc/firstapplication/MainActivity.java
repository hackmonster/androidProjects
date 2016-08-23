package com.example.sid_pc.firstapplication;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    boolean track[] = new boolean[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);

        b1.setOnClickListener(mhandler);
        b2.setOnClickListener(mhandler);
        b3.setOnClickListener(mhandler);
        b4.setOnClickListener(mhandler);
        b5.setOnClickListener(mhandler);
        b6.setOnClickListener(mhandler);
        b7.setOnClickListener(mhandler);
        b8.setOnClickListener(mhandler);
        b9.setOnClickListener(mhandler);

        for(int i=0;i<9;i++)
            track[i] = false;
    }

    View.OnClickListener mhandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.button1:
                    track[0] = true;b1.setBackgroundColor(Color.BLUE);b1.setClickable(false);break;
                case R.id.button2:
                    track[1] = true;b2.setBackgroundColor(Color.BLUE);b2.setClickable(false);break;
                case R.id.button3:
                    track[2] = true;b3.setBackgroundColor(Color.BLUE);b3.setClickable(false);break;
                case R.id.button4:
                    track[3] = true;b4.setBackgroundColor(Color.BLUE);b4.setClickable(false);break;
                case R.id.button5:
                    track[4] = true;b5.setBackgroundColor(Color.BLUE);b5.setClickable(false);break;
                case R.id.button6:
                    track[5] = true;b6.setBackgroundColor(Color.BLUE);b6.setClickable(false);break;
                case R.id.button7:
                    track[6] = true;b7.setBackgroundColor(Color.BLUE);b7.setClickable(false);break;
                case R.id.button8:
                    track[7] = true;b8.setBackgroundColor(Color.BLUE);b8.setClickable(false);break;
                case R.id.button9:
                    track[8] = true;b9.setBackgroundColor(Color.BLUE);b9.setClickable(false);break;
                default:
                    break;
            }
            System.out.println(view.getId()+" Pressed");
        }
    };
}
