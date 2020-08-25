package chapter01;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Ex_04_Solving_a_SimpleTrigonometricProblem {
    public static void main (String[] args){
        double a = 3;   //first side of the triangle
        double b = 4;   //second side of the triangle
        double h = 0;   //hypotenuse, init with value 0

        //equations to solve the hypotenuse
        //h = sqrt((a*a) + (b*b));
        h = sqrt(pow(a,2) + pow(b,2));
        System.out.println("The hypotenuse is = " + h);
    }
}
