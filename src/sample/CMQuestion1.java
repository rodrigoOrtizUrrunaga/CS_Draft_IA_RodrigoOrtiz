package sample;
import java.util.Random;

public class CMQuestion1 extends QuestionType {
    private int value1;
    private int value2;
    private int value3;
    private int value4;

    Random rnd = new Random();

    public CMQuestion1() {
        int pickQ1 = rnd.nextInt(2) + 1;
        if (pickQ1 == 1) {
            //Q1a
            //Mass - Value1
            value1 = rnd.nextInt(9) + 2;
            //Revolutions - Value2
            value2 = rnd.nextInt(19) + 2;
            //Time - Value3
            value3 = rnd.nextInt(51) + 10;
            //Radius - Value4
            value4 = rnd.nextInt(9) + 2;

            double force = (4 * (Math.PI * Math.PI) * (double) value1 * (double) value4) / (((double) value3 / (double) value2) * ((double) value3 / (double) value2));
            double force2 = force * 10;
            double round = (double) Math.round(force2);
            ans = round / 10;
            Option1 = 0;
            Option2 = 0;
            Option3 = 0;
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
                Option1 = ans + (-9 + rnd.nextInt(19) / 10);
                Option2 = ans + (-9 + rnd.nextInt(19) / 10);
                Option3 = ans + (-9 + rnd.nextInt(19) / 10);
            }
            Question = "1) A ball that weighs " + value1 + " kg and is moving in a circular path makes " + value2 + " revolutions every " + value3 + " seconds. The distance between the center and the circumference of the circle drawn by the ball’s path is " + value4 + " metres. What is the centripetal force of the ball?";

        } else {
            //Q1b
            //Velocity - Value1
            int value1 = rnd.nextInt(100) + 50;
            //Time - Value2
            int value2 = rnd.nextInt(12) + 3;
            //Radius - Value3
            int value3 = rnd.nextInt(450) + 50;

            double netAccel = ((((double) value1 / (double) value2) * ((double) value1 / (double) value2))) + ((((double) value1 * (double) value1) / (double) value3) * (((double) value1 * (double) value1) / (double) value3));
            double sqrtAccel = (double) Math.sqrt(netAccel);
            double sqrtAccel2 = sqrtAccel * 10;
            double round = (double) Math.round(sqrtAccel2);
            ans = round / 10;
            Option1 = 0;
            Option2 = 0;
            Option3 = 0;
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans) {
                Option1 = ans + (-9 + rnd.nextInt(19) / 10);
                Option2 = ans + (-9 + rnd.nextInt(19) / 10);
                Option3 = ans + (-9 + rnd.nextInt(19) / 10);
            }
            Question = "1) A car accelerates uniformly from " + value1 + " m/s in " + value2 + " seconds from rest on a circular track. The radius of the track is " + value3 + " meters. What is the net acceleration of the car? Hint: net refers to the sum of the components of acceleration, these being the tangential and the centripetal acceleration.";
        }//end of else
    }


}
