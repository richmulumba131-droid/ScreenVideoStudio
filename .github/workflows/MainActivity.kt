package com.screenvideostudio.app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var preview: ImageView
    lateinit var program: ImageView
    lateinit var passBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preview = findViewById(R.id.preview_frame)
        program = findViewById(R.id.program_frame)
        passBtn = findViewById(R.id.btn_pass_screen)

        passBtn.setOnClickListener {
            program.setImageDrawable(preview.drawable)
        }
    }
}