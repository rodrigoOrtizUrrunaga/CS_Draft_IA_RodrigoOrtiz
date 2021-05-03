package sample;

import java.util.Random;

public class PMQuestion9 {
    private int value1;
    private int value2;
    private double ans;
    private double Option1;
    private double Option2;
    private double Option3;

    String Question;

    private double studentAns;
    private boolean correctOrWrong;

    Random rnd = new Random();
    public PMQuestion9() {
        int pickQ9 = rnd.nextInt(3) + 1;
        if (pickQ9 == 1) {
            //Gravitational Potential - Value1
            value1 = rnd.nextInt(800) + 101;
            double doubleValue1 = (value1/100);
            int orderOfMagnitude1 = rnd.nextInt(2) + 7;
            double finalValue1 = doubleValue1*(double) Math.pow(10, orderOfMagnitude1);

            double gPotential = 2*(double)finalValue1;
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
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
                Option1 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
                Option2 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
                Option3 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
            }
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

            double gPotential = 2*(double)doubleValue1*(double)finalValue2;
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
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
                Option1 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
                Option2 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
                Option3 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
            }
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

            double gPotential = (2*(double)G*(double)doubleValue1)/(double)finalValue2;
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
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
                Option1 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
                Option2 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
                Option3 = (f + (-9 + rnd.nextInt(19) / 10)) * Math.pow(10, b);
            }
            Question = "9) A planet has a total mass of " + finalValue1 + " kg and a radius of " + finalValue2 + " metres. What is the escape velocity on this planet?";

        }

    }
    public String getQuestion() {return Question;}
    public double getAns() {return ans;}
    public void setStudentAns(double studentAns) {
        this.studentAns = studentAns;
        if (studentAns == ans){
            correctOrWrong=true;
        }else{
            correctOrWrong=false;
        }
    }
}
