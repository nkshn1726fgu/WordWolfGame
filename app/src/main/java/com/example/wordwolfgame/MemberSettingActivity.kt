package com.example.wordwolfgame

import android.os.Bundle
import android.view.Gravity
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_member_setting.*

class MemberSettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member_setting)

        MainLinearLayout.gravity = Gravity.CENTER   // 画面中央寄せ

        val text = EditText(this)
        text.gravity = Gravity.CENTER
        text.textSize = 35F
        //var etMemberNameID = text.id
        MainLinearLayout.addView(text)  // レイアウトファイルにテキストビューを追加します

        val text2 = EditText(this)
        text2.gravity = Gravity.CENTER
        text2.textSize = 35F
        //var etMemberNameID2 = text.id
        MainLinearLayout.addView(text)  // レイアウトファイルにテキストビューを追加します

    }
}