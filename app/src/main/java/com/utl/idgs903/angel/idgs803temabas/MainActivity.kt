package com.utl.idgs903.angel.idgs803temabas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.utl.idgs903.angel.idgs803temabas.Ejemplo1.OperaBasActiviy
import com.utl.idgs903.angel.idgs803temabas.Ejemplo2.SaludoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnOperaBas = findViewById<Button>(R.id.btn1)
        btnOperaBas.setOnClickListener { navigateToOperaBas() }

        val btnSaludo = findViewById<Button>(R.id.btn2)
        btnSaludo.setOnClickListener { navigateToSaludo() }
    }

    private fun navigateToOperaBas() {
        val intent = Intent(this, OperaBasActiviy::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludo() {
        val intent = Intent(this, SaludoActivity::class.java)
        startActivity(intent)
    }
}