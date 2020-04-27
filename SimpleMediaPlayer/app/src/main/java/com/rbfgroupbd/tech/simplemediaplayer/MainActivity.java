package com.rbfgroupbd.tech.simplemediaplayer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.rbfgroupbd.tech.simplemediaplayer.adapter.CustomMusicAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void letsGo(View view) {
        startActivity(new Intent(this, MusicHome.class));
        finish();
    }
}
