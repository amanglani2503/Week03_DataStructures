package day2stackqueuehashmap.stackandqueueproblems.circulartour;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Pump pumps[] = {new Pump(2, 2),
                new Pump(5, 4),
                new Pump(4, 3),
                new Pump(3, 2)};

        FindStart obj = new FindStart();
        int startingPoint = obj.findStartingPoint(pumps);

        if (startingPoint != -1) {
            System.out.println("The starting point is : " + startingPoint);
        }
        else{
            System.out.println("Cannot complete circular tour !!");
        }
    }
}