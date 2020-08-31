package chapter02;

public class Ex_06_UsingTheTernaryOperator {
    public static void main(String[] args){
        int height = 117;   //cm
        int minHeight = 125;

        String result;  //unassigned variable

        //printing height input
        System.out.println("You are " + height + " cm tall");

        //if (true) ==> result = first statement / (false) ==> result = second statement
        result = (height > minHeight) ? "You are allowed on the ride" : "Sorry, you do not meet the height requirements";
        System.out.println(result);
    }
}
