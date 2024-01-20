package Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.tutorial.application.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));
    }
}
