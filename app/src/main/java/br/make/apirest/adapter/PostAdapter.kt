package br.make.apirest.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.make.apirest.R
import br.make.apirest.model.Post
import kotlinx.android.synthetic.main.list_item.view.*

class PostAdapter(val items : List<Post>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvTitle?.text = items.get(position).title
        holder?.tvBody?.text = items.get(position).body
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvTitle = view.tvTitle
    val tvBody = view.tvBody
}