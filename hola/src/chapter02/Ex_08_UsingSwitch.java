package chapter02;

public class Ex_08_UsingSwitch {
    public static void main(String[] args){
        int season = 4;
        String message;

        switch (season){
            case 1: message = "Spring";
                break;
            case 2: message = "Summer";
                break;
            case 3: message = "Fall";
                break;
            case 4: message = "Winter";
                break;
            default:message = "That is not a season";
                break;
        }

        System.out.println(message);
    }
}
