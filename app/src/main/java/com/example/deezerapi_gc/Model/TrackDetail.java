package com.example.deezerapi_gc.Model;

import java.util.ArrayList;

public class TrackDetail {

    long id;
    boolean readable;
    String title;
    String title_short;
    String title_version;
    String isrc;
    String link;
    String share;
    long duration;
    long track_position;
    long disk_number;
    long rank;
    String release_date;
    boolean explicit_lyrics;
    long explicit_content_lyrics;
    long explicit_content_cover;
    String preview;
    double bpm;
    double gain;
    ArrayList<String> available_countries;
    //String contributors;
    Artist artist;
    Album album;
    String type;

    public TrackDetail(long id, boolean readable, String title, String title_short, String title_version, String isrc, String link, String share, long duration, long track_position, long disk_number, long rank, String release_date, boolean explicit_lyrics, long explicit_content_lyrics, long explicit_content_cover, String preview, double bpm, double gain, ArrayList<String> available_countries, String contributors, Artist artist, Album album, String type) {
        this.id = id;
        this.readable = readable;
        this.title = title;
        this.title_short = title_short;
        this.title_version = title_version;
        this.isrc = isrc;
        this.link = link;
        this.share = share;
        this.duration = duration;
        this.track_position = track_position;
        this.disk_number = disk_number;
        this.rank = rank;
        this.release_date = release_date;
        this.explicit_lyrics = explicit_lyrics;
        this.explicit_content_lyrics = explicit_content_lyrics;
        this.explicit_content_cover = explicit_content_cover;
        this.preview = preview;
        this.bpm = bpm;
        this.gain = gain;
        this.available_countries = available_countries;
        //this.contributors = contributors;
        this.artist = artist;
        this.album = album;
        this.type = type;
    }

    public TrackDetail() {
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

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getTrack_position() {
        return track_position;
    }

    public void setTrack_position(long track_position) {
        this.track_position = track_position;
    }

    public long getDisk_number() {
        return disk_number;
    }

    public void setDisk_number(long disk_number) {
        this.disk_number = disk_number;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
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

    public double getBpm() {
        return bpm;
    }

    public void setBpm(double bpm) {
        this.bpm = bpm;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public ArrayList<String> getAvailable_countries() {
        return available_countries;
    }

    public void setAvailable_countries(ArrayList<String> available_countries) {
        this.available_countries = available_countries;
    }

//    public String getContributors() {
//        return contributors;
//    }
//
//    public void setContributors(String contributors) {
//        this.contributors = contributors;
//    }

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
