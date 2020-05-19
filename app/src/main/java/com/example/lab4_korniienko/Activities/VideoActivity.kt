package com.example.lab4_korniienko.Activities

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4_korniienko.R
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val uriPath =
            "android.resource://$packageName/raw/small"
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(Uri.parse(uriPath))
        videoView.requestFocus()
        videoView.start()
    }
}