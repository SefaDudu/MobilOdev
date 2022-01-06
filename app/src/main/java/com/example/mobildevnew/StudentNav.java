package com.example.mobildevnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StudentNav extends AppCompatActivity {
    RecyclerView recycler_view;
    LessonAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_nav);
        recycler_view=findViewById(R.id.recycler_view);
        setRecyclerView();
    }

    private void setRecyclerView() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager((new LinearLayoutManager(this)));
        adapter = new LessonAdapter(this,getList());
        recycler_view.setAdapter(adapter);
    }

    private List<LessonModel> getList() {
        List<LessonModel> lesson_list= new ArrayList<>();
        lesson_list.add(new LessonModel("mobil programlama","60","40"));
        lesson_list.add(new LessonModel("mat","60","40"));
        lesson_list.add(new LessonModel("fizik ","60","40"));
        lesson_list.add(new LessonModel("kimya ","60","40"));
        lesson_list.add(new LessonModel("edebiyat ","60","40"));
        return  lesson_list;
    }
}