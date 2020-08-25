package chapter02;

public class Ex_05_UsingLogicalOperators_to_CreateComplexConditionals {
    public static void main(String[] args){
        int age = 60;
        int bpm = 150;

        System.out.println("You are " + age + " years old and");
        System.out.println("your heart rate is " + bpm + " bpm");

        if (age == 30){
            if ((bpm <= 162) && (bpm >= 95 )){
                System.out.println("your heart rate is normal.");
            }
            else if (bpm > 162){
                System.out.println("your heart rate is too high.");
            }
            else{
                System.out.println("your heart rate is too low.");
            }
        }
        else if (age == 60){
            if ((bpm <= 136) && (bpm >= 80 )){
                System.out.println("your heart rate is normal.");
            }
            else if (bpm > 136){
                System.out.println("your heart rate is too high.");
            }
            else{
                System.out.println("your heart rate is too low.");
            }
        }
    }
}
