package br.com.paulohpfranco.musicalstructureapp;

public class Playlist {

    private String mSongName;

    private String mAlbumName;

    private String mArtistName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Playlist(String songName, String AlbumName, String ArtistName, int ImageResourceId) {
        mSongName = songName;
        mAlbumName = AlbumName;
        mArtistName = ArtistName;
        mImageResourceId = ImageResourceId;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmAlbumName() {
        return mAlbumName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
