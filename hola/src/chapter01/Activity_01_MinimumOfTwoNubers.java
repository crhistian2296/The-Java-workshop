package chapter01;

import java.lang.Math.*;

import static java.lang.Math.min;

public class Activity_01_MinimumOfTwoNubers {
    public static void main(String[] args){
        double a = 3;   //fist number
        double b = 4;   //second number
        double m = 0;   //minimum, init with value 0

        //use of the method min imported from class Math
        String r = "The minimum of numbers: " + a + " and " + b + " is " + min(a,b);

        System.out.println(r);
    }
}
