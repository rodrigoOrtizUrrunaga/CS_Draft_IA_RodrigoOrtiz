package sample;

abstract class QuestionType { //abstract because this class will never be initiated alone.
    String Question;
    double ans;
    double Option1;
     double Option2;
     double Option3;

    private double studentAns;
    private boolean correctOrWrong;


    public String getQuestion() {return Question;}
    public double getAns() {return ans;}
    public double getOption1(){return Option1;}
    public double getOption2(){return Option2;}
    public double getOption3(){return Option3;}

    public void setStudentAns(double studentAns) {
        this.studentAns = studentAns;
        if (studentAns == ans){
            correctOrWrong=true;
        }else{
            correctOrWrong=false;
        }
    }
    }

