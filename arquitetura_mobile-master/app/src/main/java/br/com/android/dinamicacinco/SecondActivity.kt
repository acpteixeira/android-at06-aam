package br.com.android.dinamicacinco

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.android.dinamicacinco.MainActivity.Companion.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var textReceived : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textReceived = intent.getStringExtra(EXTRA_MESSAGE)
        textViewSecondActivity.text = textReceived

    }
}