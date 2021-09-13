package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import static android.content.ContentValues.TAG;

public class MainActivity_with_more_option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_more_option);

 

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

        Button button_1_x = findViewById(R.id.button_1_x);
        Button button_cos = findViewById(R.id.button_cos);
        Button button_deg = findViewById(R.id.button_deg);
        Button button_e = findViewById(R.id.button_e);
        Button button_In = findViewById(R.id.button_In);
        Button button_left_bracket = findViewById(R.id.button_left_bracket);
        Button button_lg = findViewById(R.id.button_lg);
        Button button_pi = findViewById(R.id.button_pi);
        Button button_power = findViewById(R.id.button_power);
        Button button_right_bracket = findViewById(R.id.button_right_bracket);
        Button button_button_root = findViewById(R.id.button_root);
        Button button_shift = findViewById(R.id.button_shift);
        Button button_sin = findViewById(R.id.button_sin);
        Button button_tan = findViewById(R.id.button_tan);
        Button button_X_fac = findViewById(R.id.button_X_fac);



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

        button_1_x.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"^(-1)");
            }
        });

        button_button_root.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"^(0.5)");
            }
        });

        button_cos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                expression.setText(expression.getText().toString()+"cos");
            }
        });

        button_deg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString());
            }
        });

        button_e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"exp");
            }
        });
        button_In.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"log");
            }
        });
        button_left_bracket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"(");
            }
        });
        button_lg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"log10");
            }
        });
        button_pi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"3.141592654");
            }
        });
        button_power.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"^");
            }
        });
        button_right_bracket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+")");
            }
        });
        button_shift.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString());
            }
        });
        button_sin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"sin");
            }
        });
        button_tan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString()+"tan");
            }
        });
        button_X_fac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText().toString());
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
                Intent intent = new Intent(MainActivity_with_more_option.this, MainActivity.class);
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