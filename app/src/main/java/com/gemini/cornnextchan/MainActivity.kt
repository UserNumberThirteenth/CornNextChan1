package com.gemini.cornnextchan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gemini.cornnextchan.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.confirmBtn.setOnClickListener {
            "today is a good day, I will teach you a good lesson"

        }


    }
}
