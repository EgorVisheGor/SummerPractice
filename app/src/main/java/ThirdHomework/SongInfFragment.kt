package ThirdHomework

import android.os.Bundle
import android.view.KeyCharacterMap.load
import android.view.PointerIcon.load
import android.view.View
import androidx.core.view.PointerIconCompat.load
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.practice.R
import com.example.practice.databinding.FragmentSonginfBinding
import java.lang.System.load
import java.util.ServiceLoader.load

class SongInfFragment : Fragment(R.layout.fragment_songinf) {

    private var _binding: FragmentSonginfBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSonginfBinding.bind(view)

        val text = arguments?.getString(ARG_TEXT).orEmpty()
        if (text.isNotEmpty()) {
            val song = SongRepository.songs[text.toInt()]
            binding.tvSonginf.text = "${song.toString()}"
            Glide.with(this).load(song.url).into(this.binding.ivPainting)}

        with(binding) {
            btnBack.setOnClickListener {
                findNavController().navigate(
                    R.id.action_songInfFragment_to_musicFragment
                )
            }
        }
    }

    companion object {

        private const val ARG_TEXT = "id"

        fun createBundle(text: String): Bundle {
            val bundle = Bundle()
            bundle.putString(
                ARG_TEXT,
                text
            )
            return bundle
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}