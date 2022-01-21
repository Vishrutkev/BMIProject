package ca.yorku.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clic(View v)
    {
        EditText  w = (EditText) findViewById(R.id.weightBox);
        EditText  h = (EditText) findViewById(R.id.heightBox);
        String wS = w.getText().toString();
        String hS = h.getText().toString();


        double wD = BMIModel.toDouble(wS);
        double hD = BMIModel.toDouble(hS);
        double index = BMIModel.getBMI(wD, hD);
        String bmi = BMIModel.formatBMI(index);

       TextView answer = (TextView) findViewById(R.id.answer);
       answer.setText(bmi);



    }
}