package sample;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CMQuestion2 extends QuestionType {

    private double value1;
    private double value2;
    private double value3;
    private double value4;

    Random rnd = new Random();

    public CMQuestion2() {
        //The random number generator will be used to change the structure of the question to allow the student to take the exam several times, with different questions.
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
            //Here, there were three values for the tension since the question
            //had three versions, one where the ball was up, down and in the middle.
            double tensionFUp = ((value1*(value3*value3))/(doubleValue2))-(value1*9.81);
            double tensionFMid = ((value1*(value3*value3))/((doubleValue2)+(value1*9.81)));
            double tensionFDown = (value1*(value3*value3))/(doubleValue2);
            //Here, I am randomizing the version of the question that the student will have to solve for.
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
            /*
            DecimalFormat formatter = new DecimalFormat("#0.0");
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans)
            {
                Option1 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
                Option1 = Double.parseDouble(formatter.format(Option1));
                Option2 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
                Option2 = Double.parseDouble(formatter.format(Option2));
                Option3 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
                Option3 = Double.parseDouble(formatter.format(Option3));
            }
            */
            DecimalFormat formatter = new DecimalFormat("#0.0");
            System.out.println("part1");
            ArrayList<Double> list = new ArrayList<Double>();
            for (Double i=0.1; i<1.0; i=i+0.1) {
                list.add(new Double(ans + i));
                list.add(new Double(ans - i));
            }
            Collections.shuffle(list);

            Option1 = Double.parseDouble(formatter.format(list.get(1)));
            Option2 = Double.parseDouble(formatter.format(list.get(2)));
            Option3 = Double.parseDouble(formatter.format(list.get(3)));

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
            double tensionF = ((doubleValue1)*4*(Math.PI * Math.PI)*(doubleValue2)/((value4/value3)*(value4/value3)));
            double tensionF2 = tensionF * 10;
            double round = (double) Math.round(tensionF2);
            ans = round / 10;
            Option1 = 0;
            Option2 = 0;
            Option3 = 0;
            /*
            DecimalFormat formatter = new DecimalFormat("#0.0");
            while (Option1==Option2||Option2==Option3||Option3==Option1||Option1==ans||Option2==ans||Option3==ans)
            {
                Option1 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
                Option1 = Double.parseDouble(formatter.format(Option1));
                Option2 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
                Option2 = Double.parseDouble(formatter.format(Option2));
                Option3 = ans + ((-9 + (rnd.nextDouble()*19))+((-9 + (rnd.nextDouble()*19)) / 10));
                Option3 = Double.parseDouble(formatter.format(Option3));
            }
            */
            DecimalFormat formatter = new DecimalFormat("#0.0");
            System.out.println("part1");
            ArrayList<Double> list = new ArrayList<Double>();
            for (Double i=0.1; i<1.0; i=i+0.1) {
                list.add(new Double(ans + i));
                list.add(new Double(ans - i));
            }
            Collections.shuffle(list);

            Option1 = Double.parseDouble(formatter.format(list.get(1)));
            Option2 = Double.parseDouble(formatter.format(list.get(2)));
            Option3 = Double.parseDouble(formatter.format(list.get(3)));
            Question = "2) A tetherball that weighs " + doubleValue1 + " kg is attached to a pole and a string of length " + doubleValue2 + " centimetres. It makes " + value3 + " revolutions every " + value4 + " seconds. What is the tension force in the rope that allows the ball to follow a circular path?";
        }//end of else
    }

}