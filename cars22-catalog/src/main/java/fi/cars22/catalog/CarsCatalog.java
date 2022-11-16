package fi.cars22.catalog;

import fi.cars22.vw.ID3;
import fi.cars22.vw.Touran;

public class CarsCatalog {
    public Car getID3() {
        return new ID3();
    }
    public Car getTouran() {
        return new Touran();
    }
}
