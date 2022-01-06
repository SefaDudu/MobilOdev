package com.example.mobildevnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeacherNav extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_nav);

        listView=(ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("deneme1");
        arrayList.add("deneme2");
        arrayList.add("deneme3");
        arrayList.add("deneme4");
        arrayList.add("deneme1");
        arrayList.add("deneme2");
        arrayList.add("deneme3");
        arrayList.add("deneme4");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(TeacherNav.this,"Item"+i+" " + arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}