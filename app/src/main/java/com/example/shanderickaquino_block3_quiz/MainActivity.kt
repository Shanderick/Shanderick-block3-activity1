package com.example.shanderickaquino_block3_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnadd : Button
    lateinit var btnsubtract : Button
    lateinit var btnmultiply : Button
    lateinit var btndivide : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btn_add)
        btnsubtract = findViewById(R.id.btn_subtract)
        btnmultiply = findViewById(R.id.btn_multiply)
        btndivide = findViewById(R.id.btn_divide)
        etA = findViewById(R.id.et_A)
        etB = findViewById(R.id.et_B)
        resultTv = findViewById(R.id.result_Tv)

        btnadd.setOnClickListener(this)
        btnsubtract.setOnClickListener(this)
        btnmultiply.setOnClickListener(this)
        btndivide.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_subtract ->{
                result = a-b
            }
            R.id.btn_multiply ->{
                result = a*b
            }
            R.id.btn_divide ->{
                result = a/b
            }
        }
        resultTv.text = "Result is $result"
    }
}