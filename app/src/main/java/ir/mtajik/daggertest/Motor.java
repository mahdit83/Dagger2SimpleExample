package ir.mtajik.daggertest;



public class Motor {

    private Computer computer;
    private Radiator radiator;
    private String name;


    public Motor(String name, Computer computer ,Radiator radiator) {
        this.name = name;
        this.computer = computer;
        this.radiator = radiator;
    }

    public boolean startEngin() {
        if (computer != null && radiator != null) {
            return true;
        } else {
            return false;
        }
    }

    public Computer getComputer() {
        return computer;
    }


    public String getName() {
        return name;
    }

    public Radiator getRadiator() {
        return radiator;
    }
}
