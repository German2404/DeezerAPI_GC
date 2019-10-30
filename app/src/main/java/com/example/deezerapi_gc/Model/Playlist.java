package com.example.deezerapi_gc.Model;

import com.google.gson.annotations.SerializedName;

public class Playlist {

    long id;
    String title;
    @SerializedName("public")
    boolean _public;
    long nb_tracks;
    String link;
    String picture;
    String picture_small;
    String picture_medium;
    String picture_big;
    String picture_xl;
    String checksum;
    String tracklist;
    String creation_date;
    User user;

    public Playlist() {
    }

    public Playlist(String picture, long id, String title, boolean _public, long nb_tracks, String link, String picture_small, String picture_medium, String picture_big, String picture_xl, String checksum, String tracklist, String creation_date, User user) {
        this.id = id;
        this.title = title;
        this._public = _public;
        this.nb_tracks = nb_tracks;
        this.link = link;
        this.picture_small = picture_small;
        this.picture_medium = picture_medium;
        this.picture_big = picture_big;
        this.picture_xl = picture_xl;
        this.checksum = checksum;
        this.tracklist = tracklist;
        this.creation_date = creation_date;
        this.user = user;
        this.picture=picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean is_public() {
        return _public;
    }

    public void set_public(boolean _public) {
        this._public = _public;
    }

    public long getNb_tracks() {
        return nb_tracks;
    }

    public void setNb_tracks(long nb_tracks) {
        this.nb_tracks = nb_tracks;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicture_small() {
        return picture_small;
    }

    public void setPicture_small(String picture_small) {
        this.picture_small = picture_small;
    }

    public String getPicture_medium() {
        return picture_medium;
    }

    public void setPicture_medium(String picture_medium) {
        this.picture_medium = picture_medium;
    }

    public String getPicture_big() {
        return picture_big;
    }

    public void setPicture_big(String picture_big) {
        this.picture_big = picture_big;
    }

    public String getPicture_xl() {
        return picture_xl;
    }

    public void setPicture_xl(String picture_xl) {
        this.picture_xl = picture_xl;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
