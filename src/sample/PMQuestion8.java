package sample;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PMQuestion8 extends QuestionType {
    private double value1;
    private double value2;
    private double value3;

    Random rnd = new Random();
    public PMQuestion8() {
        //The random number generator will be used to change the structure of the question to allow the student to take the exam several times, with different questions.
        int pickQ8 = rnd.nextInt(4) + 1;
        if (pickQ8 == 1) {
            //Height - Value1
            value1 = 1000*(rnd.nextInt(9) + 1);
            //Mass - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(5) + 23;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);
            //Radius - Value3
            value3 = rnd.nextInt(800) + 101;
            double doubleValue3 = (value3/100);
            int orderOfMagnitude3 = rnd.nextInt(2) + 6;
            double finalValue3 = doubleValue3*(double) Math.pow(10, orderOfMagnitude3);
            double G = 6.67e-11;

            double v = (G*finalValue2)/finalValue3;
            double sqrtV = (double) Math.sqrt(v);
            double a = (2*(Math.PI)*(double)finalValue3)/(double)sqrtV;
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
            Question = "8) Satellite X is moving in a circular orbit around Planet Y at a height of " + value1 + " metres above the surface of the planet. The mass of Planet Y is " + finalValue2 + " kg and its radius is " + finalValue3 + " metres. What is the period in seconds of Satellite X as it orbits Planet Y?";

        }
        if (pickQ8 == 2) {
            //Period - Value1
            value1 = rnd.nextInt(11) + 22;
            //Mass - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(5) + 23;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);
            //Radius - Value3
            value3 = rnd.nextInt(800) + 101;
            double doubleValue3 = (value3/100);
            int orderOfMagnitude3 = rnd.nextInt(2) + 6;
            double finalValue3 = doubleValue3*(double) Math.pow(10, orderOfMagnitude3);
            double G = 6.67e-11;

            double a = 0;
            String option8b = "";
            int speedOrHeight = rnd.nextInt(2) + 1;
            if (speedOrHeight==1){
                double v = (G*finalValue2)/finalValue3;
                a = (double) Math.sqrt(v);
                option8b = "speed";
            }
            if (speedOrHeight==2) {
                double radius = (G * finalValue2 * Math.pow(value1, 2)) / (4 * (Math.PI * Math.PI));
                double cbrtRadius = (double) Math.cbrt(radius);
                a = (double) cbrtRadius - (double) finalValue3;
                option8b = "height";
            }
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
            Question = "8) Satellite X is geosynchronous to Planet Y. Said planet makes a turn on its axis every " + value1 + " hours, weighs " + finalValue2 + " kg and has a radius of " + finalValue3 + " metres. What is the " + option8b + " of the satellite above the surface of Planet Y?";
        }
        if (pickQ8 == 3) {
            //Radius AB - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1/100);
            int orderOfMagnitude1 = rnd.nextInt(2) + 10;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);
            //Radius AC - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(2) + 10;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);
            //Period AB - Value3
            value3 = rnd.nextInt(201) + 200;

            double periodAC = (Math.pow(finalValue2, 3)*Math.pow(value1, 2))/Math.pow(finalValue1, 3);
            double a = (double) Math.sqrt(periodAC);
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
            Question = "8) Star A and Planet B are " + finalValue1 + " metres apart whereas Star A and Planet C are " + finalValue2 + " metres away from each other. If it takes " + value3 + " Earth days for Planet B to orbit Star A, how many Earth days does Planet C take to orbit Star A?";

        }
        if (pickQ8 == 4) {
            //Radius AB - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1/100);
            int orderOfMagnitude1 = rnd.nextInt(2) + 10;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);
            //Radius AB - Value2
            value2 = rnd.nextInt(201) + 200;
            //Period AC - Value3
            value3 = rnd.nextInt(201) + 200;

            double radiusAC = (Math.pow(value3, 2)*Math.pow(finalValue1, 3))/Math.pow(value2, 2);
            double a = (double) Math.cbrt(radiusAC);
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
            Question = "8) Star A and Planet B are " + finalValue1 + " metres apart. It takes " + value2 + " Earth days for Planet B to orbit Star A and " + value3 + " Earth days for Planet C to orbit Star A. With this in mind, how far apart is Planet C from Star A?";

        }

    }

}
