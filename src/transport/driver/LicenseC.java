package transport.driver;

import transport.Truck;

public class LicenseC extends Driver<Truck>{

    public LicenseC(String nameDriver,
                    boolean drivingLicence,
                    int experience) {
        super(nameDriver, drivingLicence, experience);
    }

    public LicenseC(String nameDriver,
                    int experience) {
        super(nameDriver, experience);
    }

    @Override
    public void startMoving(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMoving(Truck transport) {
        transport.finish();
    }

    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " заправляет грузовик " +
                transport.getBrand() + transport.getModel());
    }
}
