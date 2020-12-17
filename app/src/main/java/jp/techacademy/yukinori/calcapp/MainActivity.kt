package jp.techacademy.yukinori.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondClacApp::class.java)
        val edit_text_value1 = editText1.text.toString().toFloat()
        val edit_text_value2 = editText2.text.toString().toFloat()

        if(v?.id == R.id.button1) {
            val edit_text_value3 = edit_text_value1 + edit_text_value2
            intent.putExtra("VALUE1", edit_text_value3)
            startActivity(intent)
        } else if(v?.id == R.id.button2){
            val edit_text_value3 = edit_text_value1 - edit_text_value2
            intent.putExtra("VALUE1", edit_text_value3)
            startActivity(intent)
        } else if(v?.id == R.id.button3) {
            val edit_text_value3 = edit_text_value1 * edit_text_value2
            intent.putExtra("VALUE1", edit_text_value3)
            startActivity(intent)
        } else if(v?.id == R.id.button4) {
            val edit_text_value3 = edit_text_value1 / edit_text_value2
            intent.putExtra("VALUE1", edit_text_value3)
            startActivity(intent)
        } 

    }
}