package com.sablot.sampleviewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sablot.sampleviewbinding.databinding.ActivityCheckoutBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setupLoginButton()
    }


//    private fun setupLoginButton() {
//        binding.btnLogin.setOnClickListener {
////            val intent = Intent(this@MainActivity, LoginActivity::class.java)
////            startActivity(intent)
//
//            val intent = Intent(this@MainActivity, LoginActivity::class.java)
//            intent.putExtra("Name", binding.editTextName.text.toString())
//            startActivity(intent)
//        }
//    }
}