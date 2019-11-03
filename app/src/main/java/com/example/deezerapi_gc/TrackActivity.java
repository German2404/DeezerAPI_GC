package com.example.deezerapi_gc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class TrackActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title;
    TextView artist;
    TextView album;
    TextView duration;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        imageView=findViewById(R.id.imageTrack);
        title=findViewById(R.id.textViewTrackTitle);
        artist=findViewById(R.id.textViewTrackArtist);
        album=findViewById(R.id.textViewTrackAlbum);
        duration=findViewById(R.id.textViewTrackDuration);
        play=findViewById(R.id.buttonPlay);

        String stitle=(String)getIntent().getExtras().get("title");
        String sartist=(String)getIntent().getExtras().get("artist");
        long sduration=(long)getIntent().getExtras().get("duration");
        String salbum=(String)getIntent().getExtras().get("album");
        String spreview=(String)getIntent().getExtras().get("preview");
        String simage=(String)getIntent().getExtras().get("image");
        String slink=(String)getIntent().getExtras().get("link");

        Picasso.get().load(simage).into(imageView);
        title.setText(stitle);

        artist.setText(sartist);
        album.setText(salbum);
        duration.setText("Duration: "+sduration);

        play.setOnClickListener((view)->{
            Intent intent1=getPackageManager().getLaunchIntentForPackage("deezer.android.app");
            if(intent1!=null){
                intent1.setData(Uri.parse(slink));
                startActivity(intent1);
            }
            else{
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(slink));
                startActivity(intent);
            }
        });



    }
}
