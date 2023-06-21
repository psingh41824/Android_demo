package com.example.api_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val url = URL("https://jsonplaceholder.typicode.com/users")
        AndroidNetworking.initialize(applicationContext)
    }
}