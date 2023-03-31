package com.app.registrasi

object Pass {
    var username: String = ""
    var password: String = ""
    var nama: String = ""
    var alamat: String = ""

    @JvmName("setUsername1")
    fun setUsername(username: String){
        this.username = username
    }
    @JvmName("setPassword1")
    fun setPassword(password: String){
        this.password = password
    }
    @JvmName("setNama1")
    fun setNama(nama: String){
        this.nama = nama
    }
    @JvmName("setAlamat1")
    fun setAlamat(alamat: String){
        this.alamat = alamat
    }
}