package entities;

public class Vehicle {
    private String model;
    private int numberOfSeats;

    public Vehicle(){

    }
    public Vehicle(String model, int numberOfSeats){
        this.model = model;
        this.numberOfSeats = numberOfSeats;
    }

    public Vehicle(Vehicle vehiclle){
        this.model = vehiclle.model;
        this.numberOfSeats = vehiclle.numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (numberOfSeats != other.numberOfSeats)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "model= " + model + "number of seats = " + numberOfSeats + "\n";
    }
}
