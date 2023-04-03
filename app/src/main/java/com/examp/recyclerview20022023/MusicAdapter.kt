package com.examp.recyclerview20022023

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by pphat on 3/29/2023.
 */
class MusicAdapter(
    var listMusic: MutableList<Music>,
    var context: Context
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    inner class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var imageView: ImageView
        private var tvSong: TextView
        private var tvSinger: TextView
        private var imgDelete: ImageView

        init {
            imageView = itemView.findViewById(R.id.image_view_music)
            tvSong = itemView.findViewById(R.id.text_view_song)
            tvSinger = itemView.findViewById(R.id.text_view_singer)
            imgDelete = itemView.findViewById(R.id.image_delete)
        }

        fun bind(music: Music) {
            imageView.setImageResource(music.image)
            tvSong.text = music.song
            tvSinger.text = music.singer
            imgDelete.setOnClickListener {
                Toast.makeText(context, "Click delete", Toast.LENGTH_SHORT).show()
            }
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
