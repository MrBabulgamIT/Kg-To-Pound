package com.example.com.kgcovertpount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.covert_button);
        editText=findViewById(R.id.edittext_id);
        textView=findViewById(R.id.textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edittextst = editText.getText().toString();

                int kg= Integer.parseInt(edittextst);
                double pound = kg*2.205;
                textView.setText("The Corresponding value is : " + pound );

            }
        });

    }
}
