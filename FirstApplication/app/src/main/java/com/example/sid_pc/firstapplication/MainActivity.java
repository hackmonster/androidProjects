package com.example.sid_pc.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TableLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

public class MainActivity extends Activity {

    int w_p1 = 0;
    int w_p2 = 0;
    Button b;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b12;
    LinearLayout linearLayout1;
    TableLayout tbl;
    TextView player;
    String final_message = null;

    int track[] = new int[10];
    boolean turn = false;
    int turns;
    int winner = 0;
    Button but;

    PopupWindow popup;
    LinearLayout pop_layout;
    TextView popup_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout1 = (LinearLayout)findViewById(R.id.lout);
        linearLayout1.setBackgroundResource(R.drawable.mainicon);
        tbl = (TableLayout)findViewById(R.id.table);
        tbl.setVisibility(View.INVISIBLE);
        player = (TextView) findViewById(R.id.textView);


        b  = (Button)findViewById(R.id.button);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b12 = (Button)findViewById(R.id.button12);
        b.setOnClickListener(mhandler_base);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    View.OnClickListener mhandler_base = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            linearLayout1.setBackground(null);
            init();
        }
    };
    View.OnClickListener mhandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            turns++;
            if(turns > 0)
            {
                b.setText("RESTART");
                //b.setVisibility(View.VISIBLE);
            }
            turn = !turn;
            int col = Color.WHITE, chCol = Color.BLACK;
            String ch;
            int val;
            player.setBackgroundColor(Color.BLACK);
            player.setTextColor(Color.WHITE);
            if(turn) {
                player.setText("Turn for GREEN [Player "+ ((turns%2+2)%2+1) +"]");
                //col = Color.BLACK;
                ch = "X";
                chCol = Color.RED;
                val = 1;
            }
            else {
                player.setText("Turn for RED [Player "+ ((turns%2+2)%2+1) +"]");
                //col = Color.RED;
                ch = "0";
                chCol = Color.GREEN;
                val = 2;
            }
            switch (view.getId())
            {
                case R.id.button1:
                    track[1] = val;b1.setBackgroundColor(col);b1.setTextColor(chCol);b1.setText(ch);b1.setClickable(false);break;
                case R.id.button2:
                    track[2] = val;b2.setBackgroundColor(col);b2.setTextColor(chCol);b2.setText(ch);b2.setClickable(false);break;
                case R.id.button3:
                    track[3] = val;b3.setBackgroundColor(col);b3.setTextColor(chCol);b3.setText(ch);b3.setClickable(false);break;
                case R.id.button4:
                    track[4] = val;b4.setBackgroundColor(col);b4.setTextColor(chCol);b4.setText(ch);b4.setClickable(false);break;
                case R.id.button5:
                    track[5] = val;b5.setBackgroundColor(col);b5.setTextColor(chCol);b5.setText(ch);b5.setClickable(false);break;
                case R.id.button6:
                    track[6] = val;b6.setBackgroundColor(col);b6.setTextColor(chCol);b6.setText(ch);b6.setClickable(false);break;
                case R.id.button7:
                    track[7] = val;b7.setBackgroundColor(col);b7.setTextColor(chCol);b7.setText(ch);b7.setClickable(false);break;
                case R.id.button8:
                    track[8] = val;b8.setBackgroundColor(col);b8.setTextColor(chCol);b8.setText(ch);b8.setClickable(false);break;
                case R.id.button9:
                    track[9] = val;b9.setBackgroundColor(col);b9.setTextColor(chCol);b9.setText(ch);b9.setClickable(false);break;
                default:
                    break;
            }
            //System.out.println(view.getId()+" Pressed");
            boolean flag = true;

            if(track[1]!= 0 && track[1] == track[2] && track[2] == track[3])
                winner = track[1]; // System.out.println("PLAYER "+ track[1] +" WON");

            else if(track[4] != 0 && track[4] == track[5] && track[5] == track[6])
                winner = track[4]; // System.out.println("PLAYER "+ track[4] +" WON");

            else if(track[7] != 0 && track[7] == track[8] && track[8] == track[9])
                winner = track[7]; // System.out.println("PLAYER "+ track[7] +" WON");

            else if(track[1] != 0 && track[1] == track[4] && track[4] == track[7])
                winner = track[1]; // System.out.println("PLAYER "+ track[1] +" WON");

            else if(track[2] != 0 && track[2] == track[5] && track[5] == track[8])
                winner = track[2]; // System.out.println("PLAYER "+ track[2] +" WON");

            else if(track[3] != 0 && track[3] == track[6] && track[6] == track[9])
                winner = track[3]; // System.out.println("PLAYER "+ track[3] +" WON");

            else if(track[1] != 0 && track[1] == track[5] && track[5] == track[9])
                winner = track[1]; // System.out.println("PLAYER "+ track[1] +" WON");

            else if(track[3] != 0 && track[3] == track[5] && track[5] == track[7])
                winner = track[3]; // System.out.println("PLAYER "+ track[3] +" WON");

            else
                flag = false;

            if(flag || (!flag && turns == 9))
            {
                //deinit();
                player.setTextColor(Color.WHITE);
                player.setBackgroundColor(Color.BLACK);
                if(winner == 1) {
                    w_p1 ++;
                    player.setTextColor(Color.RED);
                    player.setText("Player 1 [RED] WON");
                    final_message = "Player 1 [RED] WON";
                }
                else if(winner == 2){
                    w_p2 ++;
                    player.setTextColor(Color.GREEN);
                    player.setText("Player 2 [GREEN] WON");
                    final_message = "Player 2 [GREEN] WON";
                }
                else{
                    w_p1 ++;
                    w_p2 ++;
                    player.setText("Match was DRAW");
                    final_message = "Match was DRAW";
                }
                deinit();
            }
        }

    };

    void deinit()
    {

        b1.setClickable(false);
        b2.setClickable(false);
        b3.setClickable(false);
        b4.setClickable(false);
        b5.setClickable(false);
        b6.setClickable(false);
        b7.setClickable(false);
        b8.setClickable(false);
        b9.setClickable(false);

        create_popup();
    }
    void create_popup()
    {
        Intent intent = new Intent(this, Pop.class);
        final_message = final_message + "\nSCORE\n-------\n[ P1 : "+ w_p1 + " ]\n[ P2 : "+ w_p2 + " ]";
        intent.putExtra("message", final_message );
        startActivity(intent);
        init();
        //startActivity(new Intent(MainActivity.this,Pop.class));

    }
    void init()
    {
        turns = 0;
        turn = false;
        winner = 0;
        tbl.setVisibility(View.VISIBLE);
        for(int i=0;i<=9;i++)
            track[i] = 0;
        player.setTextColor(Color.WHITE);
        player.setBackgroundColor(Color.BLACK);
        player.setText("GAME STATUS");
        //b.setVisibility(View.INVISIBLE);
        b1.setOnClickListener(mhandler);
        b2.setOnClickListener(mhandler);
        b3.setOnClickListener(mhandler);
        b4.setOnClickListener(mhandler);
        b5.setOnClickListener(mhandler);
        b6.setOnClickListener(mhandler);
        b7.setOnClickListener(mhandler);
        b8.setOnClickListener(mhandler);
        b9.setOnClickListener(mhandler);
        b1.setBackgroundColor(Color.WHITE);b1.setText("");
        b2.setBackgroundColor(Color.WHITE);b2.setText("");
        b3.setBackgroundColor(Color.WHITE);b3.setText("");
        b4.setBackgroundColor(Color.WHITE);b4.setText("");
        b5.setBackgroundColor(Color.WHITE);b5.setText("");
        b6.setBackgroundColor(Color.WHITE);b6.setText("");
        b7.setBackgroundColor(Color.WHITE);b7.setText("");
        b8.setBackgroundColor(Color.WHITE);b8.setText("");
        b9.setBackgroundColor(Color.WHITE);b9.setText("");
    }
}
