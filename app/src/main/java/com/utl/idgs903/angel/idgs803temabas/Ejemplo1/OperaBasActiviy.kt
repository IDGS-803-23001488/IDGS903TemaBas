package com.utl.idgs903.angel.idgs803temabas.Ejemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.utl.idgs903.angel.idgs803temabas.R

class OperaBasActiviy : AppCompatActivity() {
    private lateinit var edtNumero1 : EditText
    private lateinit var edtNumero2 : EditText
    private lateinit var radio : RadioGroup
    private lateinit var btnCalcular : Button
    private lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_opera_bas_activiy)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edtNumero1 = findViewById<EditText>(R.id.edt1)
        edtNumero2 = findViewById<EditText>(R.id.edt2)
        btnCalcular = findViewById<Button>(R.id.btnCalcular)
        txtResultado = findViewById<TextView>(R.id.txtResultado)
        radio = findViewById<RadioGroup>(R.id.rgOperaciones)

        btnCalcular.setOnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            val resultado = when (radio.checkedRadioButtonId) {
                R.id.rbSumar -> sumar(num1, num2)
                R.id.rbRestar -> restar(num1, num2)
                R.id.rbMult -> mult(num1, num2)
                R.id.rbDiv -> dividir(num1, num2)
                else -> 0
            }

            txtResultado.setText("Resultado: " + resultado)
        }
    }

    private fun sumar(n1: Int,n2: Int) :Int{
        return n1 + n2;
    }

    private fun restar(n1: Int,n2: Int) :Int{
        return n1 - n2;
    }

    private fun mult(n1: Int,n2: Int) :Int{
        return n1 * n2;
    }

    private fun dividir(n1: Int,n2: Int) :Int{
        return n1 / n2;
    }

}