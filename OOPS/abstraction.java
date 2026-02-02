
public class abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.walk();
        // h.eat();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        Mustang m = new Mustang();

    }
}

abstract class Animal {
    Animal() {
        System.out.println("animal constructor");
    }

    String color;

    void eat() {
        System.out.println("animal eat");
    }

    // Animal() {
    // color = "brown";
    // }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("horse constructor");
    }

    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("horse walks on 4 legs");
    }

    void eat() {
        System.out.println("horse eats");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walk on 2 legs");
    }
}
