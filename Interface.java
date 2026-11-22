interface Printable {
    void print();
}

class Student implements Printable {
    public void print() {
        System.out.println("Student Name: Vedant Sankhe");
        System.out.println("PRN: 20250802408");
    }
}

public class Interface {
    public static void main(String[] args) {
        Student s = new Student();
        s.print();
    }
}
