package com.test.madlabapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppListAdapter(): RecyclerView.Adapter<AppListAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val rootItem: LinearLayout = view.findViewById(R.id.item_root)
        val appNameTv: TextView = view.findViewById(R.id.app_name_tv)
        val appMembersTv: TextView = view.findViewById(R.id.app_members_tv)
        val viewDetailsIv: ImageView = view.findViewById(R.id.view_details_iv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.application_item_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return 10
    }
}