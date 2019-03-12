package com.example.angeloapigo.prelim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Prelim extends AppCompatActivity {

    Button nm, wn;
    TextView t1, t2, t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelim);

        nm = (Button) findViewById(R.id.names);
        wn = (Button) findViewById(R.id.win);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);

        nm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(Prelim.this, Second.class);
                Prelim.this.startActivity(myIntent);
            }
        });

        wn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(Prelim.this, Third.class);
                Prelim.this.startActivity(myIntent);
            }
        });

    }
}
