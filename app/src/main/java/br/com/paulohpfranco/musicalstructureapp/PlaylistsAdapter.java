package br.com.paulohpfranco.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistsAdapter extends ArrayAdapter<Playlist> {

    public PlaylistsAdapter(Context context, ArrayList<Playlist> album) {
        super(context, 0, album);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_song, parent, false);
        }

        Playlist currentWord = getItem(position);

        ImageView albumImageView = listItemView.findViewById(R.id.list_song_albumImage);
        albumImageView.setImageResource(currentWord.getmImageResourceId());

        TextView songNameTextView = listItemView.findViewById(R.id.list_song_songName);
        songNameTextView.setText(currentWord.getmSongName());

        TextView albumNameTextView = listItemView.findViewById(R.id.list_song_albumName);
        albumNameTextView.setText(currentWord.getmAlbumName());

        TextView artistNameTextView = listItemView.findViewById(R.id.list_song_artistName);
        artistNameTextView.setText(currentWord.getmArtistName());

        return listItemView;

    }
}
