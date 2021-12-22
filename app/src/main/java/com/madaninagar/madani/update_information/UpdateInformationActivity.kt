package com.madaninagar.madani.update_information

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.madaninagar.madani.databinding.ActivityUpdateInformationBinding

class UpdateInformationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}