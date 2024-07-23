package object;

public class quiz3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이","진돗개");
        System.out.println(dog); // dig.toString()과 같음
    }
}
class Dog{
    String name;
    String type;

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return type+" "+name;
    }
}
