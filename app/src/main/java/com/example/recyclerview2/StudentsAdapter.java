package com.example.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder>{

    public StudentsAdapter(Context mContext, List<Students> studentsList) {
        this.mContext = mContext;
        this.studentsList = studentsList;
    }

    Context mContext;
    List<Students>studentsList;

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_students,parent,false);
        return new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {
        Students students=studentsList.get(position);
        holder.imgProfile.setImageResource(students.getImageID());
        holder.tvName.setText(students.getName());
        holder.tvAge.setText(String.valueOf(students.getAge()));
        holder.tvAddress.setText(students.getAddress());
        holder.tvGender.setText(students.getGender());
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class StudentsViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgProfile;
        TextView tvName,tvAge,tvAddress,tvGender;
        ImageButton btnDelete;


        public StudentsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imgProfile);
            tvName=itemView.findViewById(R.id.tvName);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvAddress=itemView.findViewById(R.id.tvAddress);
            tvGender=itemView.findViewById(R.id.tvGender);
            btnDelete=itemView.findViewById(R.id.imgDelete);
        }
    }

}
