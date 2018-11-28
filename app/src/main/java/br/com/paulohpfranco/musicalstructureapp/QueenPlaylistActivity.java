package br.com.paulohpfranco.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class QueenPlaylistActivity extends AppCompatActivity {

    private ArrayList<Playlist> playlistArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        playlistArray.add(new Playlist("Bohemian Rhapsody", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Another One Bites the Dust", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Killer Queen", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Fat Bottomed Girls", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Bicycle Race", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("You're My Best Friend", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Don't Stop Me Now", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Save Me", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Crazy Little Thing Called Love", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Somebody to Love", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Now I'm Here", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Good Old-Fashioned Lover Boy", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Play the Game", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Flash", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("Seven Seas of Rhye", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("We Will Rock You", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));
        playlistArray.add(new Playlist("We Are the Champions", "Greatest Hits Queen", "Queen", R.mipmap.queen_greatest_hits));

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
