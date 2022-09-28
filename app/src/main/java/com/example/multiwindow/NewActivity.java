package com.example.multiwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Button btnBerita = findViewById(R.id.btn_berita);
        Button btnProfile = findViewById(R.id.btn_profile);
        Button btnExit = findViewById(R.id.btn_exit);

        btnBerita.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(NewActivity.this, ));
            }
        }

        );
        }
    }
}