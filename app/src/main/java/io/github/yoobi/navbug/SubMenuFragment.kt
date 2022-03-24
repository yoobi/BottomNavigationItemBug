package io.github.yoobi.navbug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.yoobi.navbug.databinding.FragmentSubMenuBinding

class SubMenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_sub_menu, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(FragmentSubMenuBinding.bind(view)) {
            content.text = "Here is the content of " + arguments?.getString("name", "I hate bugs")
        }
    }
}