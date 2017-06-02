package com.example.android.miwok;

import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // this is building the list of strings using array
//        String [] words  = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";
//        Log.v("NumbersActivity","the first word of the array is: "+words[0]);
//        Log.v("NumbersActivity","the second word of the array is: "+words[1]);
//        for (int i = 0; i < 10; i++) {
//            Log.v("NumbersActivity","the "+i+" th word of the array is: "+words[i]);
//        }

//        //this is building the list of the strings using ArrayList
//        ArrayList<String>  words_array = new ArrayList<String>();
//        words_array.add("one");
//        words_array.add("two");
//        words_array.add("three");
//        words_array.add("four");
//        words_array.add("five");
//        words_array.add("six");
//        words_array.add("seven");
//        words_array.add("eight");
//        words_array.add("nine");
//        words_array.add("ten");
//        words_array.add("eleven");
//        words_array.add("twelve");
//        words_array.add("thirtenn");
//        words_array.add("fourteen");
//        words_array.add("fifteen");
//        words_array.add("sixteen");
//        words_array.add("seventenn");
//        words_array.add("eighteen");
//        words_array.add("ninteen");
//        words_array.add("twenty");

        //root view is the NumbersActivity view
//        LinearLayout rootView = (LinearLayout)findViewById(R.id.list);

        //child view is the new created textview
        //from waterloo university's visualizer website, the new TextView object in every loop is defferent
//        for (int i = 0; i < words_array.size(); i++){ // and so you don't need to change the name of the 10 textViews
//            TextView textView = new TextView(this); //once out of loop the current textView disappear and
//            textView.setText(words_array.get(i)); //next loop begins to create another textView.
//            rootView.addView(textView);
//        }

        //create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine));
        words.add(new Word("ten","na'aacha",R.drawable.number_ten));
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
