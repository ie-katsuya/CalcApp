package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log


class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        var result = 0F

        if(editText1.text.toString().isEmpty() == false && editText2.text.toString().isEmpty()== false) {
            if(editText1.text.toString() != "," && editText1.text.toString() != "." && editText1.text.toString() != "-") {
                if (editText2.text.toString() != "," && editText2.text.toString() != "." && editText2.text.toString() != "-") {

                    val intent = Intent(this, CalcEqual::class.java)

                    if (v.id == R.id.button1) {

                        result = (editText1.text.toString()).toFloat() + (editText2.text.toString()).toFloat()
                        intent.putExtra("VALUE1", result)
                        startActivity(intent)

                    } else if (v.id == R.id.button2) {

                        result = (editText1.text.toString()).toFloat() - (editText2.text.toString()).toFloat()
                        intent.putExtra("VALUE1", result)
                        startActivity(intent)

                    } else if (v.id == R.id.button3) {

                        result = (editText1.text.toString()).toFloat() * (editText2.text.toString()).toFloat()
                        intent.putExtra("VALUE1", result)
                        startActivity(intent)

                    } else if (v.id == R.id.button4) {

                        if ((editText2.text.toString()).toFloat() != 0F) {
                            result = (editText1.text.toString()).toFloat() / (editText2.text.toString()).toFloat()
                            intent.putExtra("VALUE1", result)
                            startActivity(intent)
                        } else {
                            Log.d("error", "0で割ろうとしました。")
                        }
                    }
                }
            }
        }
    }

}
