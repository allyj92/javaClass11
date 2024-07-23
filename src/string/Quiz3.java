package string;

public class Quiz3 {
    public static void main(String[] args) {

        int result1 = getCharCount("자바 프로그래밍  입문");
        int result2 = getCharCount("equals 메소드는 두 객체가 같은지 비교한다");

        System.out.println("공백 제외 글자수 : " + result1);
        System.out.println("공백 제외 글자수 : " + result2);


    }
    public static int getCharCount(String s) {
        int realLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                realLength++;
            }
        }
        return realLength;
    }
}



