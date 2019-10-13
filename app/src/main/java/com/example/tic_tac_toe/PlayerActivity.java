package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayerActivity extends AppCompatActivity {

    Button Oplayer1, Xplayer1,Oplayer2, Xplayer2,play;
    EditText player1,player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);


        Oplayer1=findViewById(R.id.player1O);
        Xplayer1=findViewById(R.id.player1x);
        Oplayer2=findViewById(R.id.player2O);
        Xplayer2=findViewById(R.id.player2x);

        final int[] o1 = {0};
        final int[] x1 = {0};
        final int[] o2 = {0};
        final int[] x2 = {0};

        Oplayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               o1[0] = 1;
               o2[0] = 0;
                x1[0] = 0;

                    Oplayer1.setBackgroundColor(Color.parseColor("#888888"));

                    Oplayer2.setBackgroundColor(Color.parseColor("#3CF1EBF1"));

                Xplayer1.setBackgroundColor(Color.parseColor("#3CF1EBF1"));


            }
        });

        Oplayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                o2[0] = 1;
                o1[0] = 0;
                x2[0] = 0;

                    Oplayer2.setBackgroundColor(Color.parseColor("#888888"));

                Oplayer1.setBackgroundColor(Color.parseColor("#3CF1EBF1"));

                Xplayer2.setBackgroundColor(Color.parseColor("#3CF1EBF1"));


            }
        });


        Xplayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x1[0] = 1;
                x2[0] = 0;
                o1[0] = 0;


                    Xplayer1.setBackgroundColor(Color.parseColor("#888888"));

                    Xplayer2.setBackgroundColor(Color.parseColor("#3CF1EBF1"));

                Oplayer1.setBackgroundColor(Color.parseColor("#3CF1EBF1"));


            }
        });


        Xplayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                x2[0] = 1;
                x1[0] = 0;
                o2[0] = 0;


                    Xplayer2.setBackgroundColor(Color.parseColor("#888888"));

                    Xplayer1.setBackgroundColor(Color.parseColor("#3CF1EBF1"));

                Oplayer2.setBackgroundColor(Color.parseColor("#3CF1EBF1"));



            }
        });




        player1=findViewById(R.id.player1);
        player2=findViewById(R.id.player2);

        play=findViewById(R.id.play);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String player1str= player1.getText().toString();
                String player2str= player2.getText().toString();


                if(player1str.matches("")){

                    player1.setError("Enter player 1 name");

                }

                else if(player2str.matches("")){

                    player2.setError("Enter player 2 name");

                }

               else if(o1 [0]==0 && o2 [0] == 0 ){

                   Oplayer1.setError("Press O or X for each player");

                }

                else if(x1 [0]==0 && x2 [0] == 0 ){

                    Xplayer1.setError("Press O or X for each player");

                }else{


                    Intent intent = new Intent(PlayerActivity.this,MainActivity.class);

                    if(o1 [0]==1){
                        intent.putExtra("O","1");
                    }else{
                        intent.putExtra("O","2");
                    }

                    if(x1 [0]==1){
                        intent.putExtra("X","1");
                    }else{
                        intent.putExtra("X","2");
                    }


                    intent.putExtra("player1str",player1str);
                    intent.putExtra("player2str",player2str);

                    startActivity(intent);


                }




            }
        });





    }
}
