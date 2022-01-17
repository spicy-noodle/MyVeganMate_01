package com.example.popup

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import com.example.myveganmate_01.R


class PopupActivity : Activity() {
    var text: TextView? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.popup)

        //UI 객체생성
        text = findViewById<TextView>(R.id.text)

        //데이터 가져오기
        val intent: Intent = intent
        val data: String? = intent.getStringExtra("data")
        text?.text = data
    }

    //확인 버튼 클릭
    fun mOnClose(v: View?) {
        //데이터 전달하기
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent()
        intent.putExtra("result",editText.text.toString())
        setResult(RESULT_OK, intent)

        //액티비티(팝업) 닫기
        finish()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        //바깥레이어 클릭시 안닫히게
        return event.action !== MotionEvent.ACTION_OUTSIDE
    }

    override fun onBackPressed() {
        //안드로이드 백버튼 막기
        return
    }
}