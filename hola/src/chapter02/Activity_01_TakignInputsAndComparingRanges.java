package chapter02;

public class Activity_01_TakignInputsAndComparingRanges {
    public static void main(String[] args){
        //Systole / diastole command-line input
        int systole= Integer.parseInt(args[0]);
        int diastole = Integer.parseInt(args[1]);

        //if the number or arguments doesn't match
        while ((args.length != 2)){
            System.err.println("\nInput error. Please introduce the input data this way: systole_value diastole_value\n");
            break;
        }
        if (args.length == 2){
            //Program info

            //systole
            if ((systole < 90) && (systole > 0)){
                System.out.println("\n-Low systolic pressure");
            }
            else if ((systole >= 90) && (systole <= 120)){
                System.out.println("\n-Ideal systolic pressure");
            }
            else if ((systole > 120) && (systole <= 140)){
                System.out.println("\n-Pre-high systolic pressure");
            }
            else if (systole > 140){
                System.out.println("\n-High systolic pressure");
            }

            //diastole
            if ((diastole < 60) && (diastole > 0)){
                System.out.println("-Low diastolic pressure");
            }
            else if ((diastole >= 60) && (diastole <= 80)){
                System.out.println("-Ideal diastolic pressure");
            }
            else if ((diastole > 80) && (diastole <= 90)){
                System.out.println("-Pre-high diastolic pressure");
            }
            else if (diastole > 90){
                System.out.println("-High diastolic pressure");
            }
            else
                System.out.println("=> You are not live son :v");

            //report
            System.out.println(systole + "/" + diastole + "\n");

        }
    }
}
