package com.example.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercise.*

class ExerciseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        setSupportActionBar(toolbar_exercise_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar_exercise_toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}