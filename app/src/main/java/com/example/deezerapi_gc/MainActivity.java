package com.example.deezerapi_gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.deezerapi_gc.Adapters.PlaylistAdapter;
import com.example.deezerapi_gc.Model.Artist;
import com.example.deezerapi_gc.Model.Playlist;
import com.example.deezerapi_gc.Model.PlaylistSearch;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewPlaylist;
    ImageButton imgButtonSearch;
    EditText editTextSearch;
    PlaylistAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPlaylist=findViewById(R.id.listViewPlaylists);
        imgButtonSearch=findViewById(R.id.imageButtonSearch);
        editTextSearch=findViewById(R.id.editTextSearch);
        adapter=new PlaylistAdapter();
        listViewPlaylist.setAdapter(adapter);

        listViewPlaylist.setOnItemClickListener((parent, view, position, id) -> {
            long itemId=((Playlist)(adapter.getItem(position))).getId();
            Intent i=new Intent(MainActivity.this,TracklistActivity.class);
            i.putExtra("id",itemId);
            startActivity(i);

        });

        imgButtonSearch.setOnClickListener((view)->{

            String playlistSearch=editTextSearch.getText().toString();
            String urlSearch="https://api.deezer.com/search/playlist/?q="+playlistSearch+"&index=0&output=json";

            new Thread(
                    () -> {
                        try {
                            HTTPSWebUtilDomi util = new HTTPSWebUtilDomi();
                            String json = util.GETrequest(urlSearch);
                            Log.e(">>>",json);

                            Gson g = new Gson();

                            PlaylistSearch ps = g.fromJson(json, PlaylistSearch.class);
                            ArrayList<Playlist> playlists=ps.getData();
                            runOnUiThread( ()-> {
                                adapter.setPlaylists(playlists);
                            } );
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            ).start();

        });



    }
}
