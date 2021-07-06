package com.dijon.diolistadecontatos.application

import android.app.Application
import com.dijon.diolistadecontatos.helpers.HelperDB

class ContatoApplication : Application() {

    var helperDB: HelperDB? = null
        private set

    override fun onCreate() {
        super.onCreate()
        helperDB = HelperDB(this)
    }
}