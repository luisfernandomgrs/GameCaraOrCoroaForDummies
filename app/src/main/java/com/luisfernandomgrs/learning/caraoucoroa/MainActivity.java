package com.luisfernandomgrs.learning.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imgStartGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Basic Game");

        imgStartGame = findViewById(R.id.imgStartGame);
        imgStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int iCaraOuCoroa = new Random().nextInt(3); // 0, 1 or 2

                //Toast.makeText(getApplicationContext(),"Start Game :)",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), GameResultActivity.class);
                intent.putExtra("valueNumber", iCaraOuCoroa);
                startActivity(intent);
            }
        });
    }
}