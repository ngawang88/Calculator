package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button_AC = findViewById(R.id.button_AC);
        Button button_backspace = findViewById(R.id.button_backspace);
        Button button_divide = findViewById(R.id.button_divide);
        Button button_dot = findViewById(R.id.button_dot);
        Button button_equal = findViewById(R.id.button_equal);
        Button button_minus = findViewById(R.id.button_minus);
        Button button_more = findViewById(R.id.button_more);
        Button button_percent = findViewById(R.id.button_percent);
        Button button_plus = findViewById(R.id.button_plus);
        Button button_times = findViewById(R.id.button_times);

        TextView expression = findViewById(R.id.textView2);
        TextView history  = findViewById(R.id.textView4);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        expression.setText(message);



        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"9");
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+".");
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"+");
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"-");
            }
        });

        button_times.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"*");
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"/");
            }
        });

        button_percent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"%");
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText("");
                history.setText("");
            }
        });

        button_backspace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((expression.getText().toString()!= null) && (expression.getText().toString().length() > 0)) {
                    expression.setText(expression.getText().toString().substring(0, expression.getText().toString().length() - 1));
                }

            }
        });

        button_more.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity_with_more_option.class);
                String message = expression.getText().toString();
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);

            }
        });



        button_equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String txt = expression.getText().toString();
                history.setText(expression.getText().toString());

                Expression expressionSte = new ExpressionBuilder(txt).build();
                try {
                    // Calculate the result and display
                    double result = expressionSte.evaluate();
                    expression.setText(Double.toString(result));

                } catch (ArithmeticException ex) {
                    // Display an error message
                    expression.setText("Error");

                }




            }
        });






    }



}