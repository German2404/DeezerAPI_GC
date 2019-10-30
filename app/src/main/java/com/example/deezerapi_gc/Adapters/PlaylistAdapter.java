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
import com.example.deezerapi_gc.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;

public class PlaylistAdapter extends BaseAdapter {
    ArrayList<Playlist> playlists;

    public PlaylistAdapter(){
        playlists = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return playlists.size();
    }

    @Override
    public Object getItem(int i) {
        return playlists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View playlistview = inflater.inflate(R.layout.playlist_adapter_layout, null);
        ImageView image = playlistview.findViewById(R.id.imageViewPlaylist);
        TextView tvname = playlistview.findViewById(R.id.textName);
        TextView tvuser = playlistview.findViewById(R.id.textUser);
        TextView tvitems = playlistview.findViewById(R.id.textItems);

        tvname.setText(playlists.get(i).getTitle());
        tvuser.setText(playlists.get(i).getUser().getName());
        tvitems.setText("Songs: "+playlists.get(i).getNb_tracks()+"");
        String picture=playlists.get(i).getPicture();

        Picasso.get().load(picture).into(image);
//        String result="";
//
//        new Thread(
//                () -> {
//                    try {
//                        HTTPSWebUtilDomi util = new HTTPSWebUtilDomi();
//                        String json = util.GETrequest(picture);
//                        Bitmap bm=BitmapFactory.decodeByteArray(json.getBytes(),0,json.length());
//                        image.setImageBitmap(bm);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//        ).start();








//        File file = new File(viewGroup.getContext().getExternalFilesDir(null) + "/" + photos.get(i).getId() + ".png");
//        Bitmap imagen = BitmapFactory.decodeFile(file.toString());
//        rowImage.setImageBitmap(imagen);
        return playlistview;
    }

    public void setPlaylists(ArrayList<Playlist> playlists){
        this.playlists=playlists;
        notifyDataSetChanged();
    }
}
