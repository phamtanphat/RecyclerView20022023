package com.examp.recyclerview20022023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by pphat on 3/29/2023.
 */
class MusicAdapter(
    var listMusic: MutableList<Music>
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var imageView: ImageView
        private var tvSong: TextView
        private var tvSinger: TextView

        init {
            imageView = itemView.findViewById(R.id.image_view_music)
            tvSong = itemView.findViewById(R.id.text_view_song)
            tvSinger = itemView.findViewById(R.id.text_view_singer)
        }

        fun bind(music: Music) {
            imageView.setImageResource(music.image)
            tvSong.text = music.song
            tvSinger.text = music.singer
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.layout_item_music, parent, false);
        return MusicViewHolder(view);
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(listMusic[position])
    }

    override fun getItemCount(): Int {
        return listMusic.size
    }
}
