package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        List<Students>studentsList=new ArrayList<>();
        studentsList.add(new Students("Sandeep",22,R.drawable.male,"Kathmandu","Male"));
        studentsList.add(new Students("Rachel",19,R.drawable.female,"Pokhara","Female"));

        StudentsAdapter studentsAdapter=new StudentsAdapter(this,studentsList);
        recyclerView.setAdapter(studentsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
