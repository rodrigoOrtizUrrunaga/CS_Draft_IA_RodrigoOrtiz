package sample;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PMQuestion9 extends QuestionType {
    private double value1;
    private double value2;

    Random rnd = new Random();
    public PMQuestion9() {
        //The random number generator will be used to change the structure of the question to allow the student to take the exam several times, with different questions.
        int pickQ9 = rnd.nextInt(3) + 1;
        if (pickQ9 == 1) {
            //Gravitational Potential - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1/100);
            int orderOfMagnitude1 = rnd.nextInt(2) + 7;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);

            double gPotential = 2*finalValue1;
            double a = (double) Math.sqrt(gPotential);
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
            Question = "9) A planet has a gravitational potential of " + finalValue1 + " J/kg. Using this information, find the escape velocity for the planet.";

        }
        if (pickQ9 == 2) {
            //Gravitational Acceleration - Value1
            value1 = rnd.nextInt(1300) + 301;
            double x = (value1/100);
            double y = x * 100;
            double z = (double) Math.round(y);
            double doubleValue1 = z / 100;
            //Radius - Value1
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(2) + 6;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);

            double gPotential = 2*doubleValue1*finalValue2;
            double a = (double) Math.sqrt(gPotential);
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
            Question = "9) A planet has a gravitational acceleration of " + doubleValue1 + " m/s2 and a radius of " + finalValue2 + " metres. What is the escape velocity for the planet?";

        }
        if (pickQ9 == 3) {
            //Mass - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = value1/100;
            int orderOfMagnitude1 = rnd.nextInt(5) + 23;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);
            //Radius - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(2) + 6;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);
            double G = 6.67e-11;

            double gPotential = (2*G*doubleValue1)/finalValue2;
            double a = (double) Math.sqrt(gPotential);
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
            Question = "9) A planet has a total mass of " + finalValue1 + " kg and a radius of " + finalValue2 + " metres. What is the escape velocity on this planet?";

        }

    }

}
