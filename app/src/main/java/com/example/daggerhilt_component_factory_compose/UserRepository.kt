package com.example.daggerhilt_component_factory_compose

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(user:String,email:String)
}

class SQLrepository @Inject constructor():UserRepository {
    override fun saveUser(user:String, email:String){
        Log.d("tagdaggerhilt", "user saved in sqlDB")
    }
}

class FirebaseRepository():UserRepository{
    override fun saveUser(user:String, email:String){
        Log.d("tagdaggerhilt", "user saved in firebase")
    }
}