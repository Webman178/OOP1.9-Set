import transport.*;
import transport.driver.Driver;
import transport.driver.LicenseB;

import java.util.*;


public class Main {
    public static void main(String[] args) {

//        Car lada = new Car("Lada", "Granta", "желтого", 170,
//                1.7, 2015, "России", "автомат", "седан",
//                "У745ВК078", 5, 3,80,"бензин");
//        lada.presentation();
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", "черный", 200,
//                3.8, 2020, "Герамания", "меаника", "купе",
//                "а432уц078", 3,8, 40, "дизель");
//        audi.presentation();
//        Car bmw = new Car("BMW", "Z8", "серый", 200,
//                3.0, 2021,"Германии", "автомат", "седан",
//                "а213вы178", 5, 4,29.90,"бензин");
//        bmw.presentation();
//        Car kia = new Car("Kia", "Sportage 4-го поколения", "красный",140,
//                2.4, 2018,"Южной Корее", "механика", "кроссовер",
//                "в321ук178", 5, 10,29.90,"бензин");
//        kia.presentation();
//        Car hyundai = new Car("Hyundai", "Avante", "оранжевый",160,1.6,
//                2016, "Южной Корее", "автомат",
//                "седан", "р989вы178",5,12,76.91,"электро");
//        hyundai.presentation();
//
//        System.out.println("---------------------------------------------------------------");
//
//        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
//                "белый", 301, 3500, 15, "Белорусский вокзал",
//                "станция Минск-Пассажирский", 11,55.321,"дизель");
//        System.out.println(lastochka);
//        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "Черный",
//                270, 1700, 12, "Ленинградский вокзал",
//                "станция Ленинград-Пассажирский", 8,99.101,"дизель");
//        System.out.println(leningrad);
//
//        System.out.println("---------------------------------------------------------------");
//
//        Bus volga = new Bus("Волга", "ВР-1", 2002, "Россия", "Белый", 50,
//                70.0122,"бензин");
//        Bus moskvich = new Bus("Москвич", "ПА-9", 2012, "Россия", "Черный",
//                45,32.5,"дизель");
//        Bus volvo = new Bus("Вольво", "НК-12", 2009, "Швеция", "Синий",
//                40,34,"бензин");
//        System.out.println(volga);
//        System.out.println(moskvich);
//        System.out.println(volvo);
//
//        moskvich.refill();

/*        ArrayList<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic("Васильев","Иван","ПутьТех"));
        mechanics.add(new Mechanic("Петров","Сергей","Старт"));
        mechanics.add(new Mechanic("Сидоров","Евгений", "Ласточка"));

        ArrayList<Mechanic> mechanics2 = new ArrayList<>();
        mechanics2.add(new Mechanic("Сергеев","Иван","Путь"));
        mechanics2.add(new Mechanic("Васильев","Сергей","Старт"));*/




/*        ArrayList<Transport> race = new ArrayList<>();
        Transport lada = new Car("Лада ", "Веста", 1.6);
        *//*Car kia = new Car("Киа ", "Сид", 1.8, TypeOfBody.HATCHBACK);
        Car ford = new Car("Форд ", "Фокус", 1.6, TypeOfBody.COUPE);
        Car chevrolet = new Car("Шевроле ", "Лачетии", 1.5, TypeOfBody.OFFROAD);*//*

        Transport bmw = new Truck("БМВ ", "Пегас", 4.6);
       *//* Truck volvo = new Truck("Волво ", "Империал", 5.0, Weight.N2);
        Truck kamaz = new Truck("Камаз ", "Столб", 4.0, Weight.N3);
        Truck hyundai = new Truck("Хендэ ", "Дракслер", 4.8, Weight.N2);*//*

        Transport toyota = new Bus("Тойота ", "Мэн", 3.6);
        *//*Bus volga = new Bus("Волга ", "ВР-1", 4.0, Capacity.LARGE);
        Bus moskvich = new Bus("Москвич ", "ПА-9", 3.5, Capacity.EXTRA_LARGE);
        Bus lendRover = new Bus("Ленд Ровер ", "НК-12", 4.6, Capacity.EXTRA_SMALL);*/


//        Map<Transport, ArrayList<Mechanic>> map =  new HashMap<>();
//        map.put(toyota, mechanics);
//        map.put(lada, mechanics2);
//        map.put(bmw, mechanics);
//        map.put(bmw, mechanics);
//
//        for (Map.Entry<Transport, ArrayList<Mechanic> >entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            for (Mechanic mech : entry.getValue()) {
//                System.out.print(mech + ", ");
//            }
//            System.out.println();
//        }

        Set<Driver> dr = new HashSet<>();
        dr.add(new LicenseB("Василий", 1));
        dr.add(new LicenseB("Алексей", 12));
        dr.add(new LicenseB("Петр", 5));
        dr.add(new LicenseB("Петр", 5));

        Iterator<Driver> drIterator = dr.iterator();
        while (drIterator.hasNext()) {
            System.out.println(drIterator.next());
        }

      /*  ivan.stopMoving(lada);
        vasya.refuel(hyundai);
        lesha.startMoving(toyota);
        ivan.printHomework(ford);


        kamaz.start();
        kamaz.finish();
        bmw.start();
        bmw.finish();

        volga.printBestLapTime();
        volvo.printMaximumSpeed();
        kia.getPitStop();*/


    }


}