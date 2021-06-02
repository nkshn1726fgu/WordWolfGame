package com.example.wordwolfgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            moveToGameSettingActivity()
        }
    }
    /**
     * GameSettingActivity.ktに画面遷移する
     */
    private fun moveToGameSettingActivity() {
        val intent = Intent(this@MainActivity, GameSettingActivity::class.java)
        startActivity(intent)
    }
}