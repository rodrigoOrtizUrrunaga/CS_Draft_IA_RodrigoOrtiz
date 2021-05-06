package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class Controller {



    public ArrayList<CMTest> CMTests = new ArrayList<CMTest>();
 public AnchorPane mainMenu;

 public Label ExplanationTitle;
 public TextArea explanationTextArea;
 public Label Imagelbl;
 public ImageView explanationImage;
 public AnchorPane explanationPane;

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

    public void takeTheQuiz(ActionEvent actionEvent) {
    }

    public void seeHighscores(ActionEvent actionEvent) {
    }


    public void ReturnToMenu(ActionEvent actionEvent) {
     mainMenu.setVisible(true);
     explanationPane.setVisible(false);
     //any other windows can be set to false
    }

    public void prevImageBtn(ActionEvent actionEvent) {
     if (PMImageIndex == 0) {
      explanationImage.setImage(PMImages.get(PMImages.size()-1));
      PMImageIndex = PMImages.size()-1;
     } else {
      PMImageIndex = PMImageIndex - 1;
      explanationImage.setImage(PMImages.get(PMImageIndex));
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
}

