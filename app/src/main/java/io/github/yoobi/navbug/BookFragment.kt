package io.github.yoobi.navbug

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.yoobi.navbug.databinding.FragmentBookBinding

class BookFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_book, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(FragmentBookBinding.bind(view)) {
            content.text = "Here is the content of " + arguments?.getString("name", "I hate bugs")
        }
    }
}