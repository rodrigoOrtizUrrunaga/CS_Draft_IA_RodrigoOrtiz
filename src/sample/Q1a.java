package sample;
import java.util.Random;

public class Q1a {
    private int mass;
    private int revs;
    private int time;
    private int radius;
    public int ans;

    public Q1a() {
        // This constructor has one parameter, name.
        System.out.println("Question 1 - Circular Motion");
    }

    public int getMass( ) {
        System.out.println("Mass = " + mass + " kg");
        return mass;
    }
    public int getRevs( ) {
        System.out.println("Revolutions = " + revs + " revolutions");
        return revs;
    }
    public int getTime( ) {
        System.out.println("Time = " + time + " s");
        return time;
    }
    public int getRadius( ) {
        System.out.println("Radius = " + radius + " m");
        return radius;
    }
    public int getAns( ) {
        System.out.println("Ans = " + ans + " N");
        return ans;
    }


    public void setMass( int ballMass ) {
        mass = ballMass;
    }
    public void setAns(int ballAns){
        ans = ballAns;
    }
    public void setRevs(int ballRevs){
        revs = ballRevs;
    }
    public void setTime(int ballTime){
        time = ballTime;
    }
    public void setRadius(int ballRadius){
        radius = ballRadius;
    }

    public static void createQ1a(String []args) {
        /* Object creation */

        Q1a Q1 = new Q1a();

        /* Call class method to set puppy's age */
        Random value_mass = new Random();
        int mass = value_mass.nextInt(10) + 1;
        Q1.setMass(mass);

        Random value_revs = new Random();
        int revs = value_revs.nextInt(20) + 1;
        Q1.setRevs(revs);

        Random value_time = new Random();
        int time = value_time.nextInt(50) + 9;
        Q1.setTime(time);

        Random value_radius = new Random();
        int radius = value_radius.nextInt(10) + 1;
        Q1.setRadius(radius);

        double force = (4*(Math.PI* Math.PI)*mass*radius) / (((double)time/(double)revs)*((double)time/(double)revs));
        int ans = (int) Math.round(force);
        Q1.setAns(ans);

        /* Call another class method to get information */
        Q1.getMass( );
        Q1.getRevs( );
        Q1.getTime( );
        Q1.getRadius( );
        Q1.getAns( );
    }
}
