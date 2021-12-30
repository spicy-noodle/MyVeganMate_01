package com.example.myveganmate_01;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {
    
    RecyclerView recyclerView;
    Adapter adapter;

    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false)) ;
        // 상하 스크롤 //
        // recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)) ;
        // 좌우 스크롤//

        adapter = new Adapter();
        for (int i = 0; i < 100; i++) {
            String str = i + "번째 아이템";
            adapter.setArrayData(str);
        }
        recyclerView.setAdapter(adapter);
    }

}
