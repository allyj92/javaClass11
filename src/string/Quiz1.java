package string;

public class Quiz1 {
    public static void main(String[] args) {
        String str1 = "a:b:c:d";
        String str2 ="안녕하세요 저는 둘리입니다.";

        System.out.println(str1.replace(':','#'));
        System.out.println(str2.indexOf("둘")); // "둘리"의 인덱스를 찾기
        System.out.println(str2.substring(9,11)); // 시작 위치, 마지막 위치

    }
}
