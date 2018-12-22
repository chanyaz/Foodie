package com.foodie.consumer.feature.common

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

/**
 * @author Vipul Kumar; dated 22/10/18.
 */

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    private lateinit var appToolbar: Toolbar

    fun setToolbar(toolbar: Toolbar) {
        this.appToolbar = toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}
