package chapter02;

public class Ex_02_UsingJavaComparisonOperators {
    public static void main(String[] args){
        int maxDistance = 10;   //units: km
        int distanceToHome = 9;

        if (distanceToHome > maxDistance){
            System.out.println("Distance from the store to your home is");
            System.out.println(" more than " + maxDistance + "km away.");
            System.out.println("That is too far for free delivery.");
        }
        if (distanceToHome <= maxDistance){
            System.out.println("Distance from the store to your home is");
            System.out.println(" within " + maxDistance + "km away.");
            System.out.println("You get free delivery!!");
        }

    }
}
