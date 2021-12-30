package com.example.myveganmate_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cameraButton = (Button) findViewById(R.id.btnCamera);
        cameraButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CameraActivity.class);
                startActivity(intent);

            }

        });

        Button dictionaryButton = (Button) findViewById(R.id.btnDictionary);
        dictionaryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DictionaryActivity.class);
                startActivity(intent);

            }

        });

        Button listButton = (Button) findViewById(R.id.btnList);
        listButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
            }

        });

        Button bookmarkButton = (Button) findViewById(R.id.btnBookmark);
        bookmarkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BookmarkActivity.class);
                startActivity(intent);
            }
        });

    }
}
