package com.example.daggerhilt_component_factory_compose

import com.example.daggerhilt_component_factory_compose.modules.NotificaionServiceModule
import com.example.daggerhilt_component_factory_compose.modules.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificaionServiceModule::class])
interface ConsumerComponent {


    fun injectMainAC(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):ConsumerComponent
    }

}