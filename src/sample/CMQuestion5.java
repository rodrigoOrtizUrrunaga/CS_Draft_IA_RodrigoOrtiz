package sample;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CMQuestion5 extends QuestionType {
    private double value1;
    private double value2;

    Random rnd = new Random();
    public CMQuestion5() {
        //Q5
        //Radius - Value1
        value1 = rnd.nextInt(31) + 40;
        //Velocity - Value2
        value2 = rnd.nextInt(21) + 40;

        double angle = (value2*value2)/(value1*9.81);
        double arctanAngle = (double) Math.atan(angle);
        double arctanAngle2 = arctanAngle * 10;
        double round = (double) Math.round(arctanAngle2);
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
        Question = "5) A car goes around a circular road that has a radius of " + value1 + " metres at a speed of " + value2 + " m/s. What angle (in radians) of banking of the road would allow the car to follow the circular path with no friction required? Hint: friction acts as the centripetal force, thus another force which points at the center is key to the solution.";

    }

}
