package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String nameDriver;
    private boolean drivingLicence;
    private int experience;

    public Driver(String nameDriver,
                  boolean drivingLicence,
                  int experience) {
        this.nameDriver = nameDriver;
        this.drivingLicence = drivingLicence;
        this.experience = experience;
    }

    public Driver(String nameDriver,
                  int experience) {
        this.nameDriver = nameDriver;
        this.experience = experience;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving(T transport);

    public abstract void stopMoving(T transport);

    public abstract void refuel(T transport);

    public void printHomework(T transport) {
        System.out.println("Водитель " + nameDriver + " управляет автомобилем " + transport.getBrand()
                + " и будет участвовать в заезде");
    }
    @Override
    public String toString() {
        return "Водитель " + this.nameDriver + "(" + this.experience + ")";
    }

    @Override
    public int hashCode() {
        return this.nameDriver.hashCode() + this.experience;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Driver driver = (Driver) obj;
        return this.nameDriver.equals(driver.nameDriver) && this.experience == driver.experience;
    }
}

