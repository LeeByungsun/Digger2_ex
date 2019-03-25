package com.buggyani.daggerex.di.moudle

import com.buggyani.daggerex.Dog
import dagger.Module
import dagger.Provides

@Module
object DogModule {
    @Provides
    fun provideDog(): Dog {
        return Dog()
    }
}