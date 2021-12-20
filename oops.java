// class Pen {
//     String color;
//     String type; // ball,gel

//     public void write() {
//         System.out.println("Writing something...");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }
// }

// class Student {
//     String name;
//     int age;

//     public void printInfo(String name) {
//         System.out.println(name);
//     }

//     public void printInfo(int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println(name + " " + age);
//     }

//     // Student(String name, int age) {
//     // this.name = name;
//     // this.age = age;
//     // }

// }

// Inheritance

// class shape {
//     String color;
// }

// class Triangle extends shape {

// }

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

public class oops {
    public static void main(String[] args) {
        // Objects From Pen class
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ball";

        // pen1.printColor();
        // pen2.printColor();

        // Objects From Student class

        // Student s1 = new Student();
        // s1.name = "Spider";
        // s1.age = 21;
        // s1.printInfo(s1.age);

        // Inheritance Objects

        // Triangle t1 = new Triangle();
        // t1.color = "red";
        // System.out.println(t1.color);

    }

}