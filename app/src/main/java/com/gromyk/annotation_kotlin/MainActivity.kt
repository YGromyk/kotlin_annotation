package com.gromyk.annotation_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gromyk.annotation.GreetingGenerator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @GreetingGenerator("Some annotation")
    class Santa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = Generated_Santa().greeting()
    }
}
