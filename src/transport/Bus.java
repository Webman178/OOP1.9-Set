package transport;

import transport.driver.LicenseD;

import java.util.ArrayList;

public class Bus extends Transport <Mechanic, LicenseD> implements Competing {
    private LicenseD driverD;
    public LicenseD getDriver() {
        return driverD;
    }

    @Override
    public void serDriver(LicenseD driverD) {
        this.driverD = driverD;
    }

    @Override
    public boolean isNeedDiagnostic() {
        return false;
    }

    public void passDiagnostic() {
        try {
            throw new TransportTypeException("Автобус " + getBrand() + " " + getModel() + " не может проходить диагностику");
        } catch (TransportTypeException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineVolume, LicenseD driverD) {
        super(brand, model, engineVolume);
        this.driverD = driverD;
    }
    public Bus(String brand, String model, double engineVolume, LicenseD driverD, ArrayList<Mechanic> mechanics) {
        super(brand, model, engineVolume,mechanics);
        this.driverD = driverD;
    }

    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void start() {
        System.out.println("Автобус "  + getBrand() + getModel() + " начал движение");
    }

    public void finish() {
        System.out.println("Автобус "  + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобус проходит точку пит-стопа");
    }

    @Override
    public int printBestLapTime() {
        return (int)(Math.random() * 10);
    }

    @Override
    public int printMaximumSpeed() {
        return (int) (Math.random() * 100);
    }



    @Override
    public void printType() {
            if (capacity == null) {
                System.out.println("Данных по автомобилю недостаточно");
            } else {
                System.out.println("Вместимость автобуса - " + capacity.getFrom() + " до " + capacity.getTo());
            }
        }


    @Override
    public String toString() {
        return super.toString();
    }
}

