package sample;

import java.util.Random;

public class CMQuestion4 {
    private int value1;
    private double ans;
    private double Option1;
    private double Option2;
    private double Option3;

    String Question;

    private double studentAns;
    private boolean correctOrWrong;

    Random rnd = new Random();
    public CMQuestion4() {
        //Q4
        //Radius - Value1
        value1 = rnd.nextInt(16) + 10;

        double minSpeed = (double)value1*9.81;
        double sqrtMinSpeed = (double) Math.sqrt(minSpeed);
        double sqrtMinSpeed2 = sqrtMinSpeed * 10;
        double round = (double) Math.round(sqrtMinSpeed2);
        ans = round / 10;
        Option1 = 0;
        Option2 = 0;
        Option3 = 0;
        while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
            Option1 = ans + (-9 + rnd.nextInt(19) / 10);
            Option2 = ans + (-9 + rnd.nextInt(19) / 10);
            Option3 = ans + (-9 + rnd.nextInt(19) / 10);
        }
        Question = "4) What is the minimum speed at which a roller coaster should be moving when upside down at the top of a loop given that its radius is " + value1 + " metres?";
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
