package chapter02;

public class Ex_13_UsingBreakAndContinue {
    public static void main(String[] args){
        String[] letters = {"A", "B", "C", "D", "E"};
        for(String letter : letters){
            if(letter.equals("B")){
                continue;   //jump to the next iteration
            }

            System.out.println(letter);

            if(letter.equals("D")){
                break;  //break the for loop
            }
        }
    }
}
