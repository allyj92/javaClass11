package wrapper;

import java.util.ArrayList;

public class Quiz3 {
    public static void main(String[] args) {
        ArrayList<Character> lists = new ArrayList<>();
        lists.add('a'); // -> list.add(new Character('a')) 으로 오토박싱됨
        lists.add('b');
        lists.add('c');
        lists.add('d');

        char list = lists.get(0); // = list.get(0).CharacterValue()

        for(char lst:lists){
            System.out.println(lst);
        }

        Integer i1 = Integer.valueOf(10); // 숫자,래퍼 객체 반환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 반환
        int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 반환

        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult); // 값이 크면 1, 같으면 0, 작으면 -1 반환


    }
}
