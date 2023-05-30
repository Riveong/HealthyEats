package com.example.healthyeats.ui.detect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthyeats.R
import com.example.healthyeats.databinding.ActivityDetectBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetectActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detect)
    }
}