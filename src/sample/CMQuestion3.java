package sample;

import java.text.DecimalFormat;
import java.util.Random;

public class CMQuestion3 extends QuestionType{
    private int value1;
    private int value2;

    Random rnd = new Random();
    public CMQuestion3() {
        //Q3
        //Radius - Value1
        value1 = rnd.nextInt(31) + 40;
        //Friction - Value2
        value2 = rnd.nextInt(41) + 40;
        double doubleValue2 = value2/100;

        double maxSpeed = ((double)doubleValue2)*9.81*(double)value1;
        double sqrtMaxSpeed = (double) Math.sqrt(maxSpeed);
        double sqrtMaxSpeed2 = sqrtMaxSpeed * 10;
        double round = (double) Math.round(sqrtMaxSpeed2);
        ans = round / 10;
        Option1 = 0;
        Option2 = 0;
        Option3 = 0;
        DecimalFormat formatter = new DecimalFormat("#0.0");
        while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans)
        {
            Option1 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
            Option1 = Double.parseDouble(formatter.format(Option1));
            Option2 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
            Option2 = Double.parseDouble(formatter.format(Option2));
            Option3 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
            Option3 = Double.parseDouble(formatter.format(Option3));
        }
        Question = "3) A car goes around a circular road with a radius of " + value1 + " metres. You’ve been informed that the coefficient of friction between the tires of the car and the road is " + doubleValue2 + ". On that account, what is the maximum speed at which the car can follow the circular path without drifting away from the circular path?";

    }

}
