package fi.cars22.garage;

import fi.cars22.catalog.Car;

import java.util.HashMap;

public class Garage {
    private HashMap<String,Car> garageCars = new HashMap<String,Car>();

    public Garage() {

    }

    public void addCar(String nickname, Car car) {
        garageCars.put(nickname, car);
    }

    public String garageShowcase() {
        String ret = "";

        for (String nick: garageCars.keySet()) {
            ret += " * " + nick + ": " + garageCars.get(nick).getSummary() + "\n";
        }
        return ret;

    }

    




}
