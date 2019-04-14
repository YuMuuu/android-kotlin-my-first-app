package com.example.myfirstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val intent = getIntent()
        val message:String = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        val textView = findViewById<View>(R.id.textView) as TextView
        textView.setText(message)
    }
}
