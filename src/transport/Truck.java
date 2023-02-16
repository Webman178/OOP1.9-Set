package transport;

import transport.driver.LicenseC;

import java.util.ArrayList;

public class Truck extends Transport <Mechanic, LicenseC> implements Competing{
    private LicenseC driverC;
    public LicenseC getDriver() {
        return driverC;
    }

    @Override
    public void serDriver(LicenseC driverC) {
        this.driverC = driverC;
    }

    public void passDiagnostic() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " проходит диагностику");
    }
    private Weight weight;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LicenseC driverC) {
        super(brand, model, engineVolume);
        this.driverC = driverC;
    }
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LicenseC driverC,
                 ArrayList<Mechanic>mechanics) {
        super(brand, model, engineVolume,mechanics);
        this.driverC = driverC;
    }

    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("Грузовик "  + getBrand() + getModel() + " начал движение");
    }

    public void finish() {
        System.out.println("Грузовик "  + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Грузовик проходит точку пит-стопа");
    }

    @Override
    public int printBestLapTime() {
        return (int)(Math.random() * 14);
    }

    @Override
    public int printMaximumSpeed() {
        return (int) (Math.random() * 80);
    }

    @Override
    public void printType() {
            if (weight == null) {
                System.out.println("Данных по автомобилю недостаточно");
            } else {
                String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " ";
                String to = weight.getTo() == null ? "" : "до " + weight.getTo();
                System.out.println("Грузоподъемность грузовика - " + from + to);
            }
    }
}

