package com.example.dellayush.videoplayer;

import android.os.Bundle;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener myListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.view);
        myListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                List<String> myString = new ArrayList<String>();
                myString.add("Ax0G_P2dSBw");
                myString.add("cF2yqyiJACk");
                myString.add("8DMF0U6xV78");
                youTubePlayer.loadVideos(myString);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(YouTubeCredentials.getApiKey(), myListener);
    }

}
