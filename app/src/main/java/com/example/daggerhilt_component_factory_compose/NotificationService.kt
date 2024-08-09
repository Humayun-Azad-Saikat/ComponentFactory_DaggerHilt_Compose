package com.example.daggerhilt_component_factory_compose

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send (to:String,from:String,body:String)
}

class EmailService @Inject constructor():NotificationService{

    override fun send (to:String,from:String,body:String){
        Log.d("tagdaggerhilt", "email sent")
    }
}

class MessageService(private val retryCount:Int):NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("tagdaggerhilt", "message sent - retry:${retryCount}")
    }

}