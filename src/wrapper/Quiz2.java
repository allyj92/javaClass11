package wrapper;

public class Quiz2 {
    public static void main(String[] args) {
//        int iNum = Integer.valueOf(10);
////        double dNum = Double.valueOf(1.123);
////        char cNum = Character.valueOf('C');
////        boolean bNum = Boolean.valueOf(true);
////
////        System.out.println(iNum);
////        System.out.println(dNum);
////        System.out.println(cNum);
////        System.out.println(bNum);

        // 숫자를 문자열로 변환하려면 "toString" 메소드를 사용해야함
        String str1 = Integer.toString(10); // 10 -> "10"

        String str2 = Double.toString(1.123); // 1.123 -> "1.123"

        String str3 = Character.toString('c'); // 'c' -> "c"

        String str4 = Boolean.toString(true); // true -> "true"


        String str5 = String.valueOf(10);

        String str6 = String.valueOf(1.123);

        String str7 = String.valueOf('c');

        String str8 = String.valueOf(true);
    }
}
