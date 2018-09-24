package com.testapplication.user.swooshapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra("League")
        val skill = intent.getStringExtra("Skill")

        FinishingTxt.text = "Looking for $league $skill league near you ... "

    }
}
