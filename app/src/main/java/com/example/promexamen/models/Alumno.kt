package com.example.promexamen.models

data class Alumno(
    val id: Int = 0,
    val nombre: String,
    val usuario: String,
    val contraseña: String,
    var puntos: Int = 0
)

