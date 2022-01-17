package com.example.myveganmate_01

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.myveganmate_01.R
import java.util.ArrayList

class Adapter : RecyclerView.Adapter<ViewHolder>() {
    private val arrayList: ArrayList<String>
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val context = parent.context
        val inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.item_list, parent, false)
        return ViewHolder(context, view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val text = arrayList[position]
        holder.textView.text = text
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    // 데이터를 입력
    fun setArrayData(strData: String) {
        arrayList.add(strData)
    }

    init {
        arrayList = ArrayList()
    }
}