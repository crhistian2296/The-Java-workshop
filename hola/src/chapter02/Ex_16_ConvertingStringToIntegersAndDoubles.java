package chapter02;

public class Ex_16_ConvertingStringToIntegersAndDoubles {
    //Command-line arguments appear in your Java programs as String values.
    public static void main(String[] args){

        //the firs command-line argument has to be a integer
        if(args.length > 0){
            int integer = Integer.parseInt(args[0]);
            System.out.println(integer);
        }

        //the second command-line argument has to be a double
        if(args.length > 1){
            double doubleValue = Double.parseDouble(args[1]);
            System.out.println(doubleValue );
        }
    }
}
