package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // initialize objects
    Button myBtn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // define what the buttons point to
        myBtn = (Button)findViewById(R.id.button);
        text = (TextView)findViewById(R.id.textView);

        // if button is clicked, do this
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // sets text for object with id textView
                text.setText("You have clicked the button");
            }
        });
    }
}