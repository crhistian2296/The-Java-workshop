package chapter02;

public class Ex_01_Creating_a_BasicIfStatement {
    public static void main(String[] args){
        boolean happy = true;
        boolean sad = false;

        if (happy){
            System.out.println("I am happy");
        }
        if (sad){
            System.out.println("I am happy");   //Este no se vera
        }
    }
}
