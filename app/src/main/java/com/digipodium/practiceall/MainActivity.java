package com.digipodium.practiceall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    TextView textView2;
    Switch aSwitch;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        textView2=(TextView)findViewById(R.id.textView2);
        textView2.setVisibility(View.INVISIBLE);

        aSwitch=(Switch)findViewById(R.id.switch1);
        textView3=(TextView)findViewById(R.id.textView3);
        //textView3.setVisibility(View.INVISIBLE);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    textView3.setText("Power On");
                }
                else
                {
                    textView3.setText("Power Off");
                }
            }
        });

    }

    public void  ChangeVibrateState(View view)
    {
        boolean checked=((ToggleButton)view).isChecked();

        if(checked)
        {
            textView2.setText("Vibration ON");
            textView2.setVisibility(View.VISIBLE);
        }
        else{
            textView2.setText("Vibration OFF");
          //  textView2.setVisibility(View.VISIBLE);

        }


    }
}
