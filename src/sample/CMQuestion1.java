package sample;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CMQuestion1 extends QuestionType {
    private double value1;
    private double value2;
    private double value3;
    private double value4;

    Random rnd = new Random();

    public CMQuestion1() {
        //The random number generator will be used to change the structure of the question to allow the student to take the exam several times, with different questions.
        int pickQ1 = rnd.nextInt(2) + 1;
        if (pickQ1 == 1) {
            //Q1a
            //These random number generators are utilized to generate the values for each of the known variables that the student will utilize to find the unknown variable.
            //Mass - Value1
            value1 = rnd.nextInt(9) + 2;
            //Revolutions - Value2
            value2 = rnd.nextInt(19) + 2;
            //Time - Value3
            value3 = rnd.nextInt(51) + 10;
            //Radius - Value4
            value4 = rnd.nextInt(9) + 2;
            //This is one of the formulas that comes in the formula booklet given by the IB
            double force = (4 * (Math.PI * Math.PI) * value1 * value4) / ((value3 / value2) * (value3 / value2));
            double force2 = force * 10;
            double round = (double) Math.round(force2);
            ans = round / 10;
            Option1 = 0.0;
            Option2 = 0.0;
            Option3 = 0.0;
            //I attempted to obtain 1dp by multiplying by 10, rounding and then dividing by 10, though this was was much more efficient.
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

            Question = "1) A ball that weighs " + value1 + " kg and is moving in a circular path makes " + value2 + " revolutions every " + value3 + " seconds. The distance between the center and the circumference of the circle drawn by the ball’s path is " + value4 + " metres. What is the centripetal force of the ball?";

        } else {
            //Q1b
            //Velocity - Value1
            value1 = rnd.nextInt(100) + 50;
            //Time - Value2
            value2 = rnd.nextInt(12) + 3;
            //Radius - Value3
            value3 = rnd.nextInt(450) + 50;

            double netAccel = (((value1 / value2) * (value1 / value2))) + (((value1 * value1) / value3) * ((value1 * value1) / value3));
            double sqrtAccel = (double) Math.sqrt(netAccel);
            double sqrtAccel2 = sqrtAccel * 10;
            double round = (double) Math.round(sqrtAccel2);
            ans = round / 10;
            Option1 = 0;
            Option2 = 0;
            Option3 = 0;

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


            Question = "1) A car accelerates uniformly from " + value1 + " m/s in " + value2 + " seconds from rest on a circular track. The radius of the track is " + value3 + " meters. What is the net acceleration of the car? Hint: net refers to the sum of the components of acceleration, these being the tangential and the centripetal acceleration.";
        }//end of else
    }


}
