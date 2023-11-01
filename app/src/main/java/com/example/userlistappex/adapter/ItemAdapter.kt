package com.example.userlistappex.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.userlistappex.R
import com.example.userlistappex.UserDetailActivity
import com.example.userlistappex.model.User

class ItemAdapter(val dataset:List<User>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val nameView: TextView = view.findViewById(R.id.nameView)
        val profileDescView: TextView = view.findViewById(R.id.profileDescView)
        private lateinit var user:User

        init{
            view.setOnClickListener{
                val context = itemView.context
                val showUserIntent = Intent(context, UserDetailActivity::class.java)
                showUserIntent.putExtra("USER_KEY", user)
                context.startActivity(showUserIntent)

            }
        }

        fun bind(user:User){
            this.user = user
            nameView.text = user.name
            profileDescView.text = user.profileDesc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val user = dataset[position]
        holder.bind(user)
    }
}