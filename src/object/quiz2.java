package object;


public class quiz2 {
    public static void main(String[] args) {
        Object object = new Student(1,"둘리");

        // 다운캐스팅 진행
        if(object instanceof Student){
           Student student = (Student) object;
           System.out.println("학번 : " + student.id);
           System.out.println("이름 : " + student.name);

           // 객체 정보  + obj 정보
        }

    }
}


