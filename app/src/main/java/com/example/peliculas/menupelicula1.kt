package com.example.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menupelicula1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menupelicula1)
    }
    fun mainMenu(view: View){
        val menu= Intent(this,MainActivity::class.java)
        startActivity(menu)
    }
}