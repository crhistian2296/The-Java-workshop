package chapter02;

public class Ex_03_Implementing_a_Nested_If_Statement {
    public static void main(String[] args){
        int speed = 75; //units: km
        int maxSpeed = 60;
        int speedForFine = 70;

        //nested if that determinate speeding
        if (speed >= maxSpeed){
            System.out.println("You are over the speed limit!");
            if (speed >= speedForFine){
                System.out.println("You are eligible for a fine, dirty bastard!! >:v");
            }
            else
                System.out.println("");
        }
    }
}
