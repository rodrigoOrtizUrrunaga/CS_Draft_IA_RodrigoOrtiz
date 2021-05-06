package sample;

import java.util.ArrayList;

public class CMTest {

   //Creates the entire 10 questions for the quiz.

    CMQuestion1 q1 = new CMQuestion1();
    CMQuestion2 q2 = new CMQuestion2();
    CMQuestion3 q3 = new CMQuestion3();
    CMQuestion4 q4 = new CMQuestion4();
    CMQuestion5 q5 = new CMQuestion5();
    PMQuestion6 q6 = new PMQuestion6();
    PMQuestion7 q7 = new PMQuestion7();
    PMQuestion8 q8 = new PMQuestion8();
    PMQuestion9 q9 = new PMQuestion9();
    PMQuestion10 q10 = new PMQuestion10();

    public CMTest(){

    }


    //Methods to get the information from each of the questions.
    public CMQuestion1 getQ1() {
        return q1;
    }
    public CMQuestion2 getQ2() {
        return q2;
    }
    public CMQuestion3 getQ3() {
        return q3;
    }
    public CMQuestion4 getQ4() {
        return q4;
    }
    public CMQuestion5 getQ5() {
        return q5;
    }
    public PMQuestion6 getQ6() {
        return q6;
    }
    public PMQuestion7 getQ7() {
        return q7;
    }
    public PMQuestion8 getQ8() {
        return q8;
    }
    public PMQuestion9 getQ9() {
        return q9;
    }
    public PMQuestion10 getQ10() {
        return q10;
    }

}
