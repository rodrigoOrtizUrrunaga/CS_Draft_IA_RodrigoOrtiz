package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import java.util.ArrayList;

public class Controller {


    public Label quizTextArea;
    Random rnd = new Random();
    public ArrayList<CMTest> CMTests = new ArrayList<CMTest>();
 public AnchorPane mainMenu;

 public Label ExplanationTitle;
 public TextArea explanationTextArea;
 public Label Imagelbl;

 public ImageView explanationImage;
 public AnchorPane explanationPane;
 public AnchorPane quizPane;

    public CheckBox checkBx1;
    public CheckBox checkBx2;
    public CheckBox checkBx3;
    public CheckBox checkBx4;

 public void startCMTest() {
      // CMTests.add(new CMTest());

      // CMTests.get(0).q1.getQuestion();
      // CMTests.get(0).q1.getAns();
   }

   public static ArrayList<Image> PMImages = new ArrayList<Image>();
   public static ArrayList<Image> CMImages = new ArrayList<Image>();

 public static int PMImageIndex=0;
 public static  int CMImageIndex=0;

    public static  int ExViewing=0;//0 is CM   1 is PM

 public void initialize(){
   PMImages.add(new Image("/Images/Keplers First Law.png"));
   PMImages.add(new Image("/Images/Circle_Radians.gif"));
   PMImages.add(new Image("/Images/Angular DIsplacement.png"));


   CMImages.add(new Image("/Images/Circle_Radians.gif"));


 }

    public void reviewPlanetaryMotion(ActionEvent actionEvent) {
        ExViewing=1;

     mainMenu.setVisible(false);
     explanationPane.setVisible(true);

     ExplanationTitle.setText("Planetary Motion");
     explanationImage.setImage(PMImages.get(0));
     explanationTextArea.setText("explanation of PM...");
     Imagelbl.setText("image A");
    }

    public void reviewCircularMotion(ActionEvent actionEvent) {
        ExViewing=0;

     mainMenu.setVisible(false);
     explanationPane.setVisible(true);

     ExplanationTitle.setText("Circular Motion");
     explanationImage.setImage(CMImages.get(0));
     explanationTextArea.setText("explanation of CM...");
     Imagelbl.setText("image A");
    }

    List<CheckBox> order = new ArrayList<>();
    int currentQuestionCounter = 0;

    public void takeTheQuiz(ActionEvent actionEvent) {

        CMTests.add(new CMTest()); //adding a new test to the arraylist of tests.

        mainMenu.setVisible(false);
        explanationPane.setVisible(false);
        quizPane.setVisible(false);

        order.add(checkBx1);
        order.add(checkBx2);
        order.add(checkBx3);
        order.add(checkBx4);


        //setUpQuestion();

    }



    public void seeHighscores(ActionEvent actionEvent) {
    }


    public void ReturnToMenu(ActionEvent actionEvent) {
     mainMenu.setVisible(true);
     explanationPane.setVisible(false);
     //any other windows can be set to false
    }

    public void prevImageBtn(ActionEvent actionEvent) {
        if (ExViewing == 1) {
            if (PMImageIndex == 0) {
                explanationImage.setImage(PMImages.get(PMImages.size() - 1));
                PMImageIndex = PMImages.size() - 1;
            } else {
                PMImageIndex = PMImageIndex - 1;
                explanationImage.setImage(PMImages.get(PMImageIndex));
            }
        }
        else{
            if (CMImageIndex == 0) {
                explanationImage.setImage(CMImages.get(CMImages.size() - 1));
                CMImageIndex = CMImages.size() - 1;
            } else {
                CMImageIndex = CMImageIndex - 1;
                explanationImage.setImage(CMImages.get(CMImageIndex));
            }
        }
    }

    public void nextImageBtn(ActionEvent actionEvent) {
    if(ExViewing==1){
     if (PMImageIndex == PMImages.size()-1) {
      explanationImage.setImage(PMImages.get(0));
      PMImageIndex = 0;
     } else {
      PMImageIndex = PMImageIndex + 1;
      explanationImage.setImage(PMImages.get(PMImageIndex));
     }
    }else{
        if (CMImageIndex == CMImages.size()-1) {
            explanationImage.setImage(CMImages.get(0));
            CMImageIndex = 0;
        } else {
            CMImageIndex =CMImageIndex + 1;
            explanationImage.setImage(CMImages.get(CMImageIndex));
        }
    }
    }

    public void check1Ticked(ActionEvent actionEvent) {
        checkBx1.setSelected(true);
        checkBx2.setSelected(false);
        checkBx3.setSelected(false);
        checkBx4.setSelected(false);
    }
    public void check2Ticked(ActionEvent actionEvent) {
        checkBx1.setSelected(false);
        checkBx2.setSelected(true);
        checkBx3.setSelected(false);
        checkBx4.setSelected(false);
    }
    public void check3Ticked(ActionEvent actionEvent) {
        checkBx1.setSelected(false);
        checkBx2.setSelected(false);
        checkBx3.setSelected(true);
        checkBx4.setSelected(false);
    }
    public void check4Ticked(ActionEvent actionEvent) {
        checkBx1.setSelected(false);
        checkBx2.setSelected(false);
        checkBx3.setSelected(false);
        checkBx4.setSelected(true);
    }

    public void setUpQuestion(){

        Collections.shuffle(order);
        order.get(0).setText(Double.toString(CMTests.get(CMTests.size()).questions.get(currentQuestionCounter).getAns()));
        order.get(1).setText(Double.toString(CMTests.get(CMTests.size()).questions.get(currentQuestionCounter).getOption1()));
        order.get(2).setText(Double.toString(CMTests.get(CMTests.size()).questions.get(currentQuestionCounter).getOption2()));
        order.get(3).setText(Double.toString(CMTests.get(CMTests.size()).questions.get(currentQuestionCounter).getOption3()));


        quizTextArea.setText(CMTests.get(CMTests.size()).questions.get(currentQuestionCounter).getQuestion());


    }

    public void nextQuestionBtn(ActionEvent actionEvent) {
        if(checkBx1.isSelected() || checkBx2.isSelected() || checkBx3.isSelected() || checkBx4.isSelected()){
            //process the answer
            //for each in order
            for (CheckBox c: order) {
                //if checked
                if (c.isSelected()) {
                    CMTests.get(CMTests.size()).questions.get(0).setStudentAns(Double.parseDouble(c.getText()));//check this parses correctly...
                    currentQuestionCounter++;
                    setUpQuestion();
                }
            }
        }else{
            //alert the user to make a choice
        }


    }
}

