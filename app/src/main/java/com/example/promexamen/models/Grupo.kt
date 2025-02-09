package com.example.promexamen.models

data class Grupo(
    val id: Int = 0,
    val nombre: String,
    val listaAlumnos: MutableList<Alumno> = mutableListOf()
)

