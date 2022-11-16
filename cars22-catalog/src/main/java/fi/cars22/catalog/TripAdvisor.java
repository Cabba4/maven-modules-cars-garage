package fi.cars22.catalog;

import fi.cars22.vw.ID3;
import fi.cars22.vw.Touran;

public class TripAdvisor {
    private double petrolPrice = 0.0;
    private double chargePrice = 0.0;
    private double cost = 0.0;

    public void setPetrolPrice(double price){
        this.petrolPrice =  price;    
    }

    public void setChargePrice(double price){
        this.chargePrice = price;
    }

    public double calcCost(Car car, int dist){
        if(car.getPowerType() == "petrol" ){
            cost = car.getPetrolConsumption() * dist * this.petrolPrice;
        }
        else {
            cost = car.getElectricConsumption() * dist * this.chargePrice;
        }
        return cost;
    }


}
