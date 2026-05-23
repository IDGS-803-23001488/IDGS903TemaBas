package com.utl.idgs903.angel.idgs803temabas.Ejemplo2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.utl.idgs903.angel.idgs803temabas.R

class SaludoActivity : AppCompatActivity() {
    private lateinit var edtNombre : EditText
    private lateinit var btnStart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saludo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edtNombre = findViewById<EditText>(R.id.edt1)
        btnStart = findViewById<Button>(R.id.btn1)

        btnStart.setOnClickListener {
            val name = edtNombre.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRANAME",name)
                startActivity(intent)
            }
        }

    }
}