package com.example.birthdaygreed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthgreeting_actvity.*

class BirthgreetingActvity : AppCompatActivity() {
    companion object
    {
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthgreeting_actvity)
        val name=intent.getStringExtra(NAME_EXTRA)
        birthdaygreeting.text="HAPPY BIRTHDAY\n $name!"
    }
}