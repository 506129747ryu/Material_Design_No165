package Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.tutorial.application.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ImageView startBtn = findViewById(R.id.today_btn);
        startBtn.setOnClickListener(view -> startActivity(new Intent(IntroActivity.this, MainActivity.class)));
    }

}
