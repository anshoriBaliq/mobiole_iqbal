package com.example.belajar2.ui.skill
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajar2.R



class SkillsAdapter(private val skills: List<Skills>) : RecyclerView.Adapter<SkillsAdapter.HobbyViewHolder>(){
    inner class HobbyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.textSkillName)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textSkillDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_skill, parent, false)
        return HobbyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        val skill = skills[position]
        holder.nameTextView.text = skill.name
        holder.descriptionTextView.text = skill.description


        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return skills.size
    }


}