package com.example.promexamen.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.promexamen.databinding.ActivityAlumnoBinding

class AlumnoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlumnoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlumnoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJugar.setOnClickListener {
            // Navegar al fragmento del juego
        }

        binding.btnRellenarHuecos.setOnClickListener {
            // Navegar al fragmento de rellenar huecos
        }

        binding.btnConsultarPuntos.setOnClickListener {
            // Navegar al fragmento de consulta de puntos
        }
    }
}
