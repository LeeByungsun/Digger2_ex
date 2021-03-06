package com.buggyani.daggerex.di.component

import com.buggyani.daggerex.MainActivity
import com.buggyani.daggerex.di.moudle.CatModule
import com.buggyani.daggerex.di.moudle.DogModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DogModule::class, CatModule::class])
interface PetComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): PetComponent

        fun dogModule(dogModule: DogModule): Builder
        fun catModule(catModule: CatModule): Builder

    }

}