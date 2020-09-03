package com.lateofrederick.practiceproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LearningLeadersRecyclerAdapter(private val list: List<String>): RecyclerView.Adapter<
        LearningLeadersRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(listItem: View): RecyclerView.ViewHolder(listItem) {
        val titleText: TextView = itemView.findViewById(R.id.text_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val leaderView = inflater.inflate(R.layout.learning_leaders, parent, false)
        return ViewHolder(leaderView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titleText.text = list[position]
    }
}