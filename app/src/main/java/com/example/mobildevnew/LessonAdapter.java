package com.example.mobildevnew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.ViewHolder> {

    Context context;
    List<LessonModel> lesson_list;

    public LessonAdapter (Context _context,List<LessonModel> _lesson_list) {
        this.context=_context;
        this.lesson_list=_lesson_list;
    }

    @NonNull
    @Override
    public LessonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);


        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull LessonAdapter.ViewHolder holder, int position) {
        if(lesson_list != null  && lesson_list.size()>0){
            LessonModel model = lesson_list.get(position);
            holder.lesson_Final.setText(model.Final());
            holder.lesson_Vize.setText(model.Vize());
            holder.lesson_Name.setText(model.Ders());

        }
        else {
            return;

        }
    }


    @Override
    public int getItemCount() {
        return lesson_list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView lesson_Name , lesson_Vize,lesson_Final;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            lesson_Final=itemView.findViewById(R.id.lesson_Final);
            lesson_Vize=itemView.findViewById(R.id.lesson_v);
            lesson_Name=itemView.findViewById(R.id.lesson_Name);

        }
    }
}
