package com.example.lab4_korniienko.Activities
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Handler
import android.widget.Button
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4_korniienko.R
import kotlinx.android.synthetic.main.activity_audio.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartAudioActivity: Button = findViewById(R.id.btnAudio)
        btnStartAudioActivity.setOnClickListener {
            val intent = Intent(this, AudioActivity::class.java)
            startActivity(intent)
        }

        val btnStartVideoActivity: Button = findViewById(R.id.btnVideo)
        btnStartVideoActivity.setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }
    }
}

