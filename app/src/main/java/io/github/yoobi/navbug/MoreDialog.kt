package io.github.yoobi.navbug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import io.github.yoobi.navbug.databinding.DialogMoreBinding

class MoreDialog : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.dialog_more, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(DialogMoreBinding.bind(view)) {
            listOf(more1, more2, more3).forEach { more ->
                more.setOnClickListener {
                    findNavController().navigate(MoreDialogDirections.openSubMenu(more.text.toString()))
                }
            }
        }
    }
}