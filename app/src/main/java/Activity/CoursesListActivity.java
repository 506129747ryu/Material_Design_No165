package Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tutorial.application.R;

import java.util.ArrayList;

import Adapter.CoursesAdapter;
import Domain.CoursesDomain;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourseList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

        initRecyclerView();

        ConstraintLayout back = findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CoursesListActivity.this, MainActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList< CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification\nProgram in AI", 169, "ic_1"));
        items.add(new CoursesDomain("Google Cloud Platform\nArchitecture", 69, "ic_2"));
        items.add(new CoursesDomain("Fundamental of java\nProgramming", 150, "ic_3"));
        items.add(new CoursesDomain("Introduction to UI\ndesign history", 79, "ic_4"));
        items.add(new CoursesDomain("PG Program in Big\nData Engineering", 49, "ic_5"));

        recyclerViewCourse = findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        ));

        adapterCourseList = new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourseList);

    }
}
