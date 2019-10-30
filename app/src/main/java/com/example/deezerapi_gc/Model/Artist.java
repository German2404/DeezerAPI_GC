package com.example.deezerapi_gc.Model;

public class Artist {

    long id;
    String name;
    String link;
    String tracklist;
    String type;

    public Artist() {
    }

    public Artist(long id, String name, String link, String tracklist, String type) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.tracklist = tracklist;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
