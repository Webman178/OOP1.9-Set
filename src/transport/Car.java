package transport;

import transport.driver.LicenseB;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car extends Transport <Mechanic, LicenseB>  implements Competing{
    private LicenseB driverB;
    public LicenseB getDriver() {
        return driverB;
    }

    @Override
    public void serDriver(LicenseB driverB) {
        this.driverB = driverB;

    }

    public void passDiagnostic() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " проходит диагностику");
    }
    private TypeOfBody typeOfBody;


    public Car(String brand,
               String model,
               double engineVolume,
               TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }
    public Car(String brand,
               String model,
               double engineVolume,
               LicenseB driverB) {
        super(brand, model, engineVolume);
        this.driverB=driverB;
    }
    public Car(String brand,
               String model,
               double engineVolume,
               ArrayList<Mechanic> mech) {
        super(brand, model, engineVolume, mech);
    }
    public Car(String brand,
               String model,
               double engineVolume,
               LicenseB driverB, ArrayList<Mechanic> mech) {
        super(brand, model, engineVolume,mech);
        this.driverB=driverB;
    }

    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }
//    private final String brand;
//    private final String model;
//    private double engineVolume;
//    private final int year;
//    private final String country;
//    private String transmission;
//    private final String bodyType;
//    private String registrationNumber;
//    private final int numberOfSeats;
//    private boolean signSummerTires;




//    public Car(String brand, String model, String colorBody, int maxSpeed, double engineVolume, int year,
//               String country, String transmission, String bodyType,
//               String registrationNumber, int numberOfSeats, int month, double fuelPercentage,String typeFuel) {
//        super(brand, model, year, country, colorBody, maxSpeed, fuelPercentage, typeFuel);
//        if (brand == null || brand.isEmpty() || brand.isBlank()) {
//            this.brand = "Информация не указана";
//        } else {
//            this.brand = brand;
//        }
//        if (engineVolume >=0) {
//            this.engineVolume = engineVolume;
//        } else {
//            this.engineVolume = 1.6;
//        }
//        this.model = model;
//        this.year = year;
//        this.country = country;
//        if (transmission == null || transmission.isBlank()) {
//            this.transmission = "Нет информации";
//        } else {
//            this.transmission = transmission;
//        }
//        if (bodyType == null || bodyType.isBlank()) {
//            this.bodyType = "Нет информации";
//        } else {
//            this.bodyType = bodyType;
//        }
//        this.registrationNumber = registrationNumber;
//        this.numberOfSeats = numberOfSeats;
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//            case 3:
//                this.signSummerTires = false;
//                break;
//            default:
//                this.signSummerTires = true;
//                break;
//        }
//    }

    static private boolean checkRegistrationNumber(String registrationNumber) { //х000хх000
        if (registrationNumber == null || registrationNumber.isBlank()) {
            return false;
        }
        registrationNumber = registrationNumber.trim().replaceAll("\\s+", "").toUpperCase();
        if (registrationNumber.length() != 9) {
            return false;
        }

        char[] charNumber = registrationNumber.toCharArray();

        boolean checkLetters = Character.UnicodeBlock.of(charNumber[0]).equals(Character.UnicodeBlock.CYRILLIC) &&
                Character.UnicodeBlock.of(charNumber[4]).equals(Character.UnicodeBlock.CYRILLIC) &&
                Character.UnicodeBlock.of(charNumber[5]).equals(Character.UnicodeBlock.CYRILLIC);
        boolean checkNumbers = Character.isDigit(charNumber[1]) && Character.isDigit(charNumber[2]) &&
                Character.isDigit(charNumber[3]) && Character.isDigit(charNumber[6]) &&
                Character.isDigit(charNumber[7]) && Character.isDigit(charNumber[8]); //123 876
        return checkNumbers && checkLetters;
    }


    public void start() {
        System.out.println("Машина "  + getBrand() + getModel() + " начал движение");
    }

    public void finish() {
        System.out.println("Машина "  + getBrand() + getModel() + " закончил движение");
    }


    @Override
    public void getPitStop() {
        System.out.println("Автомобиль проходит точку пит-стопа");
    }

    @Override
    public int printBestLapTime() {
        return (int)(Math.random() * 8);
    }

    @Override
    public int printMaximumSpeed() {
        return (int) (Math.random() * 180);
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по автомобилю недостаточно");
        } else {
            System.out.println("Тип автомобиля - " + typeOfBody);
        }
    }



    /*public Car(String brand, String model, int year, String country, String bodyType, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
    }*/





//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        this.engineVolume = engineVolume;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }
//
//    public boolean isSignSummerTires() {
//        return signSummerTires;
//    }
//
//    public void setSignSummerTires(boolean signSummerTires) {
//        this.signSummerTires = signSummerTires;
//    }
//
//    public void presentation() {
//        System.out.println(brand + " " + model + ", " + year + " года выпуска," + " сборка в " + country + ", "
//                + " объем двигателя — " + engineVolume + " л.," + " коробка передач - " + transmission
//                + ", тип кузова - " + bodyType + ", регестрационный номер - " + registrationNumber +
//                ", количество мест - " + numberOfSeats + ", резина - " + (signSummerTires?"летняя": "зимняя"));
//
//
//    }

    public static class Key {
        private boolean remoteRun;
        private boolean withoutKeyAccess;

        public Key(boolean remoteRun, boolean withoutKeyAccess) {
            this.remoteRun = remoteRun;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public class Insurance {
        private final LocalDate expireDate;
        private final int cost;
        private final String number;

        public Insurance(LocalDate expireDate, int cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if (cost <= 0) {
                cost = 10_000;
            }
            this.cost = cost;
            if (number == null || number.isEmpty()) {
                number = "XXXYYYXXX";
            }
            this.number = number;
        }

        public void printCheckExpired() {
            boolean expired = expireDate.isAfter(LocalDate.now());
            if (expired) {
                System.out.println("Нужно срочно поменять страховку");
            }
        }

        public void printCheckNumber() {
            boolean correct = number.length() == 9;
            if (!correct) {
                System.out.println("Номер страховки некорректный");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }
}
