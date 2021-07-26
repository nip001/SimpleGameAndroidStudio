package com.batch9.ujianke6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CardView[][] penampung = new CardView[6][6];

    Button btn_atas,btn_bawah,btn_kiri,btn_kanan;

    int x=0;
    int y=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_atas = findViewById(R.id.btnAtas);
        btn_bawah = findViewById(R.id.btnBawah);
        btn_kiri = findViewById(R.id.btnKiri);
        btn_kanan = findViewById(R.id.btnKanan);

        for (int i = 0 ; i<6;i++){
            for (int j=0;j<6;j++){
                String temp = "card"+i+j;
                penampung[i][j] = findViewById(getResources().getIdentifier(temp,"id",getPackageName()));
            }
        }

        //SET PLAYER
        penampung[0][0].setCardBackgroundColor(Color.BLACK);

        btn_bawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((y < 5)&&(y >= 0)){
                    y=y+1;
                }

                if(penampung[y][x].getCardBackgroundColor().getDefaultColor() == -16777216){

                    penampung[y][x].setCardBackgroundColor(Color.WHITE);
                }else{
                    penampung[y][x].setCardBackgroundColor(Color.BLACK);

                }

            }
        });

        btn_kanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((x<5)&&(y>=0)){
                    x+=1;
                }
                if(penampung[y][x].getCardBackgroundColor().getDefaultColor() == -16777216){

                    penampung[y][x].setCardBackgroundColor(Color.WHITE);
                }else{
                    penampung[y][x].setCardBackgroundColor(Color.BLACK);

                }
            }
        });

        btn_atas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((y<=5)&&(y>0)){
                    y-=1;
                }
                if(penampung[y][x].getCardBackgroundColor().getDefaultColor() == -16777216){

                    penampung[y][x].setCardBackgroundColor(Color.WHITE);
                }else{
                    penampung[y][x].setCardBackgroundColor(Color.BLACK);

                }

            }
        });
        btn_kiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((x<=5)&&(x>0)){
                    x-=1;
                }

                if(penampung[y][x].getCardBackgroundColor().getDefaultColor() == -16777216){

                    penampung[y][x].setCardBackgroundColor(Color.WHITE);
                }else{
                    penampung[y][x].setCardBackgroundColor(Color.BLACK);

                }
            }
        });
    }
}