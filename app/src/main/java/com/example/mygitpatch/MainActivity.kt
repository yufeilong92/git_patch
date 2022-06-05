package com.example.mygitpatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mygitpatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


    }
}