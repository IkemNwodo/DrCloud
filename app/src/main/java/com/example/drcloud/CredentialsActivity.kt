package com.example.drcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drcloud.databinding.ActivityCredentialsBinding

class CredentialsActivity : AppCompatActivity() {

    companion object {
        const val CHANNEL_NAME = "channel_name"
    }
    lateinit var binding: ActivityCredentialsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCredentialsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.joinButton.setOnClickListener { extractChannelName() }
    }

    private fun extractChannelName() {
        val channelName = binding.channelNameEditText.text.toString()

        if (channelName.isNotEmpty()){
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra(CHANNEL_NAME, channelName)
            }
            startActivity(intent)
            finish()
        }

    }
}