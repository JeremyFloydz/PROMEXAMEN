package com.example.promexamen.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.promexamen.databinding.ActivityProfesorBinding

class ProfesorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfesorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfesorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCrearAlumno.setOnClickListener {
            // Navegar al fragmento de creación de alumnos
        }

        binding.btnCrearGrupo.setOnClickListener {
            // Navegar al fragmento de creación de grupos
        }

        binding.btnAsignarAlumno.setOnClickListener {
            // Navegar al fragmento de asignar alumnos
        }

        binding.btnConsultarPuntos.setOnClickListener {
            // Navegar al fragmento de consultar puntos
        }
    }
}
