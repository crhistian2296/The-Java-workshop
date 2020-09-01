package chapter02;

public class Ex_15_Testing_Command_LineArguments {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println("argument #" + (i+1) + ": " + args[i]  );
        }
    }
}
