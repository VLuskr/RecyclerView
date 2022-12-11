package com.vluskr.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.vluskr.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private val adapter = WorkAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.d("MyLog","start fun init()")
        init()

    }

    private fun init() {
        Log.d("MyLog","started fun init() is OK")
        binding.rcView.layoutManager = GridLayoutManager(this,5)
        binding.rcView.adapter = adapter

        binding.btAdd.setOnClickListener {
            val work = Work("test")
            adapter.addWork(work)
//            Log.d("MyLog", "Added $work")
        }
    }

}