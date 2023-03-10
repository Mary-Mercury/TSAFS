package com.example.tablesync

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
        }
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val intent = Intent(this, NexttableActivity::class.java)
            startActivity(intent)
        }

        val parity = findViewById<TextView>(R.id.parity)
        val dayofweek = findViewById<TextView>(R.id.dayofweek)
        val date = findViewById<TextView>(R.id.date)
        val altparity = findViewById<TextView>(R.id.altparity)
        val whennext = findViewById<TextView>(R.id.whennext)
        val layout: LinearLayout = findViewById(R.id.linearLayout3)
        when(daysofweek()) {
            "Суббота" -> layout.visibility = View.VISIBLE
            "Воскресенье" -> layout.visibility = View.VISIBLE
        }
        parity.text = parity()
        dayofweek.text = daysofweek()
        date.text = date()
        altparity.text = altparity()
        whennext.text = whennext()
    }
}