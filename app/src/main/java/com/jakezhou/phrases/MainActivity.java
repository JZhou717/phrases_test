package com.jakezhou.phrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playSound(View v) {

        String tag = "";
        try {
            tag = (String) v.getTag();
        }
        catch (Exception e) {
            //Unexpected Tag
            e.printStackTrace();
        }

        MediaPlayer mediaPlayer;
        switch(tag) {
            case "hello":
                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
                mediaPlayer.start();
                break;
            case "do you speak english":
                mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                mediaPlayer.start();
                break;
            case "good evening":
                mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
                mediaPlayer.start();
                break;
            case "how are you":
                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
                mediaPlayer.start();
                break;
            case "i live in":
                mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
                mediaPlayer.start();
                break;
            case "my name is":
                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
                mediaPlayer.start();
                break;
            case "please":
                mediaPlayer = MediaPlayer.create(this, R.raw.please);
                mediaPlayer.start();
                break;
            case "welcome":
                mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
                mediaPlayer.start();
                break;
            default:
                break;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
