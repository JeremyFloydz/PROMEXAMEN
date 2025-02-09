package com.example.promexamen.fragments

import android.os.Bundle
import android.view.DragEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.promexamen.databinding.FragmentJuegoBinding

class JuegoFragment : Fragment() {

    private var _binding: FragmentJuegoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentJuegoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configura el elemento arrastrable
        binding.draggableItem.setOnLongClickListener {
            val clipData = android.content.ClipData.newPlainText("", "")
            val shadow = View.DragShadowBuilder(it)
            it.startDragAndDrop(clipData, shadow, it, 0)
            true
        }

        // Configura el área de soltado
        binding.dropTarget.setOnDragListener { _, event ->
            when (event.action) {
                DragEvent.ACTION_DROP -> {
                    Toast.makeText(requireContext(), "¡Elemento soltado correctamente!", Toast.LENGTH_SHORT).show()
                    binding.draggableItem.visibility = View.GONE // Ocultar elemento después de soltar
                    true
                }
                DragEvent.ACTION_DRAG_ENTERED -> {
                    binding.dropTarget.setBackgroundResource(android.R.color.holo_red_light)
                    true
                }
                DragEvent.ACTION_DRAG_EXITED -> {
                    binding.dropTarget.setBackgroundResource(android.R.color.holo_green_light)
                    true
                }
                else -> false
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
