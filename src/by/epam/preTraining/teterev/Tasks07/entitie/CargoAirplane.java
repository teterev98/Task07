package by.epam.preTraining.teterev.Tasks07.entitie;

import java.util.Objects;

public class CargoAirplane extends Plane{

    private int carryingCapacity;

    public CargoAirplane() {  }

    public CargoAirplane(String model, int numberOfCrewMember, int carryingCapacity) {
        super(model, numberOfCrewMember);
        this.carryingCapacity = carryingCapacity;
    }

    public CargoAirplane(Plane plane, int carryingCapacity) {
        super(plane);
        this.carryingCapacity = carryingCapacity;
    }
    public CargoAirplane(CargoAirplane cargoAirplane){
        super(cargoAirplane.getModel(), cargoAirplane.getNumberOfCrewMen());
        this.carryingCapacity = cargoAirplane.carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoAirplane)) return false;
        if (!super.equals(o)) return false;
        CargoAirplane that = (CargoAirplane) o;
        return carryingCapacity == that.carryingCapacity;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), carryingCapacity);
    }

    @Override
    public String toString() {
        return super.toString() + " Carrying capacity is " + carryingCapacity;
    }
}
