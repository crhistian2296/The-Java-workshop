package chapter02;

public class Ex_04_Using_if_AndElseStatements {
    public static void main(String[] args){
        int noDiscount = 0;
        int mediumDiscount = 10;    //%
        int largeDiscount = 15;

        int mediumThreshold = 5;
        int largeThreshold = 50;    //kg
        int purchaseAmount = 40;

        System.out.println(" You order " + purchaseAmount + "kg of coffe so");

        if (purchaseAmount >= largeThreshold){
            System.out.println("you get discount of " + largeDiscount + "%");
        }
        else if (purchaseAmount >= mediumThreshold){
            System.out.println("you get a discount of " + mediumDiscount + "%");
        }
        else{
            System.out.println("sorry you get a discount of " + noDiscount + "%");
        }


    }
}
