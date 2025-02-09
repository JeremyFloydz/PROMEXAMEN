package com.example.promexamen.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.promexamen.databinding.FragmentAsignarAlumnoBinding
import com.example.promexamen.models.Alumno
import com.example.promexamen.models.Grupo

class AsignarAlumnoFragment : Fragment() {

    private var _binding: FragmentAsignarAlumnoBinding? = null
    private val binding get() = _binding!!

    private val alumnos = mutableListOf<Alumno>() // Lista simulada de alumnos
    private val grupos = mutableListOf<Grupo>()   // Lista simulada de grupos

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAsignarAlumnoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Simular selección de alumno y grupo
        binding.btnAsignar.setOnClickListener {
            val alumnoSeleccionado = binding.spinnerAlumnos.selectedItem as? Alumno
            val grupoSeleccionado = binding.spinnerGrupos.selectedItem as? Grupo

            if (alumnoSeleccionado != null && grupoSeleccionado != null) {
                grupoSeleccionado.listaAlumnos.add(alumnoSeleccionado)
                Toast.makeText(requireContext(), "Alumno asignado al grupo", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Selecciona un alumno y un grupo", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
