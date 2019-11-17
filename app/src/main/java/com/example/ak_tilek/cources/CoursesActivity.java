package com.example.ak_tilek.cources;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ak_tilek.Listener;
import com.example.ak_tilek.R;
import com.example.ak_tilek.RAH.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class CoursesActivity extends AppCompatActivity  {
    CoursesAdapter adapter;
    private RecyclerView recyclerView;
    private List<CoursesModel> list;
    private TextView time;
    private  TextView day;
    private  TextView subgect;
    private ImageView imageView;
 private  TextView main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crugki);
        time  = findViewById(R.id.coursesTimeTextView);
        imageView = findViewById( R.id.coursesImageView);
        day  = findViewById( R.id.coursesDayTexView);
        subgect = findViewById( R.id.coursesSubgectTextView);
        main = findViewById(R.id.coursesTextView);

        recyclerView = findViewById(R.id.coursesRecyclerView);
      recyclerView.setAdapter(new CoursesAdapter(readJsonData()));

    }


    private List<CoursesModel> readJsonData() {
        String json = Util.loadJSONFromAsset(getApplicationContext(), "courses.json");
        return (List<CoursesModel>) Util.parseData(json);
    }

}