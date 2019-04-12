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

        if(editText1.text.toString().length != 0 && editText2.text.toString().length != 0) {
            val intent = Intent(this, CalcEqual::class.java)

            Log.d("Kotlin", "エラー")

            if(v.id == R.id.button1) {

                result = (Integer.parseInt(editText1.text.toString())).toFloat() + (Integer.parseInt(editText2.text.toString())).toFloat()
                intent.putExtra("VALUE1", result)

            }else if(v.id == R.id.button2) {

                result = (Integer.parseInt(editText1.text.toString())).toFloat() - (Integer.parseInt(editText2.text.toString())).toFloat()
                intent.putExtra("VALUE1", result)

            }else if(v.id == R.id.button3) {

                result = (Integer.parseInt(editText1.text.toString())).toFloat() * (Integer.parseInt(editText2.text.toString())).toFloat()
                intent.putExtra("VALUE1", result)

            }else if(v.id == R.id.button4) {

                result = (Integer.parseInt(editText1.text.toString())).toFloat() / (Integer.parseInt(editText2.text.toString())).toFloat()
                intent.putExtra("VALUE1", result)

            }
            startActivity(intent)

        }else {

        }

    }

}
