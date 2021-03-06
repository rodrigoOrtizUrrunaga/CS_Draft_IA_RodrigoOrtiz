package sample;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PMQuestion7 extends QuestionType {
    private double value1;
    private double value2;
    private double value3;
    private double value4;
    private double value5;

    Random rnd = new Random();
    public PMQuestion7() {
        //The random number generator will be used to change the structure of the question to allow the student to take the exam several times, with different questions.
        int pickQ7 = rnd.nextInt(2) + 1;
        if (pickQ7 == 1) {

            //Mass of Moon X - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1 / 100);
            int orderOfMagnitude1 = rnd.nextInt(2) + 22;
            double finalValue1 = doubleValue1 * (double) Math.pow(10, orderOfMagnitude1);
            //Mass of Planet Y - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2 / 100);
            int orderOfMagnitude2 = rnd.nextInt(5) + 23;
            double finalValue2 = doubleValue2 * (double) Math.pow(10, orderOfMagnitude2);
            //Mass of Star Z - Value3
            value3 = rnd.nextInt(800) + 101;
            double doubleValue3 = (value3 / 100);
            int orderOfMagnitude3 = rnd.nextInt(3) + 30;
            double finalValue3 = doubleValue3 * (double) Math.pow(10, orderOfMagnitude3);
            //Radius XY - Value4
            value4 = rnd.nextInt(800) + 101;
            double doubleValue4 = (value4 / 100);
            int orderOfMagnitude4 = rnd.nextInt(2) + 8;
            double finalValue4 = doubleValue4 * (double) Math.pow(10, orderOfMagnitude4);
            //Radius XZ - Value5
            value5 = rnd.nextInt(800) + 101;
            double doubleValue5 = (value5 / 100);
            int orderOfMagnitude5 = rnd.nextInt(2) + 10;
            double finalValue5 = doubleValue5 * (double) Math.pow(10, orderOfMagnitude5);
            double G = 6.67e-11;

            double a = (( G * finalValue1 * finalValue3) / (Math.pow(finalValue5, 2))) - (( G * finalValue1 * finalValue2) / (Math.pow(finalValue4, 2)));
            double b = (int) Math.floor(Math.log10(a));
            double c = a / (int) Math.pow(10, b);
            double d = c * 100;
            double e = (double) Math.round(d);
            double f = e / 100;
            double g = f * (int) Math.pow(10, b);
            ans = g;

            Option1 = 0;
            Option2 = 0;
            Option3 = 0;
            /*
            DecimalFormat formatter = new DecimalFormat("#0.0");
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans)
            {
                Option1 = (f + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10)))* Math.pow(10, b);
                Option1 = Double.parseDouble(formatter.format(Option1));
                Option2 = (f + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10)))* Math.pow(10, b);
                Option2 = Double.parseDouble(formatter.format(Option2));
                Option3 = (f + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10)))* Math.pow(10, b);
                Option3 = Double.parseDouble(formatter.format(Option3));
            }
            */
            DecimalFormat formatter = new DecimalFormat("#0.0");
            System.out.println("part1");
            ArrayList<Double> list = new ArrayList<Double>();
            for (Double i=0.1; i<1.0; i=i+0.1) {
                list.add(new Double(f + i));
                list.add(new Double(f - i));
            }
            Collections.shuffle(list);

            Option1 = (Double.parseDouble(formatter.format(list.get(1))))* Math.pow(10, b);
            Option2 = (Double.parseDouble(formatter.format(list.get(2))))* Math.pow(10, b);
            Option3 = (Double.parseDouble(formatter.format(list.get(3))))* Math.pow(10, b);
            Question = "7) Moon X orbits Planet Y which it in turn orbits Star Z. They weigh " + finalValue1 + " kg, " + finalValue2 + " kg and " + finalValue3 + " kg respectively. When Moon X is between Planet Y and Star Z, the distance between Moon X and Planet Y is " + finalValue4 + " metres and the distance between Moon X and Star Z is " + finalValue5 + " metres. What is the magnitude of the net gravitational force exerted on Moon X ? Hint: forces are vector quantities.";

        }
        if (pickQ7 ==2 ){
            //Mass of Moon X - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1 / 100);
            int orderOfMagnitude1 = rnd.nextInt(2) + 22;
            double finalValue1 = doubleValue1 * (double) Math.pow(10, orderOfMagnitude1);
            //Mass of Planet Y - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2 / 100);
            int orderOfMagnitude2 = rnd.nextInt(5) + 23;
            double finalValue2 = doubleValue2 * (double) Math.pow(10, orderOfMagnitude2);
            //Mass of Star Z - Value3
            value3 = rnd.nextInt(800) + 101;
            double doubleValue3 = (value3 / 100);
            int orderOfMagnitude3 = rnd.nextInt(3) + 30;
            double finalValue3 = doubleValue3 * (double) Math.pow(10, orderOfMagnitude3);
            //Radius XY - Value4
            value4 = rnd.nextInt(800) + 101;
            double doubleValue4 = (value4 / 100);
            int orderOfMagnitude4 = rnd.nextInt(2) + 8;
            double finalValue4 = doubleValue4 * (double) Math.pow(10, orderOfMagnitude4);
            //Radius XZ - Value5
            value5 = rnd.nextInt(800) + 101;
            double doubleValue5 = (value5 / 100);
            int orderOfMagnitude5 = rnd.nextInt(2) + 10;
            double finalValue5 = doubleValue5 * (double) Math.pow(10, orderOfMagnitude5);
            double G = 6.67e-11;

            double forceXY = (G * finalValue1 * finalValue2) / (Math.pow(finalValue4, 2));
            double forceXZ = (G * finalValue1 * finalValue3) / (Math.pow(finalValue5, 2));
            double a = (double) Math.pow(forceXY, 2) + (double) Math.pow(forceXZ, 2);
            double sqrtA = (double) Math.sqrt(a);
            double b = (int) Math.floor(Math.log10(a));
            double c = a / (int) Math.pow(10, b);
            double d = c * 100;
            double e = (double) Math.round(d);
            double f = e / 100;
            double g = f * (int) Math.pow(10, b);
            ans = g;

            Option1 = 0;
            Option2 = 0;
            Option3 = 0;
            /*
            DecimalFormat formatter = new DecimalFormat("#0.0");
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans)
            {
                Option1 = (f + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10)))* Math.pow(10, b);
                Option1 = Double.parseDouble(formatter.format(Option1));
                Option2 = (f + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10)))* Math.pow(10, b);
                Option2 = Double.parseDouble(formatter.format(Option2));
                Option3 = (f + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10)))* Math.pow(10, b);
                Option3 = Double.parseDouble(formatter.format(Option3));
            }
            */
            DecimalFormat formatter = new DecimalFormat("#0.0");
            System.out.println("part1");
            ArrayList<Double> list = new ArrayList<Double>();
            for (Double i=0.1; i<1.0; i=i+0.1) {
                list.add(new Double(f + i));
                list.add(new Double(f - i));
            }
            Collections.shuffle(list);

            Option1 = (Double.parseDouble(formatter.format(list.get(1))))* Math.pow(10, b);
            Option2 = (Double.parseDouble(formatter.format(list.get(2))))* Math.pow(10, b);
            Option3 = (Double.parseDouble(formatter.format(list.get(3))))* Math.pow(10, b);
            Question = "7) Moon X orbits Planet Y which it in turn orbits Star Z. They weigh " + finalValue1 + " kg, " + finalValue2 + " kg and " + finalValue3 + " kg respectively. When the gravitational force between Moon X and Planet Y is perpendicular to the gravitational force between Moon X and Star Z, the distance between Moon X and Planet Y is " + finalValue4 + " metres and the distance between Moon X and Star Z is " + finalValue5 + " metres. What is the magnitude of the net gravitational force exerted on Moon X when these are perpendicular to each other? Hint: forces are vector quantities.";

        }
    }

}
