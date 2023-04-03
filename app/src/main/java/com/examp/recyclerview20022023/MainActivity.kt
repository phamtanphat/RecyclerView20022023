package com.examp.recyclerview20022023

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcvMusic: RecyclerView
    private lateinit var listMusic: MutableList<Music>
    private lateinit var musicAdapter: MusicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvMusic = findViewById(R.id.recycler_view_music)

        listMusic = Music.getMock()
        musicAdapter = MusicAdapter(listMusic, this)
        rcvMusic.adapter = musicAdapter
        rcvMusic.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
