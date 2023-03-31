package com.app.registrasi

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.json.JSONObject

class Register : AppCompatActivity() {
    lateinit var txtNama: EditText
    lateinit var txtUsername: EditText
    lateinit var txtAlamat: EditText
    lateinit var txtPassword: EditText
    lateinit var txtUlangi: EditText
    lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        txtNama = findViewById(R.id.txtNama)
        txtUsername = findViewById(R.id.txtUsername)
        txtAlamat = findViewById(R.id.txtAlamat)
        txtPassword = findViewById(R.id.txtPassword)
        txtUlangi = findViewById(R.id.txtUlangiPassword)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            register()
        }
    }

    fun register(){
        if (txtNama.text.isEmpty() || txtPassword.text.isEmpty() || txtUsername.text.isEmpty()){
            Toast.makeText(this, "Nama, Username, Password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
        }else{
            if(txtPassword.text.toString() != txtUlangi.text.toString()){
                Toast.makeText(this, "Password tidak cocok!", Toast.LENGTH_SHORT).show()
            }else{
                Pass.setPassword(txtPassword.text.toString())
                Pass.setUsername(txtUsername.text.toString())
                Pass.setNama(txtNama.text.toString())
                Pass.setAlamat(txtAlamat.text.toString())
                Toast.makeText(this, "Berhasil Register!", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

    }

}