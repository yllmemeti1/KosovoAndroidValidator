package com.ylli.kosovovalidator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ylli.validationhelperkosovo.NumberValidator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NumberValidator.a()
    }
}