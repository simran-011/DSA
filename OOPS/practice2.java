import java.util.Scanner;

class DroneConfig {
    private String modelCode;
    private int versionNNumber;
    private String batteryType;
    private String modules[];

    DroneConfig() {
        this.modelCode = "UNASSIGNED";
        this.versionNNumber = 0;
        this.batteryType = "UNKNOWN";
        this.modules = new String[5];

    }

    DroneConfig(int vNo, String batteryType) {
        this.versionNNumber = vNo;
        this.batteryType = batteryType;
    }

    DroneConfig(String modelCode, int vNo, String batterytype, String[] modules) {
        this.modelCode = modelCode;
        this.versionNNumber = vNo;
        this.batteryType = batterytype;
        this.modules = modules;

    }

    public void updateModule(String propeller) {
        this.modules[1] = propeller;
    }

    public void updateModule(String camera, String gps) {
        this.modules[0] = camera;
        this.modules[2] = gps;
    }

    public void updateModule(String sensor, String frame, String camera) {
        this.modules[4] = sensor;
        this.modules[3] = frame;
        this.modules[0] = camera;
    }

    public String toString() {
        return "DroneConfig[Model=" + modelCode + "Modules=[" + modules[0] + "," + modules[1] + "," + modules[2] + ","
                + modules[3] + "," + modules[4] + "]]";
    }
}

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contructorChoice = sc.nextInt();
        int updateModuleChoice = sc.nextInt();
        DroneConfig dC = null;

        if (contructorChoice == 0) {
            dC = new DroneConfig();

        } else if (contructorChoice == 2) {
            int vNo = sc.nextInt();
            String batteryType = sc.next();
            dC = new DroneConfig(vNo, batteryType);
        } else if (contructorChoice == 4) {
            String modelCode = sc.next();
            int versionNNumber = sc.nextInt();
            String batteryType = sc.next();
            String mods[] = new String[5];
            for (int i = 0; i < 5; i++) {
                mods[i] = sc.next();
            }
            dC = new DroneConfig(modelCode, versionNNumber, batteryType, mods);

        }

        if (updateModuleChoice == 1) {
            String propeller = sc.next();
            dC.updateModule(propeller);
        } else if (updateModuleChoice == 2) {
            String camera = sc.next();
            String gps = sc.next();
            dC.updateModule(camera, gps);
        } else if (updateModuleChoice == 3) {
            String sensor = sc.next();
            String frame = sc.next();
            String camera = sc.next();
            dC.updateModule(sensor, frame, camera);
        }

        System.out.println(dC);
    }
}
