package com.example.health_prototip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PaginaPrincipalLoby : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pagina_principal_loby)

    }
}




/*
progrres var codigo ejemplo gpt para cambiar color y aumentar progreso ,datos ha de recibir del layout de comida ! y guardar
diariamente el consumo en una linea cronologica .


val progress = findViewById<LinearProgressIndicator>(R.id.progressComida)
progress.setProgressCompat(60, true) // animación
val color = when (progress.progress) {
    in 0..30 -> Color.RED
    in 31..70 -> Color.YELLOW
    else -> Color.GREEN
}
progress.setIndicatorColor(color)


*/

