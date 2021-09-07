package sample;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PMQuestion6 extends QuestionType{
    private double value1;
    private double value2;
    private double value3;


    Random rnd = new Random();
    public PMQuestion6() {
        //The random number generator will be used to change the structure of the question to allow the student to take the exam several times, with different questions.
        int pickQ6 = rnd.nextInt(3) + 1;
        if (pickQ6 == 1) {

            //Mass A - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1/100);
            int orderOfMagnitude1 = rnd.nextInt(5) + 23;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);
            //Mass B - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(5) + 23;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);
            //Force of gravity - Value3
            value3 = rnd.nextInt(800) + 101;
            double doubleValue3 = (value3/100);
            int orderOfMagnitude3 = rnd.nextInt(5) + 15;
            double finalValue3 = doubleValue3*(double) Math.pow(10, orderOfMagnitude3);
            double G = 6.67e-11;

            double a = (finalValue1*finalValue2*G)/finalValue3;
            double sqrtA = (double) Math.sqrt(a);
            double b = (int) Math.floor(Math.log10(sqrtA));
            double c = a/(int) Math.pow(10, b);
            double d = c*100;
            double e = (double) Math.round(d);
            double f = e/100;
            double g = f*(int) Math.pow(10, b);
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

            Question = "6) Planet A has a mass of " + value1 + " and Planet B has a mass of " + value2 + ". The force of gravity between the two planets is " + value3 + " N. With this in mind, what is the distance between these two planets? Remember that for one to calculate this the planets must be considered point masses.";
        }
        if (pickQ6 == 2) {
            //Q6b
            //Mass A - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1/100);
            int orderOfMagnitude1 = rnd.nextInt(5) + 23;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);
            //Mass B - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(5) + 23;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);
            //Radius - Value3
            value3 = rnd.nextInt(800) + 101;
            double doubleValue3 = (value3/100);
            int orderOfMagnitude3 = rnd.nextInt(2) + 10;
            double finalValue3 = doubleValue3*(double) Math.pow(10, orderOfMagnitude3);
            double G = 6.67e-11;

            double a = (finalValue1*finalValue2*G)/ Math.pow(finalValue3, 2);
            double b = (int) Math.floor(Math.log10(a));
            double c = a/(int) Math.pow(10, b);
            double d = c*100;
            double e = (double) Math.round(d);
            double f = e/100;
            double g = f*(int) Math.pow(10, b);
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
            Question = "6) Planet A has a mass of " + finalValue1 + " kg and Planet B has a mass of " + finalValue2 + " kg. The distance between these two planets is " + finalValue3 + " metres. With this in mind, what is the gravitational force between these two planets? Remember that for one to calculate this the planets must be considered point masses.";

        }
        if (pickQ6 == 3) {
            //Q6c
            //Mass A - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1/100);
            int orderOfMagnitude1 = rnd.nextInt(5) + 23;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);
            //Radius - Value2
            value2 = rnd.nextInt(800) + 101;
            double doubleValue2 = (value2/100);
            int orderOfMagnitude2 = rnd.nextInt(2) + 10;
            double finalValue2 = doubleValue2*(double) Math.pow(10, orderOfMagnitude2);
            //Force of gravity - Value3
            value3 = rnd.nextInt(800) + 101;
            double doubleValue3 = (value3/100);
            int orderOfMagnitude3 = rnd.nextInt(5) + 15;
            double finalValue3 = doubleValue3*(double) Math.pow(10, orderOfMagnitude3);
            double G = 6.67e-11;

            double a = (finalValue3*Math.pow(finalValue2, 2))/(G*finalValue1);
            double b = (int) Math.floor(Math.log10(a));
            double c = a/(int) Math.pow(10, b);
            double d = c*100;
            double e = (double) Math.round(d);
            double f = e/100;
            double g = f*(int) Math.pow(10, b);
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

            Question = "6) Planet A has a mass of " + finalValue1 + ". The distance between Planet A and Planet B is " + finalValue2 + " metres and the force of gravity between them is " + finalValue3 + " N. What is the mass of Planet B? Remember that for one to calculate this the planets must be considered point masses.";

        }
    }

}
