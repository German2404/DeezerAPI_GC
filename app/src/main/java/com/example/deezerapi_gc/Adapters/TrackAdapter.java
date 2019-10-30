package com.example.deezerapi_gc.Adapters;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deezerapi_gc.HTTPSWebUtilDomi;
import com.example.deezerapi_gc.Model.Playlist;
import com.example.deezerapi_gc.Model.Track;
import com.example.deezerapi_gc.Model.TrackDetail;
import com.example.deezerapi_gc.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;

public class TrackAdapter extends BaseAdapter {
    ArrayList<TrackDetail> tracks;

    public TrackAdapter(){
        tracks = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return tracks.size();
    }

    @Override
    public Object getItem(int i) {
        return tracks.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View playlistview = inflater.inflate(R.layout.track_adapter_layout, null);
        ImageView image = playlistview.findViewById(R.id.imageViewTrack);
        TextView tvname = playlistview.findViewById(R.id.textNameTrack);
        TextView tvartist = playlistview.findViewById(R.id.textArtistTrack);
        TextView tvdate = playlistview.findViewById(R.id.textDateTrack);

        tvname.setText(tracks.get(i).getTitle());
        tvartist.setText(tracks.get(i).getArtist().getName());
        tvdate.setText(tracks.get(i).getRelease_date().split("-")[0]);
        String picture=tracks.get(i).getAlbum().getCover();

        Picasso.get().load(picture).into(image);

        return playlistview;
    }

    public void setTracks(ArrayList<TrackDetail> tracks){
        this.tracks=tracks;
        notifyDataSetChanged();
    }

    public void addTrack(TrackDetail track){
        tracks.add(track);
        notifyDataSetChanged();
    }
}
