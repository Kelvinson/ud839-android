/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Set up the media player for playing the recording of the miwok words.

        //Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a clicklistener on that view numbers to make the toast with the text "open the list of numbers"
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        //set the OnClickListener event to make the toast with text "open the list of family"
         TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                Toast.makeText(view.getContext(), "Open the list of family", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        //set the OnClickListener event to make the toast with text "open the list of colors"
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of colors", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);
            }
        });

        //set the OnClickListener event to make the toast with text "open the list of phrases"
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);
            }
        });
    }

    public void openNumbersList(View view) {

        Intent numbersIntent = new Intent(this, NumbersActivity.class);
        startActivity(numbersIntent);
    }

    public void openFamilyList(View view) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void openPhrasesList(View view) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
}
