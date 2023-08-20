package com.example.xo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.xo.R;

public class MainActivity extends AppCompatActivity {

    Button buton1, buton2, buton3, buton4, buton5, buton6, buton7, buton8, buton9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton1 = (Button) findViewById(R.id.btn1);
        buton2 = (Button) findViewById(R.id.btn2);
        buton3 = (Button) findViewById(R.id.btn3);
        buton4 = (Button) findViewById(R.id.btn4);
        buton5 = (Button) findViewById(R.id.btn5);
        buton6 = (Button) findViewById(R.id.btn6);
        buton7 = (Button) findViewById(R.id.btn7);
        buton8 = (Button) findViewById(R.id.btn8);
        buton9 = (Button) findViewById(R.id.btn9);
        turn = 1;

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        buton1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton1.setText("O");
                    }
                }
                endGame();
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton2.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton2.setText("O");
                    }
                }
                endGame();
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton3.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton3.setText("O");
                    }
                }
                endGame();
            }
        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton4.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton4.setText("O");
                    }
                }
                endGame();
            }
        });
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton5.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton5.setText("O");
                    }
                }
                endGame();
            }
        });
        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton6.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton6.setText("O");
                    }
                }
                endGame();
            }
        });
        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton7.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton7.setText("O");
                    }
                }
                endGame();
            }
        });
        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton8.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton8.setText("O");
                    }
                }
                endGame();
            }
        });
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buton9.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        buton9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        buton9.setText("O");
                    }
                }
                endGame();
            }
        });
    }

    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;

        a = buton1.getText().toString();
        b = buton2.getText().toString();
        c = buton3.getText().toString();
        d = buton4.getText().toString();
        e = buton5.getText().toString();
        f = buton6.getText().toString();
        g = buton7.getText().toString();
        h = buton8.getText().toString();
        i = buton9.getText().toString();


        if(a.equals("X")&&b.equals("X")&&c.equals("X") || d.equals("X")&&e.equals("X")&&f.equals("X") || g.equals("X")&&h.equals("X")&&i.equals("X") || a.equals("X")&&e.equals("X")&&i.equals("X") || c.equals("X")&&e.equals("X")&&g.equals("X")){
            Toast.makeText(getApplicationContext(),"Winner is X",Toast.LENGTH_SHORT).show();
            end = true;
        }

        if(a.equals("O")&&b.equals("O")&&c.equals("O") || d.equals("O")&&e.equals("O")&&f.equals("O") || g.equals("O")&&h.equals("O")&&i.equals("O") || a.equals("O")&&e.equals("O")&&i.equals("O") || c.equals("O")&&e.equals("O")&&g.equals("O")){
            Toast.makeText(getApplicationContext(),"Winner is O",Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (end) {
            buton1.setEnabled(false);
            buton2.setEnabled(false);
            buton3.setEnabled(false);
            buton4.setEnabled(false);
            buton5.setEnabled(false);
            buton6.setEnabled(false);
            buton7.setEnabled(false);
            buton8.setEnabled(false);
            buton9.setEnabled(false);
        }
    }
}