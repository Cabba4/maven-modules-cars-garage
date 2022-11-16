package fi.cars22.catalog;

class CarsCatalogTest {

    CarsCatalog catalog;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        catalog = new CarsCatalog();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getID3() {
        System.out.println("Running tests");

        Car car = catalog.getID3();
        System.out.println(" * " + car.getSummary());

        Car touran = catalog.getTouran();
        touran.setId("ABC-456");
        System.out.println(" * " + touran.getSummary());

    }
}