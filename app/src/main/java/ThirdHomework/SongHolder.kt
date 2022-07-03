package ThirdHomework

import androidx.recyclerview.widget.RecyclerView
import com.example.practice.databinding.ItemSongBinding

class SongHolder(
    private val binding: ItemSongBinding,
    private val onItemClick: ((Song) -> Unit)?
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(song: Song) {
        with(binding) {
            tvName.text = song.name
            tvAuthor.text = song.author
            root.setOnClickListener{
                onItemClick?.invoke(song)
            }
        }
    }
}