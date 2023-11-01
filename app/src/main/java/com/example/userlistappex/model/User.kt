package com.example.userlistappex.model

import java.io.Serializable

data class User(val name: String, val address: String, val profileDesc: String) : Serializable{
}