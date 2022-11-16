package fi.cars22.catalog;

public abstract class Car {

    private String id = "";
    protected String model = "";

    public abstract double getElectricConsumption();
    public abstract double getPetrolConsumption();
    public abstract String getPowerType();
    public abstract double getElectricRange();
    public abstract int getTankSize();
    public abstract int getTopSpeed();
    public abstract int getNrPassengers();

    public String getSummary() {
        String summary = model;
        if (! "".equals(id)) {
            summary += " - "+id;
        }
        return summary;
    }

    public void setId(String s) {
        this.id = s;
    }

    public String getID() {
        return this.id;
    }
}
