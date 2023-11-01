package com.example.userlistappex.data

import android.content.Context
import com.example.userlistappex.R
import com.example.userlistappex.model.User

class Datasource(val context: Context) {

    fun getUserNameList(): Array<String> {
        return context.resources.getStringArray(R.array.name_array)
    }

    fun getUserAddrList(): Array<String> {
        return context.resources.getStringArray(R.array.address_array)
    }

    fun getProfileDescList(): Array<String> {
        return context.resources.getStringArray(R.array.profiledesc_array)
    }

    fun loadUsers(): List<User> {
        val namesList = getUserNameList()
        val addrList = getUserAddrList()
        val profileDescList = getProfileDescList()

        val users = mutableListOf<User>()
        for (i in 0..9) {
            val user = User(namesList[i], addrList[i], profileDescList[i])
            users.add(user)
        }

        return users
    }
}