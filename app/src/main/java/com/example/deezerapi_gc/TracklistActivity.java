package com.example.deezerapi_gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.deezerapi_gc.Adapters.TrackAdapter;
import com.example.deezerapi_gc.Model.Playlist;
import com.example.deezerapi_gc.Model.PlaylistDetail;
import com.example.deezerapi_gc.Model.PlaylistSearch;
import com.example.deezerapi_gc.Model.TrackDetail;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;

public class TracklistActivity extends AppCompatActivity {

    TrackAdapter adapter;
    ImageView imageViewPlaylist;
    TextView playlistName;
    TextView playlistDescription;
    TextView songNumber;
    TextView fanNumber;
    ListView songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracklist);

        adapter=new TrackAdapter();
        imageViewPlaylist=findViewById(R.id.imageViewList);
        playlistName=findViewById(R.id.textViewNameList);
        playlistDescription=findViewById(R.id.textViewDescription);
        songNumber=findViewById(R.id.textViewSongs);
        fanNumber=findViewById(R.id.textViewFans);
        songs=findViewById(R.id.listViewTracks);

        songs.setAdapter(adapter);

        songs.setOnItemClickListener((parent, view, position, id) -> {
            TrackDetail td=(TrackDetail) adapter.getItem(position);
            Intent i=new Intent(TracklistActivity.this,TrackActivity.class);
            i.putExtra("title",td.getTitle());
            i.putExtra("duration",td.getDuration());
            i.putExtra("album",td.getAlbum().getTitle());
            i.putExtra("artist",td.getArtist().getName());
            i.putExtra("preview",td.getPreview());
            i.putExtra("image",td.getAlbum().getCover());
            i.putExtra("link",td.getLink());
            startActivity(i);
        });

        long id=(long)getIntent().getExtras().get("id");
        String urlSearchPlaylist="https://api.deezer.com/playlist/"+id;
        String baseUrlSearchTrack="https://api.deezer.com/track/";

        new Thread(
                () -> {
                    try {
                        HTTPSWebUtilDomi util = new HTTPSWebUtilDomi();
                        String json = util.GETrequest(urlSearchPlaylist);
                        Log.e(">>>",json);

                        Gson g = new Gson();

                        PlaylistDetail pd = g.fromJson(json, PlaylistDetail.class);

                        runOnUiThread(()->{
                            Picasso.get().load(pd.getPicture()).into(imageViewPlaylist);
                            playlistName.setText(pd.getTitle());
                            playlistDescription.setText(pd.getDescription());
                            songNumber.setText("Songs: "+pd.getNb_tracks()+"");
                            fanNumber.setText("Fans: "+pd.getFans()+"");
                        });


                        ArrayList<TrackDetail> tracks=new ArrayList<TrackDetail>();

                        for (int cont=0;cont<pd.getTracks().getData().size();cont++){
                          String search=  util.GETrequest(baseUrlSearchTrack+pd.getTracks().getData().get(cont).getId());
                            TrackDetail trackDetail=g.fromJson(search,TrackDetail.class);
                            runOnUiThread(()->{
                                adapter.addTrack(trackDetail);
                            });
                        }






                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

    }

    private void onPlaylistSearchCompletion(PlaylistDetail pd){



    }


}
