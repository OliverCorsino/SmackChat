package com.olivercorsino.smackchat

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    var avatarImage = "profiledefault"
    var avatarBackgroundColor =  "[0.5, 0.5, 0.5, 1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun onAvatarImageClicked(view: View) {
        var random = java.util.Random()
        val avatar = random.nextInt(28)
        val color = random.nextInt(2)

        if (color == 0) {
            avatarImage = "light$avatar"
        } else {
            avatarImage =  "dark$avatar"
        }

        val resourceId = resources.getIdentifier(avatarImage, "drawable", packageName)
        signUpAvatarImage.setImageResource(resourceId)

    }

    fun onChangeBackgroundBtnClicked(view: View) {
        var random = java.util.Random()
        val red = random.nextInt(255)
        val green = random.nextInt(255)
        val blue = random.nextInt(255)

        signUpAvatarImage.setBackgroundColor(Color.rgb(red, green, blue))

        val savedRed = red.toDouble() / 255
        val savedGreen = green.toDouble() / 255
        val savedBlue = blue.toDouble() / 255

        avatarBackgroundColor = "[$savedRed, $savedGreen, $savedBlue, 1]"
    }

    fun onSignUpBtnClicked(view: View) {

    }
}
