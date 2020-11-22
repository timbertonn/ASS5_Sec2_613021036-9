package com.example.ass5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_show.*

class showActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("Em_")
        Tx_name.text = newEmployee?.name.toString()
        Tx_gender.text = newEmployee?.gender.toString()
        Tx_email.text = newEmployee?.email.toString()
        Tx_salary.text = newEmployee?.salary.toString() + " Baht"
    }
    fun close(v:View){
        finish()
    }

}