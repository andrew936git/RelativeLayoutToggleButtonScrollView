package com.example.relativelayouttogglebuttonscrollview

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    private lateinit var textBookTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        textBookTV = findViewById(R.id.textBookTV)
        }

    private fun loadBook(text: String): List<String> = text.trim().splitToSequence(' ').toList()

    fun onClick(view: View) {
        val book = loadBook(database().textBook)
        var bookText = ""
        for (it in book){
            bookText += "$it "
        }
        textBookTV.text = bookText
    }

}