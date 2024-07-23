package object;

public class Ex2 {
    public static void main(String[] args) {

    }
}

class Student {
    int id; // 학번
    String name; // 학생의 이름

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // If the objects are identical, they are equal
        }
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return this.id == student.id;  // Compare ids for equality
        }
        return false;  // If obj is null or not an instance of Student
    }}