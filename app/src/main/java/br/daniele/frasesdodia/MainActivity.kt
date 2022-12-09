package br.daniele.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun novaFrase(Textview: View) {
        var frases = arrayListOf(
            "Espero que chegue logo o dia em que nunca mais precise dizer boa viagem, mas apenas boa noite!",
            "Nem o mal dura sempre nem a madrugada é infinita. Calma, logo logo esses pensamentos irão desvanecer.",
            "Que esta tarde chegue com serenidade e carinho, desejo e paixão. Boa tarde, meu amor!",
            "Bom dia, meu amor! Espero que o seu dia seja excelente e que passe bem rápido, para nós voltarmos a estar juntos logo.",
            "A tempestade vai passar e logo logo o bem irá florescer na sua vida."
        )
        var num: Int = Random.nextInt(5)
        var texto: TextView = findViewById(R.id.tvFrases)
        texto.setText(frases[num])

    }


}










