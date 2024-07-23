package object;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("끝내시겠습니까? END :");
            String endString = sc.nextLine().toLowerCase();
            if ( endString.equals("end")){
                break;
            }
            if(endString.equalsIgnoreCase("end")){
                break;
            }
        }
    }
}
