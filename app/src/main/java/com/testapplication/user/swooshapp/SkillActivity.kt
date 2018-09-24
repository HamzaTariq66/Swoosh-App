package com.testapplication.user.swooshapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra("League")

        beginnerBtn.setOnClickListener {

            BallerBtn.isChecked = false
            skill = "Beginner"

        }

        BallerBtn.setOnClickListener {

            beginnerBtn.isChecked = false
            skill = "Baller"

        }

        FinishBtn.setOnClickListener {

            if (skill != "") {
                val finish = Intent(this, FinishActivity::class.java)
                finish.putExtra("League",league)
                finish.putExtra("Skill" , skill)
                startActivity(finish)
            } else{
                Toast.makeText(this,"Please Select the Skill" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}
