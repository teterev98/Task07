package entities;

public class AirPlane extends Vehicle {
    private String serialNumber;

    public AirPlane(){

    }
    public AirPlane(String model, int numberOfSeats, String serialNumber){
        super(model, numberOfSeats);
        this.serialNumber = serialNumber;
    }

    public AirPlane(AirPlane airPlane){
        super(airPlane);
        this.serialNumber = airPlane.serialNumber;
    }

    public String getSerialNumber(AirPlane airPlane){
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        AirPlane other = (AirPlane) obj;
        if (serialNumber != other.serialNumber)
            return false;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString() + "Serial number Of airplane is " + serialNumber;
    }
}
