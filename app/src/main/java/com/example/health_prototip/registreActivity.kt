package com.example.health_prototip
/*
* Cosas que faltan en el registre --
* poner tipo de contraseña minima y caracteres mínimos
* falta verificar contraseña
*  poner nombre y apellidos mínimos Validos
*
*
* */
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registreActivity : AppCompatActivity() {

    private lateinit var btnBackLogin : ImageButton
    private lateinit var txtNomRegistre : EditText
    private lateinit var txtCognomRegistre : EditText
    private lateinit var txtCorreuRegistre : EditText
    private lateinit var txtRepeteixCorreu : EditText
    private lateinit var txtContrasenyaRegistre : EditText
    private lateinit var txtRepeteixContrasenyaRegistre : EditText
    private lateinit var btn_Registre : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registre)

        initComponent()
        initListeners()
    }

    fun initComponent(){
        btnBackLogin = findViewById(R.id.btn_back)
        btn_Registre = findViewById(R.id.btn_Registre)
        txtNomRegistre = findViewById(R.id.txtNomRegistre)
        txtCognomRegistre = findViewById(R.id.txtCognomRegistre)
        txtCorreuRegistre = findViewById(R.id.txtCorreuRegistre)
        txtRepeteixCorreu = findViewById(R.id.txtRepeteixCorreu)
        txtContrasenyaRegistre = findViewById(R.id.txtContrasenyaRegistre)
        txtRepeteixContrasenyaRegistre = findViewById(R.id.txtRepeteixContrasenyaRegistre)
        }


    fun initListeners(){
        btnBackLogin.setOnClickListener{
            navigateToLogin()
        }

        btn_Registre.setOnClickListener { //una vegada registrat va al loby amb sesio iniciada
            navigateToLobby() // verificar inici de sesio FALTA!
        }
    }

    fun navigateToLobby(){
        val intent = Intent(this, PaginaPrincipalLoby::class.java)
        startActivity(intent)
    }
    fun navigateToLogin(){
        val intent = Intent(this, PaginaPrincipalLoby::class.java)
        startActivity(intent)
    }

}