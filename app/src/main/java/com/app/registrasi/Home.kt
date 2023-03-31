package com.app.registrasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Home : AppCompatActivity() {
    lateinit var imgLogout: ImageView
    lateinit var tv_nama: TextView
    lateinit var tv_username: TextView
    lateinit var tv_alamat: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imgLogout = findViewById(R.id.imgLogout)
        tv_nama = findViewById(R.id.tv_nama)
        tv_username = findViewById(R.id.tv_username)
        tv_alamat = findViewById(R.id.tv_alamat)

        tv_nama.text = Pass.nama
        tv_username.text = Pass.username
        tv_alamat.text = Pass.alamat

        imgLogout.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Konfirmasi")
            builder.setMessage("Apakah yakin ingin log out?")

            builder.setPositiveButton("Ya") { dialog, which ->
                startActivity(Intent(this@Home, MainActivity::class.java))
            }

            builder.setNegativeButton("Batal") { dialog, which ->
                dialog.dismiss()
            }

            builder.show()

        }

    }
}