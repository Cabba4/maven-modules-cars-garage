package fi.cars22.app;

import fi.cars22.catalog.CarsCatalog;
import fi.cars22.garage.Garage;

public class App {

    public static void main(String[] args) {
        // Requirements:
        // Try out driving different distances with different cars:
        // * VW ID3 electric car (range: 350 km / 18 kW/100km)
        // * VW Touran gasoline car (range: 800 km / 8l/100km)
        // * Gas cost: 2.2 eur / l
        // * El cost: 15 cnt/kWh

        /*
        In my garage I have
        - 1 VW touran
        - 1 ID3
        I want to drive from Tampere to Rovaniemi.
        Want to know cost & duration.
         */

        CarsCatalog catalog = new CarsCatalog();
        Garage myGarage = new Garage();

        myGarage.addCar("kirppu", catalog.getID3());
        myGarage.addCar("laiva", catalog.getTouran());

        System.out.println(myGarage.garageShowcase());

    }
}
