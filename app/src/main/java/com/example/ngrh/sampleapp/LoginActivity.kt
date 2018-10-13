package com.example.ngrh.sampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login2.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val defaultEmail: String = "email@utama.ac.id"
        val defaultPassword: String = "123456"

        btn_login.setOnClickListener{
            val isEmailValid: Boolean = defaultEmail == ed_email.text.toString()
            val isPasswordValid: Boolean = defaultPassword == ed_passsword.text.toString()
            val isAuthValid = isEmailValid && isPasswordValid

            val message: String = if(isAuthValid) {
                "Success"
            } else {
                "Failed"
            }
            val snackbar = Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT)
            val sbView = snackbar.view
            sbView.setBackgroundColor(ContextCompat.getColor(this, R.color.red900))
            val textView = sbView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
            textView.setTextColor(ContextCompat.getColor(this, R.color.white))
            snackbar.show()

        }

        btn_help_signin.setOnClickListener {

        }

        btn_signup.setOnClickListener {

        }
    }
}
