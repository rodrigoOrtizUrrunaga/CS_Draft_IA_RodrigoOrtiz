package sample;

import java.util.Random;

public class PMQuestion10 {
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    private double ans;
    private double Option1;
    private double Option2;
    private double Option3;

    String Question;

    private double studentAns;
    private boolean correctOrWrong;

    Random rnd = new Random();
    public PMQuestion10() {
        //Initial Radius - Value1
        value1 = rnd.nextInt(400) + 301;
        double doubleValue1 = (value1 / 100);
        int orderOfMagnitude1 = rnd.nextInt(2) + 7;
        double finalValue1 = doubleValue1 * (double) Math.pow(10, orderOfMagnitude1);
        //Final Radius - Value2
        value2 = rnd.nextInt(300) + 301;
        double doubleValue2 = (value2 / 100);
        int orderOfMagnitude2 = orderOfMagnitude1;
        double finalValue2 = doubleValue2 * (double) Math.pow(10, orderOfMagnitude2);
        //Mass A - Value3
        value3 = rnd.nextInt(800) + 101;
        double doubleValue3 = (value3 / 100);
        int orderOfMagnitude3 = rnd.nextInt(2) + 22;
        double finalValue3 = doubleValue3 * (double) Math.pow(10, orderOfMagnitude3);
        //Mass B - Value4
        value4 = rnd.nextInt(800) + 101;
        double doubleValue4 = (value4 / 100);
        int orderOfMagnitude4 = rnd.nextInt(2) + 22;
        double finalValue4 = doubleValue4 * (double) Math.pow(10, orderOfMagnitude4);
        double G = 6.67e-11;

        double a = -((double)G*(double)finalValue3*(double)finalValue4)*((1/(double)finalValue2)-(1/(double)finalValue1));
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
        Question = "10) Two moons orbiting the same planet are " + finalValue1 + " metres apart. After the planet makes a full rotation on its axis, the moons are " + finalValue2 + " metres away from each other. One of the moons weighs " + finalValue3 + " kg and the other " + finalValue4 + " kg. What is the change in gravitational potential energy of the two moon system?";

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
