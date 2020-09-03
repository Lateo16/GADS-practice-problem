package com.lateofrederick.practiceproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkillIqRecyclerAdapter(private val myDataset: List<String>): RecyclerView.Adapter<SkillIqRecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(listItemView: View): RecyclerView.ViewHolder(listItemView) {
        val displayTitle: TextView = itemView.findViewById(R.id.displayTitle)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.displayTitle.text = myDataset[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val contactView = inflater.inflate(R.layout.skill_iq_leaders, parent, false)
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
       return myDataset.size
    }
}