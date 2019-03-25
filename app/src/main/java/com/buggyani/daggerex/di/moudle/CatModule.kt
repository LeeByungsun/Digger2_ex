package com.buggyani.daggerex.di.moudle

import com.buggyani.daggerex.Cat
import dagger.Module
import dagger.Provides

@Module
object CatModule {
    @Provides
    fun provideCat(): Cat {
        return Cat()
    }
}