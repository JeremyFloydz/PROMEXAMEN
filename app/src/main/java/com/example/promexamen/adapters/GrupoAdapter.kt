package com.example.promexamen.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.promexamen.databinding.ItemGrupoBinding
import com.example.promexamen.models.Grupo

class GrupoAdapter(private val grupos: List<Grupo>) : RecyclerView.Adapter<GrupoAdapter.GrupoViewHolder>() {

    class GrupoViewHolder(val binding: ItemGrupoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GrupoViewHolder {
        val binding = ItemGrupoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GrupoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GrupoViewHolder, position: Int) {
        val grupo = grupos[position]
        holder.binding.tvNombreGrupo.text = grupo.nombre
    }

    override fun getItemCount(): Int = grupos.size
}
