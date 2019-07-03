package com.olivercorsino.smackchat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onLoginBtnClicked(view: View) {
        val mainActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(mainActivityIntent)
    }

    fun onSignUpBtnClicked(view: View) {
        val signUpActivity = Intent(this, SignUpActivity::class.java)
        startActivity(signUpActivity)
    }
}
