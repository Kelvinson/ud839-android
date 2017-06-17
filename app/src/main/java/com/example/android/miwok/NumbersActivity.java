//region Description
package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.bluetooth.BluetoothClass.Service.AUDIO;
import static android.media.AudioManager.AUDIOFOCUS_GAIN;
import static android.media.AudioManager.AUDIOFOCUS_LOSS;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK;
import static android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED;
import static android.media.CamcorderProfile.get;

public class NumbersActivity extends AppCompatActivity {

//    private MediaPlayer mediaPlayer;
//
//    private AudioManager mAudioManager;
//
//    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
//        @Override
//        public void onAudioFocusChange(int focusChange) {
//            if (focusChange == AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                mediaPlayer.pause();
//                mediaPlayer.seekTo(0);
//            } else if (focusChange == AUDIOFOCUS_GAIN) {
//                //The AUDIOFOCUS_GAIN means the media player has regained focus and can resume playback
//                mediaPlayer.start();
//            } else if (focusChange == AUDIOFOCUS_LOSS) {
//                //AUDIOFOCUS_LOSS means that we've lost audio focus and stop playback and clean the
//                //media resources.
//                mediaRelease();
//            }
//        }
//    };
//    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mp) {
//            mediaRelease();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();

//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
//        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
//        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
//        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
//        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
//        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
//        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
//        words.add(new Word("nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
//        words.add(new Word("ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));
//
//        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
//
//        ListView listView = (ListView) findViewById(R.id.list);


    }
}
//endregion
