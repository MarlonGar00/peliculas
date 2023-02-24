package com.example.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun movie1(view:View){
        val pelicula1=Intent(this,menupelicula1::class.java)
        startActivity(pelicula1)
    }
    fun movie2(view:View){
        val pelicula2=Intent(this,menupelicula2::class.java)
        startActivity(pelicula2)
    }
    fun movie3(view:View){
        val pelicula3=Intent(this,menupelicula3::class.java)
        startActivity(pelicula3)
    }
    fun movie4(view:View){
        val pelicula4=Intent(this,menupelicula4::class.java)
        startActivity(pelicula4)
    }

}