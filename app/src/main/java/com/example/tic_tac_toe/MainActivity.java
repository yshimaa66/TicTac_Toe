package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.os.Trace.isEnabled;

public class MainActivity extends AppCompatActivity {

    TextView player1,player2,ox1,ox2,score1,score2;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,changebtn;

    String player1str = null,player2str = null,o = null,x;

    int score1int,score2int,win=0;

    String[] lastplay={""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        player1=findViewById(R.id.player1main);
        player2=findViewById(R.id.player2main);
        ox1=findViewById(R.id.OX1);
        ox2=findViewById(R.id.OX2);
        score1=findViewById(R.id.scoreplayer1);
        score2=findViewById(R.id.scoreplayer2);

        score1int=Integer.parseInt(score1.getText().toString());
        score2int=Integer.parseInt(score2.getText().toString());


        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        changebtn=findViewById(R.id.change);

        changebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(ox1.getText().toString().equals("O")){

                    ox1.setText("X");

                    ox2.setText("O");



                }else{


                    ox1.setText("O");

                    ox2.setText("X");


                }


            }
        });







        Bundle extras = getIntent().getExtras();

        if (extras != null) {

            player1str = extras.getString("player1str");
            player2str = extras.getString("player2str");

            o = extras.getString("O");
            x =  extras.getString("X");


        }

        player1.setText(player1str);
        player2.setText(player2str);

        if(o.matches("1")){

            ox1.setText("O");
            ox2.setText("X");


        }else{

            ox2.setText("O");
            ox1.setText("X");

        }

        lastplay = new String[]{""};

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn1.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn1.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn1.setEnabled(false);
                changebtn.setEnabled(false);
                winner();
                drawcheck();


            }
        });





        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn2.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn2.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn2.setEnabled(false);
                changebtn.setEnabled(false);

                winner();
                drawcheck();


            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn3.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn3.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn3.setEnabled(false);
                changebtn.setEnabled(false);

                winner();
                drawcheck();


            }
        });



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn4.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn4.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn4.setEnabled(false);

                changebtn.setEnabled(false);


                winner();
                drawcheck();


            }
        });




        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn5.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn5.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn5.setEnabled(false);

                changebtn.setEnabled(false);


                winner();
                drawcheck();


            }
        });





        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn6.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn6.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn6.setEnabled(false);

                changebtn.setEnabled(false);

                winner();
                drawcheck();


            }
        });






        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn7.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn7.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn7.setEnabled(false);

                changebtn.setEnabled(false);


                winner();
                drawcheck();


            }
        });



        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn8.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn8.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn8.setEnabled(false);

                changebtn.setEnabled(false);


                winner();
                drawcheck();


            }
        });




        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastplay[0].matches(ox2.getText().toString())||lastplay[0].matches("")){

                    btn9.setText(ox1.getText().toString());
                    lastplay[0] =ox1.getText().toString();
                }else{

                    btn9.setText(ox2.getText().toString());
                    lastplay[0] =ox2.getText().toString();

                }

                btn9.setEnabled(false);

                changebtn.setEnabled(false);


                winner();
                drawcheck();

            }
        });







    }



    public void drawcheck(){

        if(!btn1.isEnabled()&&!btn2.isEnabled()&&!btn3.isEnabled()&&!btn4.isEnabled()
                &&!btn5.isEnabled()&&!btn6.isEnabled()&&!btn7.isEnabled()&&!btn8.isEnabled()&&!btn9.isEnabled()){

            if(win==0){

            alert("Draw");

            }
        }

    }

    public void winner(){

win=0;

        if(btn1.getText().toString().equals(btn2.getText().toString())){
            if(btn1.getText().toString().equals(btn3.getText().toString())){
                if(!btn1.getText().toString().equals("")){

                alert(btn1.getText().toString());
                win=1;

            }
            }
        }


        if(btn4.getText().toString().equals(btn5.getText().toString())){
            if(btn4.getText().toString().equals(btn6.getText().toString())){
                if(!btn4.getText().toString().equals("")){

                alert(btn4.getText().toString());
                    win=1;

            }}
        }


        if(btn7.getText().toString().equals(btn8.getText().toString())){
            if(btn7.getText().toString().equals(btn9.getText().toString())){
                if(!btn7.getText().toString().equals("")){

                alert(btn7.getText().toString());
                    win=1;


                }
        }}


        if(btn1.getText().toString().equals(btn5.getText().toString())){
            if(btn1.getText().toString().equals(btn9.getText().toString())){
                if(!btn1.getText().toString().equals("")){

                alert(btn1.getText().toString());
                    win=1;


                }}
        }


        if(btn3.getText().toString().equals(btn5.getText().toString())){
            if(btn3.getText().toString().equals(btn7.getText().toString())){
                if(!btn3.getText().toString().equals("")){

                alert(btn3.getText().toString());
                    win=1;


                }}
        }



        if(btn1.getText().toString().equals(btn4.getText().toString())){
            if(btn1.getText().toString().equals(btn7.getText().toString())){
                if(!btn1.getText().toString().equals("")){

                alert(btn1.getText().toString());
                    win=1;


                }}
        }


        if(btn2.getText().toString().equals(btn5.getText().toString())){
            if(btn2.getText().toString().equals(btn8.getText().toString())){
                if(!btn2.getText().toString().equals("")){

                alert(btn2.getText().toString());
                    win=1;


                }}
        }


        if(btn3.getText().toString().equals(btn6.getText().toString())){
            if(btn3.getText().toString().equals(btn9.getText().toString())){
                if(!btn3.getText().toString().equals("")){

                alert(btn3.getText().toString());
                    win=1;


                }}
        }





    }


    public void alert(String ms){


        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);




        if(ms.equals("Draw")){

            builder1.setTitle("Draw !!!");

       startover();



        }


       else if(ox1.getText().toString().equals(ms)){
            builder1.setTitle(player1str+" is the winner");
            score1int++;
            score1.setText(score1int+"");

           startover();



        }else if(ox2.getText().toString().equals(ms)){

            builder1.setTitle(player2str+" is the winner");
            score2int++;
            score2.setText(score2int+"");

          startover();

        }




        builder1.setMessage("Do you want to start a new game");

        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


startover();

                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Intent intent = new Intent(MainActivity.this,PlayerActivity.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }



    public  void startover(){


        changebtn.setEnabled(true);

        lastplay = new String[]{""};


        btn1.setText("");
        btn1.setEnabled(true);

        btn2.setText("");
        btn2.setEnabled(true);

        btn3.setText("");
        btn3.setEnabled(true);


        btn4.setText("");
        btn4.setEnabled(true);

        btn5.setText("");
        btn5.setEnabled(true);

        btn6.setText("");
        btn6.setEnabled(true);


        btn7.setText("");
        btn7.setEnabled(true);

        btn8.setText("");
        btn8.setEnabled(true);

        btn9.setText("");
        btn9.setEnabled(true);


    }



}
