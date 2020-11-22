package com.example.ass5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_show.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickSend(v: View){
        var radioG: RadioGroup = findViewById(R.id.radio_g)
        var selectId:Int = radioG.checkedRadioButtonId
        var radioButton: RadioButton = findViewById(selectId)
        val name = Edt_user.text.toString()
        val gender = radioButton.text.toString()
        val email = Edt_email.text.toString()
        val salary = Edt_salary.text.toString()

        val i = Intent(applicationContext,showActivity::class.java)
        i.putExtra("Em_", Employee(name,gender,email,salary))
        startActivity(i)

    }
    fun reset(v:View){
        Edt_user.text.clear()
        Edt_email.text.clear()
        Edt_salary.text.clear()
        radio_g.clearCheck()
    }
}