package com.testapplication.user.swooshapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        MensBtn.setOnClickListener {

            WomensBtn.isChecked = false
            CoedBtn.isChecked = false
            selectedLeague = "Mens"

        }

        WomensBtn.setOnClickListener {

            MensBtn.isChecked = false
            CoedBtn.isChecked = false
            selectedLeague = "Womens"
        }

        CoedBtn.setOnClickListener {

            MensBtn.isChecked = false
            WomensBtn.isChecked = false
            selectedLeague = "Co-Ed"
        }

        nextBtn.setOnClickListener {

            if (selectedLeague != "") {
                val intent = Intent(this, SkillActivity::class.java)
                intent.putExtra("League" , selectedLeague)
                startActivity(intent)
            } else {
                Toast.makeText(this,"Please Select a League",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
