package com.buggyani.daggerex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.buggyani.daggerex.di.component.DaggerPetComponent
import com.buggyani.daggerex.di.moudle.CatModule
import com.buggyani.daggerex.di.moudle.DogModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var cat: Cat

    @Inject
    lateinit var dog: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectComponent()

        setGetCatNameButton()
        setGetDogNameButton()
    }

    private fun injectComponent() {
        DaggerPetComponent.builder()
                .catModule(CatModule)
                .dogModule(DogModule)
                .build()
                .inject(this)
    }

    private fun setGetCatNameButton() {
        catNameButton.setOnClickListener {
            catNameText.text = cat.getCatName()
        }
    }
    private fun setGetDogNameButton() {
        dogNameButton.setOnClickListener {
            dogNameText.text = dog.getDogName()
        }
    }
}
