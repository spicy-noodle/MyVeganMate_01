package com.example.myveganmate_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myveganmate_01.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.myveganmate_01.DictionaryActivity

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera)
        val go_dictionaryButton = findViewById<View>(R.id.goDiBtn) as Button
        go_dictionaryButton.setOnClickListener {
            val intent = Intent(applicationContext, DictionaryActivity::class.java)
            startActivity(intent)
        }
    }
}