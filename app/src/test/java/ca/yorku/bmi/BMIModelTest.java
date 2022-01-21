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
}
