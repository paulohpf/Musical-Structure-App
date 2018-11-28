package br.com.paulohpfranco.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class TobyMacPlaylistActivity extends AppCompatActivity {

    private ArrayList<Playlist> playlistArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        playlistArray.add(new Playlist("Jesus Freak", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Say The Words (Now)", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Colored People", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Jesus Is Just Alright", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Between You and Me", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Mind's Eye", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Consume Me", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("My Will", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("In The Light", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Socially Acceptable", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Luv Is A Verb", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Supernatural", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("The Hardway", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Godsend", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("What If I Stumble", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));
        playlistArray.add(new Playlist("Red Letters", "Greatest Hits DC Talk", "DC Talk", R.mipmap.dctalk_greatest_hits));

        ListView playlistsListView = findViewById(R.id.playlists_listview);
        PlaylistsAdapter itemsAdapter = new PlaylistsAdapter(this, playlistArray);

        playlistsListView.setAdapter(itemsAdapter);

        final LinearLayout musicPlayerll = findViewById(R.id.musicplayer);

        final MediaPlayer mediaPlayer = new MediaPlayer(this);

        if(mediaPlayer.getmSongName() != null) {
            musicPlayerll.removeAllViews();
            musicPlayerll.addView(mediaPlayer.createView());
            musicPlayerll.setVisibility(View.VISIBLE);
        }

        playlistsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                playlistArray.get(position).getmImageResourceId();

                musicPlayerll.removeAllViews();
                musicPlayerll.addView(mediaPlayer.setNewSong(playlistArray.get(position).getmSongName(), playlistArray.get(position).getmArtistName(), playlistArray.get(position).getmImageResourceId()));
                musicPlayerll.setVisibility(View.VISIBLE);
            }
        });
    }
}
