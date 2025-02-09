package com.example.promexamen.utils

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "education.db"
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE Alumno (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, usuario TEXT, contraseña TEXT, puntos INTEGER)")
        db?.execSQL("CREATE TABLE Profesor (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, usuario TEXT, contraseña TEXT)")
        db?.execSQL("CREATE TABLE Grupo (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT)")
        db?.execSQL("CREATE TABLE Puntuacion (idAlumno INTEGER, idGrupo INTEGER, puntos INTEGER, PRIMARY KEY(idAlumno, idGrupo))")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS Alumno")
        db?.execSQL("DROP TABLE IF EXISTS Profesor")
        db?.execSQL("DROP TABLE IF EXISTS Grupo")
        db?.execSQL("DROP TABLE IF EXISTS Puntuacion")
        onCreate(db)
    }
}
