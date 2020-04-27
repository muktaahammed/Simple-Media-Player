package com.rbfgroupbd.tech.simplemediaplayer;


import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.rbfgroupbd.tech.simplemediaplayer.adapter.CustomMusicAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MusicLibrary> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new MusicLibrary("Music 1", "Singer 1", R.raw.ya_habibal_qalbi));
        arrayList.add(new MusicLibrary("Music 2", "Singer 2", R.raw.astronomia));
        arrayList.add(new MusicLibrary("Music 3", "Singer 3", R.raw.turkish_tone_2018));
        arrayList.add(new MusicLibrary("Music 4", "Singer 4", R.raw.hari_raya));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
