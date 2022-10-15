package com.example.shoppieadmin.activity

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppieadmin.databinding.ActivityAboutUsBinding
import com.klinker.android.link_builder.Link
import com.klinker.android.link_builder.applyLinks



class AboutUs : AppCompatActivity() {

    private lateinit var binding: ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title="About Us"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
val link = Link("contact")
    .setTextColor(Color.BLUE)
    .setTextColorOfHighlightedLink(Color.CYAN)
    .setHighlightAlpha(.4f)
    .setBold(true)
    .setBold(false).setOnClickListener {
        val uri: Uri = Uri.parse("https://sainishivanshu.github.io/")
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

        binding.text.applyLinks(link)

    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    }


