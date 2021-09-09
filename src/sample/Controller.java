package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
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

public class Controller extends QuestionType{


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
   PMImages.add(new Image("/Images/2ndlaw.png"));
   PMImages.add(new Image("/Images/thirdlaw.jpg"));



   CMImages.add(new Image("/Images/Circle_Radians.gif"));
   CMImages.add(new Image("/Images/angular displacement.jpg"));
   CMImages.add(new Image("/Images/banking.png"));

 }

    String CMText = "The Radian (π)\n" +
            "- Aside from degrees, angles can be measured in radians.\n" +
            "- 1 radian corresponds to the angle whose arc length is equal to the radius.\n" +
            "- On this account, 180° equals π radians and 360° to 2π radians.\n" +
            "- θ = d / r, where d (or s) is the arc length, r the radius and θ the angle.\n" +
            "Equations:\n" +
            "- θ degrees = (θ radians x 180) / π\n" +
            "- θ radians = (θ degrees x π) / 180\n" +
            "\n" +
            "Angular Displacement\n" +
            "Angular displacement is defined as θ.  \n" +
            "- It is the degrees or radians travelled  regardless of the distance covered  when doing so.                                 \n" +
            " - On the right hand side, each coloured  line has the same angular displacement (θ), yet they have different  displacements (d, s, x).                     \n" +
            " - Displacement is the final position relative to the initial position.\n" +
            "- The angular displacement of a body or object that moved from P to P1 is θ (Theta).\n" +
            "- The distance moved is equal to the arc length labelled as s (or d).\n" +
            "- The relationship between θ and d is as follows: d = rθ (in metres)\n" +
            "- For very small values of θ, the arc length d is virtually equal to the radius r.\n" +
            "Equations:\n" +
            "- d = rθ (in metres)" +
            "\n" +
            "Angular Velocity (ω)\n" +
            "- The movement from P to P1 of the body took time t.\n" +
            "- Linear velocity v = d/t, then since d = rθ, replacing d, v = rθ/t (in metres). \n" +
            "- Angular velocity (ω) only takes into account the change in the angle θ over time t. Thereby, ω = θ/t (in radians).\n" +
            "- Ultimately, this signifies that v = rω as the (θ/t) in v = rθ/t can be replaced with ω.\n" +
            "Equations:\n" +
            "- v = d/t = rθ/t = rθ/t\n" +
            "- d = rθ\n" +
            "- ω = θ/t\n" +
            "\n" +
            "Angular Acceleration (α)\n" +
            "- Angular acceleration (α) is the rate of change of the angular velocity (ω).\n" +
            "- If the rate of change of ω is constant, then α can be described as:\n" +
            "α = (ωf - ωi) / t (where ωf is the final angular velocity and ωi the initial angular velocity.\n" +
            "- Because linear acceleration a = (vf - vi) / t and v = rω, a = (rωf - rωi) / t = r(ωf - ωi) / t = rα.\n" +
            "Equations:\n" +
            "- α = (ωf - ωi) / t\t\n" +
            "- v = rω\n" +
            "- a = (vf - vi) / t = (rωf - rωi) / t = r(ωf - ωi) / t\n" +
            "Thus a = rα" +
            "\n" +
            "Frequency (f) and Period (T)\n" +
            "- Frequency is the number of revolutions or cycles per second in Hertz (Hz)\n" +
            "- Period is the time per cycle in seconds (s)\n" +
            "- Since ω = θ/t, then if θ = 2π = 1 revolution, then ω = 2π / T = 2πf\n" +
            "Equations:\n" +
            "- f = revolutions / 1 second = 1 / T = ω / 2π\n" +
            "- T = time / 1 revolution = 1/ f = 2π / ω \n" +
            "\n" +
            "Centripetal force (F) and acceleration (a)\n" +
            "- Centripetal force is the resultant force exerted on an object in circular motion and by definition, always points at the center of the circular path made.\n" +
            "- Centripetal acceleration is the acceleration that an object in circular motion has to keep rotating, since though its speed does not change, its velocity (as it is a vector) does.\n" +
            "Equations:\n" +
            "- F = mv^2 / r = 4π^2mr / T^2 = ω^2mr\n" +
            "- a = v^2 / r = 4π^2r / T^2 = ω^2r\n" +
            "Note that a = F / m, from F = ma\n" +
            "\n" +
            "Loops\n" +
            "The minimum speed to complete a loop requires one to consider:\n" +
            "- The speed to reach the top\n" +
            "- That at the top, Fnet = Fg + Fn (Force of gravity + Normal Force)\n" +
            "- That at the min speed, Fn = 0\n" +
            "Derivation of vmin:\n" +
             "Fg = Fnet = Fc = m(vmin)^2 / r = mg\n" +
            "(vmin)^2 = gr, vmin = sqrt (gr) [at the top of the loop]\n" +
            "\n" +
            "Angle of Banking\n" +
            "- The angle of banking is the angle at which a car can go around a loop at a given speed without the tendency to skid or slide.\n" +
            "Derivation:\n" +
            "- Fnx causes Fc\n" +
            "- Fnsinθ = mv^2 / r and Fncosθ = mg\n" +
            "- Fn = mg / cosθ, Fnsinθ = mgsinθ / cosθ = mgtanθ = mv^2 / r\n" +
            "- tanθ = v^2 / rg, θ = arctan(v^2 / rg)";

    String PMText = "Kepler's Laws\n" +
            "- Kepler’s First Law - The Law of Ellipses / Law of Orbits:\n" +
            "Planets are orbiting the sun in a path described as an ellipse\n" +
            "- Kepler’s Second Law - The Law of Equal Areas / Law of Areas:\n" +
            "The radius vector from the sun to a planet covers or sweeps equal areas in equal times\n" +
            "- Kepler’s Third Law - The Law of Harmonies / Law of Periods:\n" +
            "The ratio of the squares of the periods of planets is equal to the ratio of the cubes of their distance to the sun (or center of their orbit)\n" +
            "T^2 ∝ R^3 or (Ta / Tb)^2 = (Ra / Rb)^3\n" +
            "\n" +
            "Newton’s Universal Law of Gravity\n" +
            "- Every particle attracts every other particle in the universe with a force that is directly proportional to the product of their masses (Mm) and inversely proportional to the square of the distance between their centers (1 / r^2) [Assumes that they behave as point masses]\n" +
            "- Fg = GMm / r^2 where G = 6.67 x 10^-11 m^3 kg^-1 s^-2 or Nm^2 / Kg^2\n" +
            "\n" +
            "Gravitational Field Strength\n" +
            "- The force acting on a unit mass (1 kg)at a point in a gravitational field\n" +
            "- g = Fg / m = GM / r^2 = ΔV/ΔR = (vesc)^2 / 2R = (- V) / R = (-Ep) / mR [in N/kg]\n" +
            "- g = a = v^2 / r = 4π^2r / T^2" +
            "\n" +
            "Law of Periods\n" +
            "- Fnet = Fc = Fg, thus mv^2 / r = GMm / r^2\n" +
            "- v = rω and ω = 2π / T\n" +
            "- v = 2πr / T and v^2 = 4π^2r^2 / T^2\n" +
            "- Fc = 4π^2rm / T^2 = GMm / r^2\n" +
            "- 4π^2 / T^2 = GM / r^3\n" +
            "- 4π^2 / GM = T^2 / r^3" +
            "Gravitational Potential Energy (Ep)\n" +
            "- The work needed/done to move a mass from infinity ( Ep at infinity = 0J) to a point\n" +
            "- Ep = ΔW = ΔFgR = (-GMm) / R [in J]\n" +
            "- ΔEp = (-GMm)((1 / Rf) - (1 / Ri))\n" +
            "\n" +
            "Gravitational Potential\n" +
            "- The work done/needed to move a unit mass (1 kg) from infinity to a point\n" +
            "- V = ΔW / m = Ep / m = (-GM) / R [in J/kg]\n" +
            "- g = -ΔV / ΔR = negative slope of V(y) vs R(x), thus ΔV = gΔR\n" +
            "\n" +
            "Potential, Kinetic, and Mechanical Energy (Ep, Ek and Et)\n" +
            "- Fnet = Fc = Fg\n" +
            "- GMm / r^2 = mv^2 / r\n" +
            "- v^2 = GM / r\n" +
            "- Ek = (½)mv^2 = GMm / 2r\n" +
            "- Ep or U = (-GMm) / R and Ek = GMm / 2r\n" +
            "- Et = Ep + Ek = (-GMm) / 2r\n" +
            "- Ek = (-Ep) / 2 and Ep = (-2Ek)\n" +
            "\n" +
            "Escape Velocity (vesc)\n" +
            "- The velocity needed to overcome (escape) the gravitational pull of a planet (or mass)\n" +
            "- Ep = Vm\n" +
            "- ΔEp = ΔEk\n" +
            "- (½)m(vesc)^2 = GMm / R\n" +
            "- (vesc)^2 = 2GM / R, thus vesc = sqrt (2GM / R)\n" +
            "- g = GM / R^2, thus vesc = sqrt (2gR) = sqrt (2ΔV)";

    public void reviewPlanetaryMotion(ActionEvent actionEvent) {
        ExViewing=1;

     mainMenu.setVisible(false);
     explanationPane.setVisible(true);

     ExplanationTitle.setText("Planetary Motion");
     explanationImage.setImage(PMImages.get(0));
     explanationTextArea.setText(PMText);
     Imagelbl.setText("image A");
    }

    public void reviewCircularMotion(ActionEvent actionEvent) {
        ExViewing=0;

     mainMenu.setVisible(false);
     explanationPane.setVisible(true);

     ExplanationTitle.setText("Circular Motion");
     explanationImage.setImage(CMImages.get(0));
     explanationTextArea.setText(CMText);
     Imagelbl.setText("image A");
    }

    List<CheckBox> order = new ArrayList<>();
    int currentQuestionCounter = 0;

    public void takeTheQuiz(ActionEvent actionEvent) {

        CMTests.add(new CMTest()); //adding a new test to the arraylist of tests.

        mainMenu.setVisible(false);
        explanationPane.setVisible(false);
        quizPane.setVisible(true);

        order.add(checkBx1);
        order.add(checkBx2);
        order.add(checkBx3);
        order.add(checkBx4);


        setUpQuestion();

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

    //This is used to randomize the order at which the options and answer are organized when taking the test to prevent students from correctly guessing from memory instead of working out the answer.
    public void setUpQuestion(){

        Collections.shuffle(order);
        order.get(0).setText(Double.toString(CMTests.get(CMTests.size()-1).questions.get(currentQuestionCounter).getAns()));
        order.get(1).setText(Double.toString(CMTests.get(CMTests.size()-1).questions.get(currentQuestionCounter).getOption1()));
        order.get(2).setText(Double.toString(CMTests.get(CMTests.size()-1).questions.get(currentQuestionCounter).getOption2()));
        order.get(3).setText(Double.toString(CMTests.get(CMTests.size()-1).questions.get(currentQuestionCounter).getOption3()));


        quizTextArea.setText(CMTests.get(CMTests.size()-1).questions.get(currentQuestionCounter).getQuestion());


    }
    int score = 0;
    public void nextQuestionBtn(ActionEvent actionEvent) {
        if(checkBx1.isSelected() || checkBx2.isSelected() || checkBx3.isSelected() || checkBx4.isSelected()){
            //process the answer
            //for each in order
            for (CheckBox c: order) {
                //if checked
                if (c.isSelected()) {
                    CMTests.get(CMTests.size()-1).questions.get(0).setStudentAns(Double.parseDouble(c.getText()));//check this parses correctly...
                    currentQuestionCounter++;
                    setUpQuestion();
                }
            }


            if (currentQuestionCounter == 10){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Results");
                alert.setHeaderText("You obtained a:");
                alert.setContentText(score + " / 10");
                alert.showAndWait();
            }
        }
        else{
            //alert the user to make a choice
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("No Answer Selected");
            alert.setContentText("An answer must selected to proceed");

            alert.showAndWait();
        }
    }
}

