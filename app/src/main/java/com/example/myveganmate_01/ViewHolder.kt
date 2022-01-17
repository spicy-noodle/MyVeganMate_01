package com.example.myveganmate_01

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.example.myveganmate_01.R
import android.widget.Toast

class ViewHolder(context: Context?, itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField
    var textView: TextView
    var button: Button
    var imageView: ImageView

    init {
        textView = itemView.findViewById(R.id.itemTv)
        imageView = itemView.findViewById(R.id.itemIv)
        button = itemView.findViewById(R.id.addBtn)
        button.setOnClickListener {
            val strText = textView.text.toString()
            Toast.makeText(context, strText, Toast.LENGTH_SHORT).show()
        }
    }
}