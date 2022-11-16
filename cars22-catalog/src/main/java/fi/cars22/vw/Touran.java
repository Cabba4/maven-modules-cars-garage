package fi.cars22.vw;
import fi.cars22.catalog.Car;

public class Touran extends Car {

    public Touran() {
        this.model = "Volkswagen Touran";
    }

    @Override
    public double getElectricConsumption() {
        return 0.0;
    }
    @Override
    public double getPetrolConsumption() {
        return 0.087;
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
    public int getNrPassengers() {
        return 7;
    }
}
