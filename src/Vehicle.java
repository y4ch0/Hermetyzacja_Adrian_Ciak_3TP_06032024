public class Vehicle {
    String brand;
    String model;
    int productionYear;
    int doorCount;
    int horsePower;
    private VIN vin;

    public Vehicle(String brand, String model, int productionYear, int doorCount, int horsePower, VIN vin) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.doorCount = doorCount;
        this.horsePower = horsePower;
        this.vin = vin;
    }
}
