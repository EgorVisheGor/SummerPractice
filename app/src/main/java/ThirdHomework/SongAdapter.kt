package ThirdHomework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import com.example.practice.databinding.ItemSongBinding

class SongAdapter(
    private val list: List<Song>,
    private val onItemClick: (Song) -> Unit
) : RecyclerView.Adapter<SongHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SongHolder = SongHolder(
        ItemSongBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        onItemClick
    )

    override fun onBindViewHolder(
        holder: SongHolder,
        position: Int
    ) {
        holder.onBind(list[position])

    }

    override fun getItemCount(): Int = list.size


}