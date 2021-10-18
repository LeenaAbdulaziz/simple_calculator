package com.example.simple_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var add:Button
    lateinit var sub:Button
    lateinit var multi:Button
    lateinit var div:Button
    lateinit var result:TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        add=findViewById(R.id.btnadd)
        sub=findViewById(R.id.btnsub)
        multi=findViewById(R.id.btnmulti)
        div=findViewById(R.id.btndiv)
        result=findViewById(R.id.textView)
        num1=findViewById(R.id.ednum1)
        num2=findViewById(R.id.ednum2)

        add.setOnClickListener {
            val n1=num1.text.toString().toInt()
            val n2=num2.text.toString().toInt()
            var s=n1+n2
            num2.text.clear()
            num1.text.clear()
         result.text="$s"

        }
        sub.setOnClickListener {
            val n1=num1.text.toString().toInt()
            val n2=num2.text.toString().toInt()
            var s=n1-n2
            num2.text.clear()
            num1.text.clear()
            result.text="$s"

        }
        multi.setOnClickListener {
            val n1=num1.text.toString().toInt()
            val n2=num2.text.toString().toInt()
            var s=n1*n2
            num2.text.clear()
            num1.text.clear()
            result.text="$s"

        }
        div.setOnClickListener {
            val n1=num1.text.toString().toInt()
            val n2=num2.text.toString().toInt()
            if(n2==0){
               Toast.makeText(applicationContext,"can't devide by 0",Toast.LENGTH_SHORT).show()
            }else{
            var s=n1/n2
            num2.text.clear()
            num1.text.clear()
            result.text="$s"}

        }


    }
}