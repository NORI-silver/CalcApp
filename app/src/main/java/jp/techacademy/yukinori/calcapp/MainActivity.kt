package jp.techacademy.yukinori.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.content.Intent
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


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

        if (v?.id == R.id.button1) {
            if((editText1.text.isEmpty()) || (editText2.text.isEmpty())) {
                    button1.setOnClickListener { view ->
                        Snackbar.make(view, "数値を入力してください。", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Action") {
                                Log.d("UI_PARTS", "Snackbarをタップした")
                            }.show()
                    }
            } else {
                val edit_text_value1 = editText1.text.toString().toFloat()
                val edit_text_value2 = editText2.text.toString().toFloat()
                val edit_text_value3 = edit_text_value1 + edit_text_value2
                intent.putExtra("VALUE1", edit_text_value3)
                startActivity(intent)
            }

        } else if (v?.id == R.id.button2) {
            if((editText1.text.isEmpty()) || (editText2.text.isEmpty())) {
                button2.setOnClickListener { view ->
                    Snackbar.make(view, "数値を入力してください。", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                            Log.d("UI_PARTS", "Snackbarをタップした")
                        }.show()
                }
            } else {
                val edit_text_value1 = editText1.text.toString().toFloat()
                val edit_text_value2 = editText2.text.toString().toFloat()
                val edit_text_value3 = edit_text_value1 - edit_text_value2
                intent.putExtra("VALUE1", edit_text_value3)
                startActivity(intent)
            }

        } else if (v?.id == R.id.button3) {
            if((editText1.text.isEmpty()) || (editText2.text.isEmpty())) {
                button3.setOnClickListener { view ->
                    Snackbar.make(view, "数値を入力してください。", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                            Log.d("UI_PARTS", "Snackbarをタップした")
                        }.show()
                }
            } else {
                val edit_text_value1 = editText1.text.toString().toFloat()
                val edit_text_value2 = editText2.text.toString().toFloat()
                val edit_text_value3 = edit_text_value1 * edit_text_value2
                intent.putExtra("VALUE1", edit_text_value3)
                startActivity(intent)
            }

        } else if (v?.id == R.id.button4) {
            if((editText1.text.isEmpty()) || (editText2.text.isEmpty())) {
                button4.setOnClickListener { view ->
                    Snackbar.make(view, "数値を入力してください。", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                            Log.d("UI_PARTS", "Snackbarをタップした")
                        }.show()
                }
            } else {
                val edit_text_value1 = editText1.text.toString().toFloat()
                val edit_text_value2 = editText2.text.toString().toFloat()
                val edit_text_value3 = edit_text_value1 / edit_text_value2
                intent.putExtra("VALUE1", edit_text_value3)
                startActivity(intent)
            }

        }
    }
}