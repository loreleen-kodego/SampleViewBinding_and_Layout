package com.sablot.sampleviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sablot.sampleviewbinding.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar).apply {
            title = getString(R.string.login)
            titleColor = getColor(R.color.white)
        }

        val name = intent.getStringExtra("Name")
        binding.textviewName.text = getString(R.string.your_name, name)
    }
}