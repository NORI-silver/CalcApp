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
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondClacApp::class.java)
        intent.putExtra("VALUE1", editText1.text.toString().toFloat())
        intent.putExtra("VALUE2", editText2.text.toString().toFloat())
        startActivity(intent)

    }
}