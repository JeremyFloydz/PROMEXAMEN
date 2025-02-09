package com.example.promexamen.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.promexamen.adapters.AlumnoAdapter
import com.example.promexamen.databinding.FragmentConsultarPuntosBinding
import com.example.promexamen.models.Alumno

class ConsultarPuntosFragment : Fragment() {

    private var _binding: FragmentConsultarPuntosBinding? = null
    private val binding get() = _binding!!

    private val alumnos = listOf(
        Alumno(1, "Alumno 1", "user1", "pass", 100),
        Alumno(2, "Alumno 2", "user2", "pass", 80)
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentConsultarPuntosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewPuntos.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewPuntos.adapter = AlumnoAdapter(alumnos) { alumno ->
            // Acciones cuando se selecciona un alumno
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
