package br.com.android.dinamicacinco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var textFromEditTextOfFirstActivity : String = ""

    companion object{
        const val EXTRA_MESSAGE = "mensagemextra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    buttonFirstActivity.setOnClickListener {
        if(editTextFirstActivity.text.isNotEmpty()){
            textFromEditTextOfFirstActivity = editTextFirstActivity.text.toString()
        }else{
            textFromEditTextOfFirstActivity = "Texto não informado"
        }
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, textFromEditTextOfFirstActivity)
        startActivity(intent)
    }
    }

}
