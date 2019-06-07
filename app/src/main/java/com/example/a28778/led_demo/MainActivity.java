package com.example.a28778.led_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean ledon = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        final CheckBox checkbox1 = (CheckBox) findViewById(R.id.led1);
        final CheckBox checkbox2 = (CheckBox) findViewById(R.id.led2);
        final CheckBox checkbox3 = (CheckBox) findViewById(R.id.led3);
        final CheckBox checkbox4 = (CheckBox) findViewById(R.id.led4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ledon = !ledon;

                if(ledon)
                {
                    button.setText("ALL OFF");
                    checkbox1.setChecked(false);
                    checkbox2.setChecked(false);
                    checkbox3.setChecked(false);
                    checkbox4.setChecked(false);
                }
                else
                {
                    button.setText("ALL ON");
                    checkbox1.setChecked(true);
                    checkbox2.setChecked(true);
                    checkbox3.setChecked(true);
                    checkbox4.setChecked(true);
                }
            }
        });


    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.led1:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(), "led1 on", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "led1 off", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.led2:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(), "led2 on", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "led2 off", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.led3:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(), "led3 on", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "led3 off", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.led4:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(), "led4 on", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "led4 off", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
