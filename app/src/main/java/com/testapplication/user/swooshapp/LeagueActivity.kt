package com.testapplication.user.swooshapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtn.setOnClickListener {

            val intent = Intent(this,SkillActivity::class.java)
            startActivity(intent)

        }
    }
}
