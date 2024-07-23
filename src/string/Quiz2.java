package string;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요 : ");
        String ifn = sc.next();

        String gender = ifn.substring(7,8);

       if(gender.equals("1") || gender.equals("3")){
           System.out.println("성별은 남자입니다");
       }else if (gender.equals("2") || gender.equals("4")) {
           System.out.println("성별은 여자입니다");
       }
    }
}
