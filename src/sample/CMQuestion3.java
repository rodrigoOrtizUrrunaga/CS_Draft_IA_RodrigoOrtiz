package sample;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CMQuestion3 extends QuestionType{
    private double value1;
    private double value2;

    Random rnd = new Random();
    public CMQuestion3() {
        //Q3
        //Radius - Value1
        value1 = rnd.nextInt(31) + 40;
        //Friction - Value2
        value2 = rnd.nextInt(41) + 40;
        double doubleValue2 = value2/100;

        double maxSpeed = (doubleValue2)*9.81*value1;
        double sqrtMaxSpeed = (double) Math.sqrt(maxSpeed);
        double sqrtMaxSpeed2 = sqrtMaxSpeed * 10;
        double round = (double) Math.round(sqrtMaxSpeed2);
        ans = round / 10;
        Option1 = 0;
        Option2 = 0;
        Option3 = 0;
        /*
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
            */
        DecimalFormat formatter = new DecimalFormat("#0.0");
        System.out.println("part1");
        ArrayList<Double> list = new ArrayList<Double>();
        for (Double i=0.1; i<1.0; i=i+0.1) {
            list.add(new Double(ans + i));
            list.add(new Double(ans - i));
        }
        Collections.shuffle(list);

        Option1 = Double.parseDouble(formatter.format(list.get(1)));
        Option2 = Double.parseDouble(formatter.format(list.get(2)));
        Option3 = Double.parseDouble(formatter.format(list.get(3)));
        Question = "3) A car goes around a circular road with a radius of " + value1 + " metres. You’ve been informed that the coefficient of friction between the tires of the car and the road is " + doubleValue2 + ". On that account, what is the maximum speed at which the car can follow the circular path without drifting away from the circular path?";

    }

}
