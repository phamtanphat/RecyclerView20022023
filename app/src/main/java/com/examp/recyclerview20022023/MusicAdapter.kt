package com.examp.recyclerview20022023

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by pphat on 3/29/2023.
 */
class MusicAdapter: RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    class MusicViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private var imageView: ImageView
        private var tvSong: TextView
        private var tvSinger: TextView

        init {
            imageView = itemView.findViewById(R.id.image_view_music)
            tvSong = itemView.findViewById(R.id.text_view_song)
            tvSinger = itemView.findViewById(R.id.text_view_singer)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
