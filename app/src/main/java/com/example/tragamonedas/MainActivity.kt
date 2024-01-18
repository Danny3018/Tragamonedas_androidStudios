package com.example.tragamonedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import com.example.tragamonedas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dato:EditText
    lateinit var imagenes1 :ImageView
    lateinit var imagenes2 :ImageView
    lateinit var imagenes3 :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        dato= binding.textView as EditText
        imagenes1=binding.imageView
        imagenes2=binding.imageView2
        imagenes3=binding.imageView3

        setContentView(binding.root)

    }


    fun imagenazar(){

        var contador = 0

        var listaOpciones = mutableListOf<Int>()

        while(contador < 3){

            val opciones:Int =  (1..3).random()

            if(opciones == 1){
                imagenes1.setImageResource(R.drawable.monedas)

            } else if(opciones == 2) {
                imagenes2.setImageResource(R.drawable.estrella)

            } else if(opciones == 3) {
                imagenes3.setImageResource(R.drawable.fresa)
            }
            listaOpciones.add(opciones)

            contador ++

        }

        if(listaOpciones[0] == listaOpciones[1] && listaOpciones[0] == listaOpciones[2] &&  listaOpciones[1] == listaOpciones[2]){
            Toast.makeText(applicationContext,"Ganaste",Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext,"Sigue intentando",Toast.LENGTH_SHORT).show()
        }
    }

    private fun <T> mutableListOf(): Any {

    }
}
}