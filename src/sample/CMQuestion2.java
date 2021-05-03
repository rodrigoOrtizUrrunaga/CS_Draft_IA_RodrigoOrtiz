package sample;

import java.util.Random;

public class CMQuestion2 {

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

    public CMQuestion2() {
        int pickQ2 = rnd.nextInt(2) + 1;
        if (pickQ2 == 1) {
            //Q2a
            //Mass - Value1
            value1 = rnd.nextInt(5) + 1;
            //Radius - Value2
            value2 = rnd.nextInt(41) + 40;
            double doubleValue2 = value2/100;
            //Velocity - Value3
            value3 = rnd.nextInt(31) + 10;

            double tensionFUp = (((double)value1*((double)value3*(double)value3))/((double)doubleValue2))-((double)value1*9.81);
            double tensionFMid = (((double)value1*((double)value3*(double)value3))/(((double)doubleValue2)+((double)value1*9.81)));
            double tensionFDown = ((double)value1*((double)value3*(double)value3))/((double)doubleValue2);

            int upMidDown = rnd.nextInt(3) + 1;
            double tensionF =0;
            String option2a ="";

            if (upMidDown == 1){
                tensionF = tensionFUp;
                option2a = "top";
            }
            if (upMidDown == 2){
                tensionF = tensionFMid;
                option2a = "middle";
            }
            if (upMidDown == 3){
                tensionF = tensionFDown;
                option2a = "bottom";
            }

            double tensionF2 = tensionF * 10;
            double round = (double) Math.round(tensionF2);
            ans = round / 10;
            Option1 = 0;
            Option2 = 0;
            Option3 = 0;
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
                Option1 = ans + (-9 + rnd.nextInt(19) / 10);
                Option2 = ans + (-9 + rnd.nextInt(19) / 10);
                Option3 = ans + (-9 + rnd.nextInt(19) / 10);
            }

            Question = "2) A ball that weighs " + value1 + " kg follows the path of a vertical circle of " + doubleValue2 + " metres in radius as it is attached to a rope and is moving at " + value3 + " m/s. What is the tension force in the rope that allows the ball to follow a circular path when the ball is at the " + option2a + " of the loop?";

        } else {
            //Q2b
            //Mass - Value1
            value1 = rnd.nextInt(31) + 20;
            double doubleValue1 = value1/100;
            //Length - Value2
            value2 = rnd.nextInt(45) + 75;
            double doubleValue2 = value2/100;
            //Revs - Value3
            value3 = rnd.nextInt(3) + 1;
            //Time - Value4
            value4 = rnd.nextInt(5) + 3;
            double tensionF = (((double)doubleValue1)*4*(Math.PI * Math.PI)*((double)doubleValue2)/(((double)value4/(double)value3)*((double)value4/(double)value3)));
            double tensionF2 = tensionF * 10;
            double round = (double) Math.round(tensionF2);
            ans = round / 10;
            Option1 = 0;
            Option2 = 0;
            Option3 = 0;
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
                Option1 = ans + (-9 + rnd.nextInt(19) / 10);
                Option2 = ans + (-9 + rnd.nextInt(19) / 10);
                Option3 = ans + (-9 + rnd.nextInt(19) / 10);
            }
            Question = "2) A tetherball that weighs " + doubleValue1 + " kg is attached to a pole and a string of length " + doubleValue2 + " centimetres. It makes " + value3 + " revolutions every " + value4 + " seconds. What is the tension force in the rope that allows the ball to follow a circular path?";
        }//end of else
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