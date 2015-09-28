package com.example.dado.backword;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private TextView textView2;
    private EditText et;
    private Button button;

    private String word;
    private char[] chr;
    private int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.textView);

        textView2 = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);

        Context context = getApplicationContext();
        CharSequence text = "No letters were found! Try Again.";
        int duration = Toast.LENGTH_SHORT;

        final Toast toast = Toast.makeText(context, text, duration);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(null);
                if(et.equals("") || et == null){
                    toast.show();
                }
                else {
                    word = et.getText().toString();
                    chr = word.toCharArray();
                    for (j=word.length()-1; j>=0; j--){
                        textView2.setText(textView2.getText()+(chr[j]+""));
                    }
                    et.setText(null);
                }
            }
        });
    }


}
