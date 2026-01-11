import java.util.Scanner;

class Sensor {
    private String location;
    private double temperature;
    private double pressure;
    private boolean isFaulty;

    Sensor() {
        this.location = "UNKNOWN";
        this.temperature = 0.0;
        this.pressure = 0.0;
        this.isFaulty = false;
    }

    Sensor(String location, double temp) {
        this.location = location;
        this.temperature = temp;
        this.pressure = 1.0;
        this.isFaulty = false;
    }

    Sensor(String location, double temp, double pressure, boolean isFaulty) {
        this.location = location;
        this.temperature = temp;
        this.pressure = pressure;
        this.isFaulty = isFaulty;
    }

    public void updateTemp(double t) {
        this.temperature = t;
    }

    public void updatePressure(double p) {
        this.pressure = p;
    }

    public void markFaulty(boolean isFaulty) {
        this.isFaulty = isFaulty;
    }

    public String toString() {
        return "Sensor[Location=" + location + ",Temp=" + temperature + ",Pressure=" + pressure + ",Fault=" + isFaulty;
    }
}

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dummy = sc.nextInt();
        int choice = sc.nextInt();
        Sensor s = null;

        if (choice == 1) {
            s = new Sensor();

        } else if (choice == 2) {
            String l = sc.next();
            double temp = sc.nextDouble();

            s = new Sensor(l, temp);
        } else if (choice == 3) {
            String loc = sc.next();
            double temp = sc.nextDouble();
            double pres = sc.nextDouble();
            boolean fault = sc.nextBoolean();
            s = new Sensor(loc, temp, pres, fault);
        }

        int op = sc.nextInt();
        switch (op) {
            case 1:
                double t = sc.nextDouble();
                s.updateTemp(t);
                break;
            case 2:
                double p = sc.nextDouble();
                s.updatePressure(p);
                break;
            case 3:
                boolean f = sc.nextBoolean();
                s.markFaulty(f);
                break;
        }

        System.out.println(s.toString());

    }
}
