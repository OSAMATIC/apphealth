package com.example.health_prototip

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btn_iniciar_sesion : Button
    private lateinit var nomLoginSesio: EditText
    private lateinit var contrasenaLoginSesio: EditText
    private lateinit var txt_registrarse: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponent()
        initListeners()
    }
    fun initComponent(){
        btn_iniciar_sesion = findViewById<Button>(R.id.btn_iniciar_sesion)
        nomLoginSesio = findViewById(R.id.nomLoginSesio)
        contrasenaLoginSesio = findViewById(R.id.ContraseñaLoginSesio)
        txt_registrarse = findViewById(R.id.txt_registrarse)
    }
    fun initListeners(){
        btn_iniciar_sesion.setOnClickListener {
            navigateToPaginaPrincipalLoby()
        }
        txt_registrarse.setOnClickListener {
            navigateToRegister()
        }
    }
    fun navigateToRegister(){
        val intent = Intent(this, registreActivity::class.java)
        startActivity(intent)
    }
    fun navigateToPaginaPrincipalLoby(){
        val intent = Intent(this, PaginaPrincipalLoby::class.java)
        startActivity(intent)
    }


}