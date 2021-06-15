package sample;

import java.text.DecimalFormat;
import java.util.Random;

public class CMQuestion4 extends QuestionType {
    private int value1;


    Random rnd = new Random();
    public CMQuestion4() {
        //Q4
        //Radius - Value1
        value1 = rnd.nextInt(16) + 10;

        double minSpeed = (double) value1 * 9.81;
        double sqrtMinSpeed = (double) Math.sqrt(minSpeed);
        double sqrtMinSpeed2 = sqrtMinSpeed * 10;
        double round = (double) Math.round(sqrtMinSpeed2);
        ans = round / 10;
        Option1 = 0;
        Option2 = 0;
        Option3 = 0;
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
        Question = "4) What is the minimum speed at which a roller coaster should be moving when upside down at the top of a loop given that its radius is " + value1 + " metres?";
    }
}
