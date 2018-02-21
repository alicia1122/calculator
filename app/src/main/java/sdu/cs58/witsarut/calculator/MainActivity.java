package sdu.cs58.witsarut.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1 Expiicit
    EditText number1EditText, number2EdiText;
    Button addButton;
    TextView resultTextView;
    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View ผูกตัวแปับน Java กับอิลมันท์บน XML
        number1EditText = findViewById(R.id.edtNumber1);
        number2EdiText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วก็เก็บลงในตัวแปรชนิด int
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EdiText.getText().toString().trim());
                result = num1 + num2;

                //4. แสดงผลลับที่กำหนด
                resultTextView.setText(result + "");
            }

        });
    }//end onCreate;
}//end class
