package com.example.tea

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.content.Intent
import android.widget.Button
import kotlin.concurrent.thread

public class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1500)
        setTheme(R.style.Theme_TEA)
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main)


        val buttoniniciar = findViewById<Button>(R.id.buttoniniciar)

        buttoniniciar.setOnClickListener {
            val intento1 = Intent(this, Iniciojuego::class.java)
            startActivity(intento1)
        }

    }
}