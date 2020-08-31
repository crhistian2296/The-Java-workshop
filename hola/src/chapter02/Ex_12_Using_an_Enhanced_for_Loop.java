package chapter02;

public class Ex_12_Using_an_Enhanced_for_Loop {
    public static void main(String[] args){
        char[] letters = {'A', 'B', 'C'};   //array of chars
        for(char letter : letters){         //for( (id without 's') : id)
            System.out.println(letter);     //print the id without 's'
        }
    }
}
