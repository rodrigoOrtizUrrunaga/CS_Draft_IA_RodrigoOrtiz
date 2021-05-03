package sample;

import java.util.Random;

public class CMQuestion5 {
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
    public CMQuestion5() {
        //Q5
        //Radius - Value1
        value1 = rnd.nextInt(31) + 40;
        //Velocity - Value2
        value2 = rnd.nextInt(21) + 40;

        double angle = ((double)value2*(double)value2)/((double)value1*9.81);
        double arctanAngle = (double) Math.atan(angle);
        double arctanAngle2 = arctanAngle * 10;
        double round = (double) Math.round(arctanAngle2);
        ans = round / 10;
        Option1 = 0;
        Option2 = 0;
        Option3 = 0;
        while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
            Option1 = ans + (-9 + rnd.nextInt(19) / 10);
            Option2 = ans + (-9 + rnd.nextInt(19) / 10);
            Option3 = ans + (-9 + rnd.nextInt(19) / 10);
        }
        Question = "5) A car goes around a circular road that has a radius of " + value1 + " metres at a speed of " + value2 + " m/s. What angle (in radians) of banking of the road would allow the car to follow the circular path with no friction required? Hint: friction acts as the centripetal force, thus another force which points at the center is key to the solution.";

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
