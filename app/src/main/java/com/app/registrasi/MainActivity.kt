package com.app.registrasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var txtUsername: EditText
    lateinit var txtPassword: EditText
    lateinit var tvRegister: TextView
    lateinit var btnLogin: Button
    lateinit var imgShow: ImageView
    var nilai = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtUsername = findViewById(R.id.txtUsername)
        txtPassword = findViewById(R.id.txtPassword)
        tvRegister = findViewById(R.id.tvRegister)
        btnLogin = findViewById(R.id.btnLogin)
        imgShow = findViewById(R.id.imgShow)

        tvRegister.setOnClickListener {
            startActivity(Intent(this@MainActivity, Register::class.java))
        }

        btnLogin.setOnClickListener {
            auth(txtUsername.text.toString(), txtPassword.text.toString())
        }

        imgShow.setOnClickListener {
            nilai += 1
            if (nilai % 2 == 1) {
                imgShow.setColorFilter(applicationContext.resources.getColor(R.color.base1))
                txtPassword.inputType = InputType.TYPE_CLASS_TEXT
            } else {
                imgShow.setColorFilter(applicationContext.resources.getColor(R.color.font1))
                txtPassword.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
    }

    fun auth(username: String, password: String){
        if (username == Pass.username && password == Pass.password){
            startActivity(Intent(this@MainActivity, Home::class.java))
        }else{
            Toast.makeText(this, "Username atau Password salah!", Toast.LENGTH_SHORT).show()
        }
    }

}