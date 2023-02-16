package transport.driver;

import transport.Bus;

public class LicenseD extends Driver<Bus>{

    public LicenseD(String nameDriver,
                    boolean drivingLicence,
                    int experience) {
        super(nameDriver, drivingLicence, experience);
    }

    public LicenseD(String nameDriver,
                    int experience) {
        super(nameDriver, experience);
    }

    @Override
    public void startMoving(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMoving(Bus transport) {
        transport.finish();
    }

    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " заправляет автобус " +
                transport.getBrand() + transport.getModel());
    }
}
