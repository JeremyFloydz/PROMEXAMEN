package com.example.promexamen.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.promexamen.R
import com.example.promexamen.databinding.ActivityAlumnoBinding
import com.example.promexamen.fragments.JuegoFragment

class AlumnoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlumnoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlumnoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJugar.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, JuegoFragment()) // Reemplaza el contenedor con JuegoFragment
                .addToBackStack(null) // Permite volver atrás
                .commit()
        }
    }
}
