package com.example.deezerapi_gc.Model;

import java.util.ArrayList;

public class TracklistSearch {

    ArrayList<Track> data;
    String checksum;

    public TracklistSearch(ArrayList<Track> data, String checksum) {
        this.data = data;
        this.checksum = checksum;
    }

    public TracklistSearch() {
    }

    public ArrayList<Track> getData() {
        return data;
    }

    public void setData(ArrayList<Track> data) {
        this.data = data;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
}
