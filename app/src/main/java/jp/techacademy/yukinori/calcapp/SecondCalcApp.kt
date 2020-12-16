package jp.techacademy.yukinori.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_calc_app.*

class SecondClacApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app)

        val value1 = intent.getFloatExtra("VALUE1",0)
        val value2 = intent.getFloatExtra("VALUE2",0)

        textView.text = "${value1 + value2}"
    }
}