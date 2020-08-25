package chapter02;

public class Ex_09_AllowingCasesToFallThrough {
    public static void main(String[] args){
        int tempAdjustment = 0; //varianle init with 0
        String taste = "way too hot";

        System.out.println(taste);

        switch (taste){
            case "too cold": tempAdjustment+=1;     break;
            case "way too hot": tempAdjustment-=1;
            //because there isn't break tempAdjustment keep decreasing
            case "too hot": tempAdjustment-=1;      break;
            case "just right": //no adjustment
                break;
            default:                                break;
        }
        
        System.out.println("Adjust temperature = " + tempAdjustment);
    }
}
