package chapter02;

public class Ex_10_UsingJava12SwitchStatements {
    public static void main(String[] args){
        //Forma de SE12
        String taste = "way too hot";

        System.out.println(taste);

        //Toda la expresion switch sirve para asignar un valor a tempAdjutment
        int tempAdjustment = switch (taste){
            case "too cold" -> 1;
            case "way too hot" -> -2;
            case "too hot" -> -1;
            case "just right" -> 0;
            default -> 0;
        };

        System.out.println("Adjust temperature = " + tempAdjustment);
    }
}
