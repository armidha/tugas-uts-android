package com.armidha.uts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_move_linear.setOnClickListener() {
            val intent = Intent(this, move_linear::class.java)
            startActivity(intent)
        }
        btn_move_relative.setOnClickListener() {
            val intent = Intent(this, move_relative::class.java)
            startActivity(intent)
        }
        btn_move_constraint.setOnClickListener() {
            val intent = Intent(this, move_constraint::class.java)
            startActivity(intent)
        }
    }
}
