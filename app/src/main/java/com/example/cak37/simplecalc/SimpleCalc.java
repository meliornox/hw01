package com.example.cak37.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SimpleCalc extends AppCompatActivity {

    private EditText Value1;
    private EditText Value2;
    private TextView Result;
    private Spinner OpSpin;
    private Button doubleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);
        addOperatorsToSpinner();
    }

    public void addOperatorsToSpinner(){
        OpSpin = (Spinner) findViewById(R.id.OpSpin);
        List<String> list = new ArrayList<>();
        list.add("Select Operator");
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        OpSpin.setAdapter(dataAdapter);
    }
public void Calculate(View v) {
    Value1 = (EditText) findViewById(R.id.Value1);
    Value2 = (EditText) findViewById(R.id.Value2);
    Result = (TextView) findViewById(R.id.Result);
    OpSpin = (Spinner) findViewById(R.id.OpSpin);

    int value1 = Integer.parseInt(Value1.getText().toString());
    int value2 = Integer.parseInt(Value2.getText().toString());

    if(OpSpin.getSelectedItem().toString() == "+"){
        Result.setText(Integer.toString(value1 + value2));
    }
    else if (OpSpin.getSelectedItem().toString() == "-"){
        Result.setText(Integer.toString(value1 - value2));
    }
    else if (OpSpin.getSelectedItem().toString() == "*"){
        Result.setText(Integer.toString(value1 * value2));
    }
    else if (OpSpin.getSelectedItem().toString() == "/"){
        Result.setText(Integer.toString(value1 / value2));
    }
}


}
