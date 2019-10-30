package com.example.deezerapi_gc.Model;

public class Track {

    long id;
    boolean readable;
    String title;
    String title_short;
    String title_version;
    String link;
    long duration;
    long rank;
    boolean explicit_lyrics;
    long explicit_content_lyrics;
    long explicit_content_cover;
    String preview;
    long time_add;
    Artist artist;
    Album album;
    String type;

    public Track(long id, boolean readable, String title, String title_short, String title_version, String link, long duration, long rank, boolean explicit_lyrics, long explicit_content_lyrics, long explicit_content_cover, String preview, long time_add, Artist artist, Album album, String type) {
        this.id = id;
        this.readable = readable;
        this.title = title;
        this.title_short = title_short;
        this.title_version = title_version;
        this.link = link;
        this.duration = duration;
        this.rank = rank;
        this.explicit_lyrics = explicit_lyrics;
        this.explicit_content_lyrics = explicit_content_lyrics;
        this.explicit_content_cover = explicit_content_cover;
        this.preview = preview;
        this.time_add = time_add;
        this.artist = artist;
        this.album = album;
        this.type = type;
    }

    public Track() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isReadable() {
        return readable;
    }

    public void setReadable(boolean readable) {
        this.readable = readable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_short() {
        return title_short;
    }

    public void setTitle_short(String title_short) {
        this.title_short = title_short;
    }

    public String getTitle_version() {
        return title_version;
    }

    public void setTitle_version(String title_version) {
        this.title_version = title_version;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public boolean isExplicit_lyrics() {
        return explicit_lyrics;
    }

    public void setExplicit_lyrics(boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }

    public long isExplicit_content_lyrics() {
        return explicit_content_lyrics;
    }

    public void setExplicit_content_lyrics(long explicit_content_lyrics) {
        this.explicit_content_lyrics = explicit_content_lyrics;
    }

    public long isExplicit_content_cover() {
        return explicit_content_cover;
    }

    public void setExplicit_content_cover(long explicit_content_cover) {
        this.explicit_content_cover = explicit_content_cover;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public long getTime_add() {
        return time_add;
    }

    public void setTime_add(long time_add) {
        this.time_add = time_add;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
