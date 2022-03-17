package com.raywenderlich.app.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.app.databinding.ListSelectionViewHolderBinding
import com.raywenderlich.app.models.TaskList

class ListSelectionRecyclerViewAdapter(private val lists: MutableList<TaskList>) :
    RecyclerView.Adapter<ListSelectionViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val binding = ListSelectionViewHolderBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ListSelectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.binding.itemNumber.text = (position + 1).toString()
        holder.binding.itemString.text = lists[position].name
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    fun listsUpdated() {
        notifyItemChanged(lists.size - 1)
    }
}