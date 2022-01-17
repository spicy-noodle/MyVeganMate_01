package com.example.myveganmate_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import android.view.View
import com.example.myveganmate_01.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.popup.PopupActivity

class ListActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var adapter: Adapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        // 상하 스크롤 //
        // recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)) ;
        // 좌우 스크롤//
        adapter = Adapter()
        for (i in 0..99) {
            val str = i.toString() + "번째 아이템"
            adapter!!.setArrayData(str)
        }
        recyclerView!!.adapter = adapter
    }
    var txtResult: TextView? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResult = findViewById(R.id.txtResult)
    }
     fun monPopupClick(v:View?) {
         val intent = Intent(this, PopupActivity::class.java)
         intent.putExtra("data","팝업의 맛")
         startActivityForResult(intent,1)
     }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                //데이터 받기
                val result: String = data?.getStringExtra("result").toString()
                txtResult?.text = result
            }
        }
    }
}