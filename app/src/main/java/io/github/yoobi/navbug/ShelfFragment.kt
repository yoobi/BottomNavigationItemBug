package io.github.yoobi.navbug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.yoobi.navbug.databinding.FragmentShelfBinding


class ShelfFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_shelf, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(FragmentShelfBinding.bind(view)) {
            listOf(book1, book2).forEach { book ->
                book.setOnClickListener {
                    findNavController().navigate(ShelfFragmentDirections.openBook(book.text.toString()))
                }
            }
        }
    }
}