package com.example.promexamen.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.promexamen.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Vinculación de la vista con Data Binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Manejo del botón de inicio de sesión
        binding.btnLogin.setOnClickListener {
            val usuario = binding.etUsuario.text.toString()
            val contraseña = binding.etContrasena.text.toString()


            if (usuario.isNotEmpty() && contraseña.isNotEmpty()) {
                if (usuario == "profesor") {
                    startActivity(Intent(this, ProfesorActivity::class.java))
                } else {
                    startActivity(Intent(this, AlumnoActivity::class.java))
                }
            } else {
                Toast.makeText(this, "Introduce usuario y contraseña", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
