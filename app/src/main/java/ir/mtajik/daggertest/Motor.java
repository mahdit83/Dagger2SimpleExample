package ir.mtajik.daggertest;

public class Motor {

    //    @Inject
//    Computer computer;

    //    @Inject
//    Radiator radiator;

    Computer computer;
    Radiator radiator;
    String name;

//    public Motor(String name) {
//        this.name = name;
//    }

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
