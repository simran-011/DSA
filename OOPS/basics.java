
public class basics {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("simran");
        student s3 = new student(19);
        s1.password = "xyz";
        // this will give us an error becz const with both parameters is not defined
        // student s4 = new student("simran", 19);
        s1.marks[0] = 23;
        s1.marks[1] = 56;
        s1.marks[2] = 100;
        student s4 = new student(s1);
        s4.password = "abcd";
        // when the marks of s1 has changed then s4 also has taken that change(shallow
        // copy)
        s1.marks[2] = 98;
        // student(student) // copy constructor which is not defined
        // s4.password = "xyz";
        // System.out.println("s4 password: " + s4.password);
        // System.out.println("s1 password: " + s1.password);
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }

    }
}

class student {
    String name;
    int age;
    String password;
    int marks[];

    // if this const is commentted out then the default will also not called up...
    student() {
        marks = new int[3];
        System.out.println("the constructor has been called");
    }

    student(String name) {
        marks = new int[3];
        this.name = name;

    }

    student(int age) {
        marks = new int[3];
        this.age = age;
    }

    // object as a parameter inside a constructor
    // shallow copying(by ref)
    // student(student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.age = s1.age;
    // this.password = s1.password;
    // this.marks = s1.marks;
    // }

    // deep copy(by value)
    student(student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < 3; i++) {
            // actual copy of an array in the copied constructor
            this.marks[i] = s1.marks[i];
        }
    }
}
