package com.example.myveganmate_01;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public Button button;
    public ImageView imageView;

    ViewHolder(Context context, View itemView){
        super(itemView);

        textView = itemView.findViewById(R.id.itemTv);
        imageView = itemView.findViewById(R.id.itemIv);
        button = itemView.findViewById(R.id.addBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strText = textView.getText().toString();
                Toast.makeText(context, strText, Toast.LENGTH_SHORT).show();

            }
        });

    };


}
