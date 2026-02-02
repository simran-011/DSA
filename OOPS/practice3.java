import java.util.*;

class AnimalTracker {
    private String name;
    private int age;
    private int weight;
    private int zone;

    AnimalTracker(String name, int age, int weight, int zone) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.zone = zone;
    }

    public String getSpecies() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getZone() {
        return zone;
    }

    public String toString() {
        return "Animal[species=" + name + ", age=" + age + ", weight=" + weight + ", zone=" + zone + "]";
    }

}

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        List<String> l = new ArrayList<>();

        for (int i = 0; i < noOfTest; i++) {
            String sp = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            int zone = sc.nextInt();
            AnimalTracker a = new AnimalTracker(sp, age, weight, zone);
            String res = a.toString();
            l.add(res);

        }

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

    }
}
