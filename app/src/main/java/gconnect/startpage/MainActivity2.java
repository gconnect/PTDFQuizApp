package gconnect.startpage;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gconnect.icanquizapp.MainActivity;
import com.example.gconnect.icanquizapp.R;

public class MainActivity2 extends AppCompatActivity {

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        start = (Button) findViewById(R.id.start);
    }
    public void start (View view){
        Intent i= new Intent (this, MainActivity.class);
        startActivity(i);
    }
}

