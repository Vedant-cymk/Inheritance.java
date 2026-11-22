import java.util.*;

class StudentTask implements Runnable {
    public void run() {
        System.out.println("Multithreading is running...");
    }
}

public class AdvancedJavaFeatures {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Vedant Sankhe");
        students.add("Rahul Patil");
        students.add("Amit Sharma");

        System.out.println("Student List:");

        for (String name : students) {
            System.out.println(name);
        }

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled: Division by zero");
        }

        StudentTask task = new StudentTask();
        Thread t = new Thread(task);
        t.start();
    }
}
