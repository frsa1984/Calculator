package com.example.frankie.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    //////////////////////Declaring my buttons
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonAdd;
    Button buttonSubtract;
    Button buttonMultiply;
    Button buttonDivide;
    Button buttonEquals;
    Button buttonClear;
    Button buttonNegative;
    Button buttonPercent;
    Button buttonCurrency;
    Button buttonPoint;

    double v1;
    double v2;
    TextView textViewDisplay;
    Boolean isAdd;
    Boolean isSubtract;
    Boolean isMultiply;
    Boolean isDivide;

    MyCalculator calculator;

    /////////////////////////////////Running the program
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();  //Initialize all components
        setButtons();   //Set Button Values

        //calculator.add(1,2);

    }

    public void initComponents(){
        calculator = new MyCalculator();
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonNegative = (Button) findViewById(R.id.buttonNegative);
        buttonPercent = (Button) findViewById(R.id.buttonPercent);
        buttonCurrency = (Button) findViewById(R.id.buttonCurrency);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        textViewDisplay = (TextView) findViewById(R.id.textViewDisplay);
        isAdd = false;
        isSubtract = false;
        isMultiply = false;
        isDivide = false;
    }
    public void setButtons(){

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"0");
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"1");
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"2");
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"3");
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"4");
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"5");
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"6");
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"7");
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"8");
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(textViewDisplay.getText().toString());
                textViewDisplay.setText("");
                isAdd = true;
            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(textViewDisplay.getText().toString());
                textViewDisplay.setText("");
                isSubtract = true;
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textViewDisplay.getText().equals("")) {
                    v1 = Double.parseDouble(textViewDisplay.getText().toString());
                    textViewDisplay.setText("");
                    isMultiply = true;

                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(textViewDisplay.getText().toString());
                textViewDisplay.setText("");
                isDivide = true;
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Double.parseDouble(textViewDisplay.getText().toString());
                if(isAdd==true){
                    double result = calculator.add(v1,v2);
                    textViewDisplay.setText(""+ result);
                    isAdd = false;
                }
                if(isSubtract==true){
                    double result = calculator.subtract(v1,v2);
                    textViewDisplay.setText(""+ result);
                    isSubtract = false;
                }
                if(isMultiply==true){
                    double result = calculator.multiply(v1,v2);
                    textViewDisplay.setText(""+ result);
                    isMultiply = false;
                }
                if(isDivide==true){
                    double result = calculator.divide(v1,v2);
                    textViewDisplay.setText(""+ result);
                    isDivide = false;
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText("");
            }
        });
        buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText("-"+textViewDisplay.getText());
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+"%");
            }
        });
        buttonCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText("$"+textViewDisplay.getText());
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplay.setText(textViewDisplay.getText()+".");
            }
        });
    }




}

