package com.example.userlistappex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.userlistappex.databinding.ActivityUserDetailBinding
import com.example.userlistappex.model.User

class UserDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_user_detail)

        val binding : ActivityUserDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_detail)

        val selectedUser = intent.getSerializableExtra("USER_KEY") as User
        binding.user = selectedUser

    }
}