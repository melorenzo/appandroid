package com.example.aplicacioncomparar.view
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicacioncomparar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.compareButton.setOnClickListener {
            val str1 = binding.text1.text.toString()
            val str2 = binding.text2.text.toString()

            val result = mainViewModel.compararCadenas(str1, str2)
            binding.resultTextView.text = result
        }
    }
}