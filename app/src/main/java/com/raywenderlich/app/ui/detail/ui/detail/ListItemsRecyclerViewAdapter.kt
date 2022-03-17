package com.raywenderlich.app.ui.detail.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.app.databinding.ListItemViewHolderBinding
import com.raywenderlich.app.models.TaskList

class ListItemsRecyclerViewAdapter(var list: TaskList) :
    RecyclerView.Adapter<ListItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding =
            ListItemViewHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        return ListItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.binding.textViewTask.text = list.tasks[position]
    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }
}