package fi.cars22.vw;

import fi.cars22.catalog.Car;

public class ID3 extends Car {
    public ID3() {
        this.model = "Volkswagen ID3";
    }

    @Override
    public double getElectricConsumption() {
        return 0.157; // KWh/Km
    }
    @Override
    public double getPetrolConsumption() {
        return 0.0;
    }
    @Override
    public String getPowerType() {
        return "electric";
    }
    @Override
    public double getElectricRange() {
        return 330.0;
    }
    @Override
    public int getTankSize() {
        return 45000;
    }
    @Override
    public int getTopSpeed() {
        return 170;
    }
    @Override
    public int getNrPassengers() {
        return 5;
    }
    
}
