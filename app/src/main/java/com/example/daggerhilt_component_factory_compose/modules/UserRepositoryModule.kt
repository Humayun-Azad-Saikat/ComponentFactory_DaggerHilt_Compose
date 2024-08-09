package com.example.daggerhilt_component_factory_compose.modules

import com.example.daggerhilt_component_factory_compose.SQLrepository
import com.example.daggerhilt_component_factory_compose.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    @Provides
    fun getSQLrepository(sqLrepository: SQLrepository): UserRepository {
        return sqLrepository
    }
}