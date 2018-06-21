package by.epam.preTraining.teterev.Tasks07.entitie;

import java.util.Objects;

public class Airliner  extends Plane implements Passengerable{

    private int passengersCapacity;
    private double priceOfTicket;


    public Airliner(){

    }

    public Airliner(String model, int passengersCapacity, double price, int numberOfSeats) {
        super(model, passengersCapacity);
        this.priceOfTicket = price;
        this.passengersCapacity = numberOfSeats;
    }

    public Airliner(String model, int numberOfCrewMember, int passengersCapacity, double priceOfTicket) {
        super(model, numberOfCrewMember);
        this.passengersCapacity = passengersCapacity;
        this.priceOfTicket = priceOfTicket;
    }

    public Airliner(Airliner airliner){
        super(airliner.getModel(), airliner.getNumberOfCrewMen());
        this.priceOfTicket = airliner.priceOfTicket;
        this.passengersCapacity = airliner.passengersCapacity;
    }

    public double getPriceOfTicket() {

        return priceOfTicket;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPrice(double price) {
        this.priceOfTicket = price;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " Number Of passengers = " + passengersCapacity
                + " price of the ticket = " + priceOfTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airliner)) return false;
        if (!super.equals(o)) return false;
        Airliner airliner = (Airliner) o;
        return passengersCapacity == airliner.passengersCapacity &&
                Double.compare(airliner.priceOfTicket, priceOfTicket) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), passengersCapacity, priceOfTicket);
    }
}
