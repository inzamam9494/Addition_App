package com.example.addittion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

private EditText num1;
private EditText num2;
private Button button;
private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

//        adding two number set of button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = num1.getText().toString();
                int a = Integer.parseInt(first);
                String second = num2.getText().toString();
                int b = Integer.parseInt(second);
                int sum = a+b;
                textView.setText("Answer : "+sum);
                Toast.makeText(MainActivity.this, "Check Your Answer", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
