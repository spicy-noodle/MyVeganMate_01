package com.example.myveganmate_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myveganmate_01.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.myveganmate_01.CameraActivity
import com.example.myveganmate_01.DictionaryActivity
import com.example.myveganmate_01.BookmarkActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cameraButton = findViewById<View>(R.id.btnCamera) as Button
        cameraButton.setOnClickListener {
            val intent = Intent(applicationContext, CameraActivity::class.java)
            startActivity(intent)
        }
        val dictionaryButton = findViewById<View>(R.id.btnDictionary) as Button
        dictionaryButton.setOnClickListener {
            val intent = Intent(applicationContext, DictionaryActivity::class.java)
            startActivity(intent)
        }
        val listButton = findViewById<View>(R.id.btnList) as Button
        listButton.setOnClickListener {
            val intent = Intent(applicationContext, ListActivity::class.java)
            startActivity(intent)
        }
        val bookmarkButton = findViewById<View>(R.id.btnBookmark) as Button
        bookmarkButton.setOnClickListener {
            val intent = Intent(applicationContext, BookmarkActivity::class.java)
            startActivity(intent)
        }
    }
}