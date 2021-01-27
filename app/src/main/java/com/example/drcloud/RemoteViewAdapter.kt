package com.example.drcloud

import android.view.LayoutInflater
import android.view.SurfaceView
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class RemoteViewAdapter(val surfaceViews: ArrayList<SurfaceView>) : RecyclerView.Adapter<RemoteViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RemoteViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.remote_item, parent, false)

        return RemoteViewHolder(v)
    }

    override fun getItemCount(): Int {
        return surfaceViews.size
    }

    override fun onBindViewHolder(holder: RemoteViewHolder, position: Int) {
        holder.surfaceView = surfaceViews.get(position)
    }
}