import com.entities.Ship;
import com.impl.ShipDaoImp;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ShipDaoImp pdi = new ShipDaoImp();
        Scanner scanner = new Scanner(System.in);




        //pdi.createShipTable();

        Ship ship1 = new Ship("B-2/3", "7-16","Chattanooga", "0700H-09-21-17", "2200H-09-21-17", "Taiwan", "Taiwan");
        Ship ship2 = new Ship("B-5", "26-33","VTB", "0700H-09-21-17", "2200H-09-29-17", "Vietnam", "TBA");
        Ship ship4 = new Ship("B-5", "26-33","Lorcon", "0700H-09-21-17", "2200H-09-29-17", "Vietnam", "TBA");
        //pdi.insert(ship4);
        //pdi.insert(ship1);
        //pdi.insert(ship2);

        /*
        Ship shipp = pdi.selectById(2);
        System.out.println(shipp.getBerthNumber() + " " + shipp.getBollardNumber() + " " + shipp.getId() + " " + shipp.getName() + " " + shipp.getETA()
                + " " + shipp.getETD() + " " + shipp.getLastPort() + " " + shipp.getNextPort());
        */

        //pdi.delete(1);

        Ship shipe  = new Ship("B-6", "35.5-44", "Lorcon", "0600H-09-21-17", "1800H-0921-17", "Manila", "Cagayan");
        //pdi.update(shipe, 5);
        /*
        System.out.println("Input data");
        System.out.println("Berth Number: ");
        String berth = scanner.next();
        System.out.println("Bollard Number: ");
        String bollard = scanner.next();
        System.out.println("Name of Vessel: ");
        String name = scanner.next();
        System.out.println("Estimated time of arrival: ");
        String eta = scanner.next();
        System.out.println("Estimated time of departure: ");
        String etd = scanner.next();
        System.out.println("Last Port: ");
        String lp = scanner.next();
        System.out.println("Next Port: ");
        String np = scanner.next();

        Ship ship3 = new Ship(berth, bollard, name, eta, etd, lp, np);
        pdi.insert(ship3);
        */


        //List<Ship> ships = pdi.selectAll();
        List<Ship> ships = pdi.selectByName("Lorcon");
        System.out.println();
        for (Ship ship: ships) {
            System.out.println(ship.getId() + ". " + ship.getBerthNumber() + " " + ship.getBollardNumber() + " " + ship.getName() + " "
                    + ship.getETA() + " " + ship.getETD() + " " + ship.getLastPort() + " " + ship.getNextPort());
        }


    }
}
