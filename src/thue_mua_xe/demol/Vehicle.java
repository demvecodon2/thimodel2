package thue_mua_xe.demol;

public class Vehicle {
    private String information;
    private double value;
    private double engineCapacity;

    public Vehicle(String information, double value, double engineCapacity) {
        this.information = information;
        this.value = value;
        this.engineCapacity = engineCapacity;
    }


    public String getInformation() {
        return information;
    }

    public double getValue() {
        return value;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public double calculateTax() {
        if (engineCapacity < 100) {
            return value * 0.01;
        } else if (engineCapacity <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }
}
