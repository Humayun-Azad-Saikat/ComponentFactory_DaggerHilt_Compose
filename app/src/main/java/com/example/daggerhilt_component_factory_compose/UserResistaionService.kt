package com.example.daggerhilt_component_factory_compose

import com.example.daggerhilt_component_factory_compose.qualifiers.EmailQualifier
import javax.inject.Inject
import javax.inject.Named

class UserResistaionService @Inject constructor(
    private val userRepository: UserRepository,
    @Named("message")private val notificationService: NotificationService
) {

    fun resisterUser(email:String,password:String){
        userRepository.saveUser("saikat","codedash00@gmail.com")
        notificationService.send("saikat","system","email body")
    }
}