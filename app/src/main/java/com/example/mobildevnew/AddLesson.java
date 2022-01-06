package com.example.mobildevnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AddLesson extends AppCompatActivity {

    String[] items = {"ders1","ders2","ders3"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adaptarItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lesson);
        autoCompleteTxt=findViewById(R.id.auto_complete_txt);

        adaptarItems=new ArrayAdapter<String>(this,R.layout.list_item,items);
        autoCompleteTxt.setAdapter(adaptarItems);
        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item:"+item,Toast.LENGTH_SHORT).show();
            }
        });
    }
}