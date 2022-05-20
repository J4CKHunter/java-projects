import animal.Bird;
import animal.Eagle;
import driver.Pilot;
import driver.UniversalDriver;
import garage.Hangar;
import garage.Harbour;
import vehicle.*;

public class Test {
    public static void main(String[] args) {
        SeaPlane seaPlane = new SeaPlane("Erdem's SeaPlane");

        Floatable floatable = seaPlane;
        Airplane airplane = seaPlane;
        AbstractVehicle abstractVehicle = seaPlane;
        Vehicle vehicle = seaPlane;
        Flyer flyer = seaPlane;
        Object object = seaPlane;

        Pilot pilot = new Pilot("erdem");
        pilot.drive(seaPlane);

        Hangar hangar = new Hangar("Tuzla Hangar-1");
        hangar.store(seaPlane);

        Harbour harbour = new Harbour("Tuzla Harbour");
        harbour.enter(seaPlane);

        UniversalDriver universalDriver = new UniversalDriver("chauffeur");
        universalDriver.drive(seaPlane);



    }
}
