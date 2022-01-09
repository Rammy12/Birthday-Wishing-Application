package com.example.birthdaygreed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdaycard(view: View) {

        val name=nameinput.editableText.toString()
        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
        val intent=Intent(this,BirthgreetingActvity::class.java)
        intent.putExtra(BirthgreetingActvity.NAME_EXTRA,name)
        startActivity(intent)

    }


}