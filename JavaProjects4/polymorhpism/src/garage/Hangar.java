package garage;

import vehicle.Airplane;

public class Hangar {
    protected String name;
    public Hangar(String name){this.name = name;}

    public void store(Airplane plane){
        System.out.println("Storing the airplane" + plane + " in " + name + " hangar.");
        plane.go();
        plane.takeOff();
        plane.land();
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "name='" + name + '\'' +
                '}';
    }
}
