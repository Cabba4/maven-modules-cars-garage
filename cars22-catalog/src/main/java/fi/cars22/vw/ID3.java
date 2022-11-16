package fi.cars22.vw;

import fi.cars22.catalog.Car;

public class ID3 extends Car {
    public ID3() {
        this.model = "Volkswagen ID3";
    }

    @Override
    public double getElectricConsumption() {
        return 0.0;
    }
    @Override
    public double getPetrolConsumption() {
        return 8.7;
    }
    @Override
    public String getPowerType() {
        return "petrol";
    }
    @Override
    public double getElectricRange() {
        return 0.0;
    }
    @Override
    public int getTankSize() {
        return 55;
    }
    @Override
    public int getTopSpeed() {
        return 210;
    }
    @Override
    public String getID() {
        return null;
    }
    @Override
    public int getNrPassengers() {
        return 7;
    }
    
}
