package com.example.project302;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class solar_dashboard extends AppCompatActivity {
    private ToggleButton toggleButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toggleButton = findViewById(R.id.toggleButton);
        textView = findViewById(R.id.textView);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if(toggleButton.isChecked()){
                    textView.setText("S-mart is On");
                }
                else {
                    textView.setText("S-mart is Off");
                }
            }
        });
    }
}
