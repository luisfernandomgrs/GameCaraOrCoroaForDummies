package com.luisfernandomgrs.learning.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GameResultActivity extends AppCompatActivity {
    private ImageView imageReturnActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_result);

        this.setTitle("Basic Game | Result :)");

        //valueNumber
        Bundle getValues = getIntent().getExtras();
        int iValueSorted = getValues.getInt("valueNumber");

        imageReturnActivity = findViewById(R.id.imageResultGame);
        if (iValueSorted == 0) {
            imageReturnActivity.setImageResource(R.drawable.moeda_cara);
        }
        else {
            imageReturnActivity.setImageResource(R.drawable.moeda_coroa);
        }

        imageReturnActivity = findViewById(R.id.imageReturnActivity);

        imageReturnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                */
                finish();
            }
        });

    }
}