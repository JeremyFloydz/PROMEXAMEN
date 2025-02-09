package com.example.promexamen.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.promexamen.databinding.ItemAlumnoBinding
import com.example.promexamen.models.Alumno

class AlumnoAdapter(
    private val alumnos: List<Alumno>,
    private val onClick: (Alumno) -> Unit
) : RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    class AlumnoViewHolder(val binding: ItemAlumnoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val binding = ItemAlumnoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlumnoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = alumnos[position]
        holder.binding.tvNombreAlumno.text = alumno.nombre
        holder.binding.tvPuntos.text = "Puntos: ${alumno.puntos}"

        holder.itemView.setOnClickListener { onClick(alumno) }
    }

    override fun getItemCount(): Int = alumnos.size
}
