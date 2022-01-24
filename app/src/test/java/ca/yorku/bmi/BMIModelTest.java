package ca.yorku.bmi;

import org.junit.Test;

public class BMIModelTest {

    @Test
    public void getBMITest()
    {
        double weight, height;
        System.out.println("Testing getBMI");

        weight = 90; height = 1.8;
        System.out.println(weight + "," + height);
        System.out.println(BMIModel.getBMI(weight, height));

        weight = 65; height = 1.56;
        System.out.println(weight + "," + height);
        System.out.println(BMIModel.getBMI(weight, height));

    }
    
     @Test
    public void toDoubleTest(){
        System.out.println("Testing toDouble");
        String num = "123.4";
        double value = Double.parseDouble(num);
        System.out.println(value);


        }

    @Test
    public void formatBMITest(){
        double hei = 12.37565;
        hei = Math.round(hei*10.0)/10.0;
        String str = String.valueOf(hei);
        System.out.println(str);
        
    }
}
