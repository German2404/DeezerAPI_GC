package com.example.deezerapi_gc.Model;

import java.util.ArrayList;

public class PlaylistSearch {

    ArrayList<Playlist> data;
    long total;
    String next;

    public PlaylistSearch(ArrayList<Playlist> data, long total, String next) {
        this.data = data;
        this.total = total;
        this.next = next;
    }

    public PlaylistSearch() {
    }

    public ArrayList<Playlist> getData() {
        return data;
    }

    public void setData(ArrayList<Playlist> data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
