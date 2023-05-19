

/*
package com.example.simplecalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class temp extends AppCompatActivity {

    Stack<Character> ops = new Stack<>();
    Stack<Double> vals = new Stack<>();
    EditText edtResults, edtInput;
    TextView txtOne, txtTwo, txtThree, txtFour, txtFive, txtSix, txtSeven, txtEight, txtNine, txtDoubleZero, txtZero, txtPoint, txtEqualTo, txtPlus, txtMinus, txtMultiply, txtDivide,
            txtPercent, txtClear, txtCancel;
    boolean point = false, plus = false, multiply = false, divide = false, percent = false, minus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtOne = findViewById(R.id.txt_one);
        txtTwo = findViewById(R.id.txt_two);
        txtThree = findViewById(R.id.txt_three);
        txtFour = findViewById(R.id.txt_four);
        txtFive = findViewById(R.id.txt_five);
        txtSix = findViewById(R.id.txt_six);
        txtSeven = findViewById(R.id.txt_seven);
        txtEight = findViewById(R.id.txt_eight);
        txtNine = findViewById(R.id.txt_nine);
        txtDoubleZero = findViewById(R.id.txt_double_zero);
        txtZero = findViewById(R.id.txt_zero);
        txtPoint = findViewById(R.id.txt_point);


        txtPercent = findViewById(R.id.txt_percent);
        txtDivide = findViewById(R.id.txt_divide);
        txtMultiply = findViewById(R.id.txt_multiply);
        txtMinus = findViewById(R.id.txt_minus);
        txtPlus = findViewById(R.id.txt_plus);
        txtEqualTo =findViewById(R.id.txt_equal_to);

        txtClear = findViewById(R.id.txt_clear);
        txtCancel = findViewById(R.id.txt_cancel);

        edtResults = findViewById(R.id.edt_result);
        edtInput = findViewById(R.id.edt_input);

        txtCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtInput.getText().toString().length() > 1) {
                    char ch = edtInput.getText().toString().charAt(edtInput.getText().toString().length() - 2);
                    edtInput.setText(edtInput.getText().toString().substring(0, edtInput.getText().toString().length() - 1));
                    if (Character.isDigit(ch)) {
                        edtResults.setText(eval(edtInput.getText().toString()));
                        point = false;
                        plus = false;
                        multiply = false;
                        divide = false;
                        percent = false;
                        minus = false;
                    } else if(ch=='.') {
                        point = true;
                        plus = true;
                        multiply = true;
                        divide = true;
                        percent = true;
                        minus = true;
                    }
                    else{
                        point = false;
                        plus = true;
                        multiply = true;
                        divide = true;
                        percent = true;
                        minus = true;
                    }

                }
                else{
                    edtInput.setText("");
                    edtResults.setText("");
                    point=false;
                    plus = true;
                    multiply = true;
                    divide = true;
                    percent = true;
                    minus = true;
                }
            }
        });

        txtClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText("");
                edtResults.setText("");
                point = false; plus = true; multiply = true; divide = true; percent = true; minus = true;

            }
        });

        txtEqualTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtInput.getText().toString().length()>2 && (Character.isDigit(edtInput.getText().toString().charAt(edtInput.getText().toString().length()-1)) || edtInput.getText().toString().charAt(edtInput.getText().toString().length()-1)=='.')) {
                    edtInput.setText(eval(edtInput.getText().toString()));
                    edtResults.setText("");
                    point = false;
                    plus = false;
                    multiply = false;
                    divide = false;
                    percent = false;
                    minus = false;
                }
            }
        });

        txtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!plus) {
                    edtInput.setText(edtInput.getText().toString() + "+");
                    point = false; plus = true; multiply = true; divide = true; percent = true; minus = true;
                }
            }
        });
        txtMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!minus) {
                    edtInput.setText(edtInput.getText().toString() + "-");
                    point = false; plus = true; multiply = true; divide = true; percent = true; minus = true;
                }
            }
        });
        txtMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!multiply) {
                    edtInput.setText(edtInput.getText().toString() + "x");
                    point = false; plus = true; multiply = true; divide = true; percent = true; minus = true;
                }
            }
        });
        txtDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!divide) {
                    edtInput.setText(edtInput.getText().toString() + "÷");
                    point = false; plus = true; multiply = true; divide = true; percent = true; minus = true;
                }
            }
        });
        txtPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!percent) {
                    edtInput.setText(edtInput.getText().toString() + "%");
                    point = false; plus = true; multiply = true; divide = true; percent = true; minus = true;
                }
            }
        });

        txtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"1");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"2");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"3");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"4");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"5");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"6");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"7");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"8");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"9");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"0");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtDoubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText().toString()+"00");
                edtResults.setText(eval(edtInput.getText().toString()));
                plus = false; multiply = false; divide = false; percent = false; minus = false;
            }
        });
        txtPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!point) {
                    edtInput.setText(edtInput.getText().toString() + ".");
                    edtResults.setText(eval(edtInput.getText().toString()));
                    point = true; plus = true; multiply = true; divide = true; percent = true; minus = true;
                }
            }
        });
    }







    public String eval(String s) {

        char[] operator= {'%','÷','x', '+','-'};
        for (int j = 0; j<operator.length; j++){
            for (int i = 0; i < s.length(); i++) {
                String str = "";
                String minusD="";
                if(s.charAt(0) == '-'){
                    minusD="-";
                }
                if (s.charAt(i) == operator[j] ) {
                    i--;
                    while( Character.isDigit(s.charAt(i)) || s.charAt(i)=='.'){
//                        Log.e("float",Character.toString(s.charAt(i)));
                        str = Character.toString(s.charAt(i))+str ;
                        s = s.substring(0, i) + s.substring(i + 1);
                        if(i==0){
                            break;
                        }
                        if(Character.isDigit(s.charAt(i-1)) || s.charAt(i-1)=='.'){
                            i--;
                        }


                    }
                    str = minusD+str;
//                    Log.e("str",Character.toString(s.charAt(i)));
//                    Log.e("str",s);
                    double a = Double.parseDouble(str);
                    s = s.substring(0, i) + s.substring(i + 1);
                    str="";
                    while(Character.isDigit(s.charAt(i)) || s.charAt(i) == '.'){
                        str = str + Character.toString(s.charAt(i));
                        s = s.substring(0, i) + s.substring(i + 1);
                        if(i == s.length() ){
                            break;
                        }
                    }
                    double b = Double.parseDouble(str);
                    double cal = calculate(a,b,operator[j]);
//                    Log.e("re",Double.toString(cal));
                    s = s.substring(0,i)+Double.toString(cal)+s.substring(i);
                }
                else{
                    str="";
                }
            }
        }

        return s;
    }
    public double calculate(double a, double b, char operator){
        if      (operator == '+')    return  a+b;
        else if (operator == '-')    return a-b;
        else if (operator == 'x')    return a*b;
        else if (operator == '÷')    return a/b;
        else return a*(b/100);
    }
}





 */



