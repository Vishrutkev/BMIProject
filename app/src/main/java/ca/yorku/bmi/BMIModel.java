package ca.yorku.bmi;

import java.text.DecimalFormat;

public class BMIModel {
    public static double getBMI(double weight, double height)
    {
        double result = weight / (height * height);
        return result;
    }

    public static double toDouble(String str)
    {
        double value = Double.parseDouble(str);
        return value;
    }

    public static String formatBMI(double bmi)
    {
        String bmi1 = String.format("%.2f", bmi);
        return bmi1;
    }

}
