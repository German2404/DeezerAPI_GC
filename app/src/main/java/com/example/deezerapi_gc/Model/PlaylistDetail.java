package com.example.deezerapi_gc.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PlaylistDetail {

    long id;
    String title;
    String description;
    long duration;
    @SerializedName("public")
    boolean _public;
    boolean is_loved_track;
    boolean collaborative;
    long nb_tracks;
    long fans;
    String link;
    String share;
    String picture;
    String picture_small;
    String picture_medium;
    String picture_big;
    String picture_xl;
    String checksum;
    String tracklist;
    String creation_date;
    User creator;
    String type;
    TracklistSearch tracks;

    public PlaylistDetail(long id, String title, String description, long duration, boolean _public, boolean is_loved_track, boolean collaborative, long nb_tracks, long fans, String link, String share, String picture, String picture_small, String picture_medium, String picture_big, String picture_xl, String checksum, String tracklist, String creation_date, User creator, String type, TracklistSearch tracks) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this._public = _public;
        this.is_loved_track = is_loved_track;
        this.collaborative = collaborative;
        this.nb_tracks = nb_tracks;
        this.fans = fans;
        this.link = link;
        this.share = share;
        this.picture = picture;
        this.picture_small = picture_small;
        this.picture_medium = picture_medium;
        this.picture_big = picture_big;
        this.picture_xl = picture_xl;
        this.checksum = checksum;
        this.tracklist = tracklist;
        this.creation_date = creation_date;
        this.creator = creator;
        this.type = type;
        this.tracks = tracks;
    }

    public PlaylistDetail() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public boolean is_public() {
        return _public;
    }

    public void set_public(boolean _public) {
        this._public = _public;
    }

    public boolean isIs_loved_track() {
        return is_loved_track;
    }

    public void setIs_loved_track(boolean is_loved_track) {
        this.is_loved_track = is_loved_track;
    }

    public boolean isCollaborative() {
        return collaborative;
    }

    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    public long getNb_tracks() {
        return nb_tracks;
    }

    public void setNb_tracks(long nb_tracks) {
        this.nb_tracks = nb_tracks;
    }

    public long getFans() {
        return fans;
    }

    public void setFans(long fans) {
        this.fans = fans;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TracklistSearch getTracks() {
        return tracks;
    }

    public void setTracks(TracklistSearch tracks) {
        this.tracks = tracks;
    }
}
