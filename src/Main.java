import transport.*;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.*;

public class Main {

    public static void separator() {
        System.out.println("========================");
    }

    public static void separator1() {
        System.out.println();
    }

    public static void separator2(int issue, int task) {
        System.out.println();
        System.out.println("Задание " + issue + ", " + "Задание " + task + ".");
        System.out.println();
    }

    public static void main(String[] args) {


        Bus volgaBus = new Bus("VolgaBus", "Ситиритм 12 GLF", 6.87, Capacity.LARGE);
//        System.out.println(volgaBus);

        Bus liaz = new Bus("Лиаз", "ЛИАЗ-5292 РЕСТАЙЛИНГ", 6.871, Capacity.AVERAGE);
//        System.out.println(liaz);

        Bus kavz = new Bus("КАВЗ", "КАВЗ-4270", 6.7, Capacity.SMALL);
//        System.out.println(kavz);

        Bus paz = new Bus("ПАЗ", "ВЕКТОР NEXT", 6.7, Capacity.SMALL);
//        System.out.println(paz);
//
//
        Driver<Bus> vasya = new DriverD("Василий", true, 11, "D");
        Driver<Bus> vasya1 = new DriverD("Василий", true, 11, "D");
//
//        separator1();
//        vasya.driverInfo(volgaBus);
//        separator1();
//
//        volgaBus.pitStop();
//        volgaBus.bestLapTime();
//        volgaBus.maxSpeed();
//        separator();
//        separator1();
//
//
        Car kia = new Car("Kia", "Kia Sportage 4-го поколения", 2.4, BodyType.SEDAN);
//        System.out.println(kia);

        Car lada = new Car("Lada", "Lada Granta", -1.7, BodyType.SEDAN);
//        System.out.println(lada);

        Car audi = new Car("Audi", "Audi A8 50 L TDI quattro", 3.0, BodyType.SEDAN);
//        System.out.println(audi);

        Car hyundai = new Car("Hyundai", "Hyundai Avante", 1.6, BodyType.SEDAN);
//        System.out.println(hyundai);
//
//
        Driver<Car> alex = new DriverB("Александр", true, 12, "B");
        Driver<Car> alex1 = new DriverB("Александр", true, 12, "B");
//
//        separator1();
//        alex.driverInfo(lada);
//        separator1();
//
//        lada.pitStop();
//        lada.bestLapTime();
//        lada.maxSpeed();
//        separator();
//        separator1();
//
        Truck ural = new Truck("УРАЛ", "УРАЛ NEXT44202-5311", 6.65, CargoCapacity.N2);
//        System.out.println(ural);

        Truck kamaz = new Truck("КАМАЗ", "KAMAZ-5490", 6.65, CargoCapacity.N2);
//        System.out.println(kamaz);

        Truck gaz = new Truck("ГАЗ", "Валдай NEXT", 2.8, CargoCapacity.N1);
//        System.out.println(gaz);

        Truck tonar = new Truck("Тонар", "Тонар-7507", 15, CargoCapacity.N3);
//        System.out.println(tonar);
//
//
        Driver<Truck> petr = new DriverC("Петр", true, 14, "C");
        Driver<Truck> petr1 = new DriverC("Петр", true, 14, "C");
//
//        separator1();
//        petr.driverInfo(kamaz);
//        separator1();
//
//        kamaz.pitStop();
//        kamaz.bestLapTime();
//        kamaz.maxSpeed();
//        separator();
//
//
//        service(kamaz, ural, lada, volgaBus);
//        separator();
//
//        Sponsor gazprom = new Sponsor("Газпром", 1_300_000);
//        Sponsor gazprom1 = new Sponsor("Газпром", 1_300_000);
//        Sponsor severStal = new Sponsor("Север сталь", 1_200_000);
//        Sponsor severStal1 = new Sponsor("Север сталь", 1_200_000);
//        Sponsor sber = new Sponsor("Сбербанк", 1_100_000);
//        Sponsor sber1 = new Sponsor("Сбербанк", 1_100_000);
//
//
//        Mechanic<Car> evj = new Mechanic<>("Евгений", "Савушкин", "Kia");
//        Mechanic<Car> evj1 = new Mechanic<>("Евгений", "Савушкин", "Kia");
//        lada.addDriver(new DriverB("Федор", true, 11, "B"));
//        lada.addMechanic(evj);
//        lada.addSponsor(gazprom, severStal);
//
//
//        Mechanic<Truck> petya = new Mechanic<>("Петр", "Савушкин", "Камаз");
//        Mechanic<Truck> petya1 = new Mechanic<>("Петр", "Савушкин", "Камаз");
//        kamaz.addDriver(new DriverC("Максим", true, 9, "С"));
//        kamaz.addMechanic(petya);
//        kamaz.addSponsor(sber, severStal);
//
//
//        Mechanic<Car> misha = new Mechanic<>("Михаил", "Савушкин", "Kia");
//        Mechanic<Car> misha1 = new Mechanic<>("Михаил", "Савушкин", "Kia");
//        volgaBus.addDriver(new DriverD("Иван", true, 8, "D"));
//        volgaBus.addMechanic(misha);
//        volgaBus.addSponsor(gazprom, sber);


//        Set<Transport> transports = Set.of(
//                lada,
//                kamaz,
//                volgaBus);
//
//
//        for (Transport transport : transports) {
//            printInfo(transport);
//        }
//        separator();
//
//        ServiceStation station = new ServiceStation();
//
//        station.addCar(lada);
//        station.addCar(kia);
//        station.addCar(audi);
//        station.serviceAuto();
//
//        separator1();
//
//        station.addTruck(kamaz);
//        station.addTruck(tonar);
//        station.addTruck(ural);
//        station.serviceAuto();

//        separator();
//
        separator2(1,1);

        Set<Driver> drivers = new HashSet<>();
        drivers.add(petr);
        drivers.add(petr);
        drivers.add(petr1);
        drivers.add(petr1);
        drivers.add(alex);
        drivers.add(alex);
        drivers.add(alex1);
        drivers.add(alex1);
        drivers.add(vasya);
        drivers.add(vasya);
        drivers.add(vasya1);
        drivers.add(vasya1);

        for (Driver driver : drivers) {
            printInfoDriver(driver);
        }
        separator();
//
//        Set<Mechanic> mechanics = new HashSet<>();
//        mechanics.add(evj);
//        mechanics.add(evj);
//        mechanics.add(misha);
//        mechanics.add(misha);
//        mechanics.add(petya);
//        mechanics.add(petya);
//
//        for (Mechanic mechanic : mechanics) {
//            printInfoMechanic(mechanic);
//        }
//
//        separator1();
//
//        lada.addMechanic(petya);
//        lada.addMechanic(petya1);
//        kamaz.addMechanic(evj);
//        kamaz.addMechanic(evj1);
//        volgaBus.addMechanic(misha);
//        volgaBus.addMechanic(misha1);
//
//        lada.addDriver(alex);
//        lada.addDriver(alex1);
//        kamaz.addDriver(petr);
//        kamaz.addDriver(petr1);
//        volgaBus.addDriver(vasya);
//        volgaBus.addDriver(vasya1);
//
//        lada.addSponsor(severStal);
//        lada.addSponsor(severStal1);
//        kamaz.addSponsor(gazprom);
//        kamaz.addSponsor(gazprom1);
//        volgaBus.addSponsor(sber);
//        volgaBus.addSponsor(sber1);
//
//        Set<Transport> transports = Set.of(
//                lada,
//                kamaz,
//                volgaBus);
//
//        for (Transport transport : transports) {
//            printInfo(transport);
//        }
//
//        Set<Sponsor> sponsors = new HashSet<>();
//        sponsors.add(sber);
//        sponsors.add(sber);
//        sponsors.add(severStal);
//        sponsors.add(severStal);
//        sponsors.add(gazprom);
//        sponsors.add(gazprom);
//
//        for (Sponsor sponsor : sponsors) {
//            printInfoSponsor(sponsor);
//        }
//
//        separator1();
//
//        Set<Transport> transports1 = new HashSet<>();
//        transports1.add(audi);
//        transports1.add(audi);
//        transports1.add(lada);
//        transports1.add(lada);
//        transports1.add(ural);
//        transports1.add(ural);
//
//        for (Transport transport : transports1) {
//            printInfoTransport(transport);
//        }
//        separator();


    }


    public static void printInfoDriver(Driver driver) {
        System.out.println(driver);
    }

    public static void printInfoMechanic(Mechanic mechanic) {
        System.out.println(mechanic);
    }

    public static void printInfoSponsor(Sponsor sponsor) {
        System.out.println(sponsor);
    }

    public static void printInfoTransport(Transport transport) {
        System.out.println(transport);
    }


    public static void printInfo(Transport transport) {

        System.out.println("Тип трнаспорта " + transport.getBrand() + " " + transport.getModel());
        System.out.println("водитель:" + transport.getDrivers());
        System.out.println("спонсор:" + transport.getSponsors());
        System.out.println("механик:" + transport.getMechanics() + "\n");
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.diagnostic()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}