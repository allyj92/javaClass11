package wrapper;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Quiz4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        int num1 = parseInt(sc.nextLine());

        System.out.print("두 번째 수 : ");
        int num2 = parseInt(sc.nextLine());

        int sum = num1 + num2;

        System.out.print("두 수의 합 : ");
        System.out.println(sum);

        System.out.println(Integer.sum(num1,num2));
    }
}
