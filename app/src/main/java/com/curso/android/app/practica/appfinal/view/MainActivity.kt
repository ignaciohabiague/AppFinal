package com.curso.android.app.practica.appfinal.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.curso.android.app.practica.appfinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compareButton.setOnClickListener {
            val input1 = binding.editText1.text.toString()
            val input2 = binding.editText2.text.toString()

            viewModel.compareStrings(input1, input2)
        }

        viewModel.resultLiveData.observe(this) { result ->
            binding.resultTextView.text = result
        }
    }
}