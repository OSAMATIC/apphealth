package com.example.health_prototip

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btn_iniciar_sesion : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponent()
        initListeners()





    }

    fun initComponent(){
        btn_iniciar_sesion = findViewById<Button>(R.id.btn_iniciar_sesion)

    }
    fun initListeners(){
        btn_iniciar_sesion.setOnClickListener {
            navigateToRegister()
        }

    }
    fun navigateToRegister(){
        val intent = Intent(this, registreActivity::class.java)
        startActivity(intent)
    }

}