package br.com.paulohpfranco.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MediaPlayer extends LinearLayout {

    /**
     * Constant value that represents no image was provided for this album
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    private static String mSongName;

    private static String mArtistName;

    private static int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Media Player object.
     */

    ImageView mediaplayer_albumImage;
    TextView mediaplayer_songName;
    TextView mediaplayer_artistName;

    public MediaPlayer(Context context) {
        super(context);
    }

    public View setNewSong(String songName, String artistName, int ImageResourceId){

        this.mSongName = songName;
        this.mArtistName = artistName;
        this.mImageResourceId = ImageResourceId;

        return createView();
    }

    public View createView() {
        View musicPlayerInflater = LayoutInflater.from(getContext()).inflate(R.layout.mediaplayer, null);

        mediaplayer_albumImage = musicPlayerInflater.findViewById(R.id.mediaplayer_albumImage);
        mediaplayer_albumImage.setImageResource(this.mImageResourceId);

        mediaplayer_songName = musicPlayerInflater.findViewById(R.id.mediaplayer_songName);
        mediaplayer_songName.setText(this.mSongName);

        mediaplayer_artistName = musicPlayerInflater.findViewById(R.id.mediaplayer_artistName);
        mediaplayer_artistName.setText(this.mArtistName);

        return musicPlayerInflater;
    }

    public static String getmSongName() {
        return mSongName;
    }
}
