package br.com.paulohpfranco.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout musicPlayerll = findViewById(R.id.musicplayer);

        final MediaPlayer mediaPlayer = new MediaPlayer(this);

        if(mediaPlayer.getmSongName() != null) {
            musicPlayerll.removeAllViews();
            musicPlayerll.addView(mediaPlayer.createView());
            musicPlayerll.setVisibility(View.VISIBLE);
            Log.v("Activity Playlist", "Visibility: "+musicPlayerll.getVisibility());
        }


        // Find the View that shows the playlist category
        TextView queenPlaylistTextView = findViewById(R.id.mainactivity_queen);

        queenPlaylistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, QueenPlaylistActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the playlist category
        TextView tobymacPlaylistTextView = findViewById(R.id.mainactivity_tobymac);

        tobymacPlaylistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, TobyMacPlaylistActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });
    }
}
