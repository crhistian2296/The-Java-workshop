package chapter02;

public class Ex_14v2_UsingTheDoWhileLoop {
    public static void main(String[] args){
        int i = 0;
        do {
            System.out.println("Even: " + i);
            i += 2;
        }
        while(i < 10);
    }
}
