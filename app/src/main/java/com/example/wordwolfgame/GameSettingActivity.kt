package com.example.wordwolfgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_game_setting.*
import kotlinx.android.synthetic.main.activity_main.*

class GameSettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_setting)

        btnEnterSetting.setOnClickListener {
            moveToGameSettingActivity()
        }

        numberPickerSetting()

    }
    /**
     * MemberSettingActivity.ktに画面遷移する
     */
    private fun moveToGameSettingActivity() {
        val intent = Intent(this@GameSettingActivity, MemberSettingActivity::class.java)
        startActivity(intent)
    }
    /**
     * NumberPickerの処理
     */
    private fun numberPickerSetting(){
        npHeadCount.minValue=3
        npHeadCount.maxValue=10
        npHeadCount.value=3

        npWolfCount.minValue=3
        npWolfCount.maxValue=10
        npWolfCount.value=3


        npTimeLimit.minValue=1
        npTimeLimit.maxValue=15
        npTimeLimit.value=5
    }

}