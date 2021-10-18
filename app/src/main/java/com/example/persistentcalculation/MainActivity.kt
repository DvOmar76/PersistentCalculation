package com.example.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var result=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMultiply.setOnClickListener {
            val firsNum=edFirstNum.text.toString().toDouble()
            val secondNum=edSecondNum.text.toString().toFloat()
            result=firsNum * secondNum
            textView.text=result.toString()
        }


    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putDouble("result",result)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        result=savedInstanceState.getDouble("result")
        textView.text=result.toString()

    }
}