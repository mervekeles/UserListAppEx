package com.example.userlistappex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.userlistappex.adapter.ItemAdapter
import com.example.userlistappex.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = Datasource(this).loadUsers()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = ItemAdapter(users)
    }
}