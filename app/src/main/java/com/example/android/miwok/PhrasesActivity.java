package com.example.android.miwok;

import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();

    /**
     * This listener gets triggered when the {@link MediaPlayer } has completed
     * playing the music file
     */

    private MediaPlayer.OnCompletionListener mCompletitionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        phrases.add(new Word("What is your name", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        phrases.add(new Word("My name is..", "oyaaset..,", R.raw.phrase_my_name_is));
        phrases.add(new Word("How are you feeling", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("I'm feeling good", "kuchi achit", R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Are you coming", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        phrases.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        phrases.add(new Word("I'm coming", "әәnәm", R.raw.phrase_im_coming));
        phrases.add(new Word("I'm feeling good", "kuchi achit", R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Are you coming", "әәnәs'aa?", R.raw.phrase_are_you_coming));

        WordAdapter adapter = new WordAdapter(this, phrases, R.color.category_phrases);
        ListView phrases_list = (ListView) findViewById(R.id.list);
        phrases_list.setAdapter(adapter);

        phrases_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = phrases.get(position);
                Log.v("Phrases Activity", "current word" + word);
                Toast.makeText(PhrasesActivity.this, "Item on Phrases Activity is clicked", Toast.LENGTH_SHORT);

                // Release the media player if it currently exists because we are about to
                // play a different sound file.
                releaseMediaPlayer();

                //create and setup the {@link MediaPlayer} for the audio resource associated
                //with the current word
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());

                //start the audio file
                mediaPlayer.start();

                //this is not a good way to release the media player for every time playing is
                //finished there is a completitoin listener set up, not efficient, so
                // a better way is to extract the MediaPlayer.OnCompletionListener as a private
                // global variable and pass it to the setOnCompletionListener method instead as below
                //mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                //    @Override
                //   public void onCompletion(MediaPlayer mp) {
                //       releaseMediaPlayer();

                //    }
                //});


                mediaPlayer.setOnCompletionListener(mCompletitionListener);

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player and release its resoures
     */
    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
            Toast.makeText(PhrasesActivity.this, "Release is called to clean the resource", Toast.LENGTH_SHORT).show();
        }
    }

}

