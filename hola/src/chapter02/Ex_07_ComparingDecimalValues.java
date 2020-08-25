package chapter02;

import static java.lang.Math.abs;

public class Ex_07_ComparingDecimalValues {
    public static void main(String[] args){
        double a = .6 + .6 + .6 + .6 + .6 + .6;
        double b = .6 * 6;

        System.out.println("A is " + a);
        System.out.println("B is " + b);

        //chek if is equal
        if (a != b) {
            System.out.println("A is not equal B.");
        }

        //chek if is close enough
        if (abs(a-b) < .001){
            System.out.println("but A is close enough B");
        }
    }
}
