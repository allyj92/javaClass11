package string;

import java.util.Locale;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        StringBuilder stringBuilder = new StringBuilder(str);
        str = stringBuilder.reverse().toString();
        System.out.println("Reversed string: " + str);
    }
}








