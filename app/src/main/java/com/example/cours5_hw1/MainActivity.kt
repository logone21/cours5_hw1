 package com.example.cours5_hw1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cours5_hw1.databinding.ActivityMainBinding
import com.example.cours5_hw1.helper.Injector
import com.example.cours5_hw1.presenter.Presenter
import com.example.cours5_hw1.view.CounterView

 class MainActivity : AppCompatActivity(), CounterView {

     lateinit var binding: ActivityMainBinding
     private val presenter = Injector.getPresenter()

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         presenter.attachView(this)
         initClicker()
     }

     private fun initClicker() {
         with(binding) {
             incrementBtn.setOnClickListener {
                 presenter.incremet()
             }
             decrementBtn.setOnClickListener {
                 presenter.decrement()
             }
         }
     }

     override fun showNewCount(count: Int) {
         binding.resultTv.text = count.toString()

     }

     override fun showToast() {
         Toast.makeText(this, "Поздравляем", Toast.LENGTH_LONG).show()
     }

     override fun changeColor() {
         binding.resultTv.setTextColor(Color.GREEN)

     }
 }