package com.example.scrubberpracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tb = findViewById<Toolbar>(R.id.toolbar)
        val tv = findViewById<TextView>(R.id.textView)
        val sn = findViewById<Button>(R.id.button)
        setSupportActionBar(tb)

        sn.setOnClickListener {
            tv.setText("John Doe")
        }
        val editText = findViewById<EditText>(R.id.editTextText)
        val sw = findViewById<Button>(R.id.button2)
        sw.setOnClickListener {
            Toast.makeText(this,editText.text,Toast.LENGTH_LONG).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionlessmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.Settings -> Toast.makeText(this,"Settings",Toast.LENGTH_LONG).show()

            R.id.Profile -> Toast.makeText(this,"Profile",Toast.LENGTH_LONG).show()

        }
        return true
    }
}