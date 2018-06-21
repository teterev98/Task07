package by.epam.preTraining.teterev.Tasks07.entitie;

import java.util.Objects;

public class Plane {

    private String model;
    private int numberOfCrewmen;

    public Plane(){ }

    public Plane(String model, int numberOfCrewmen){
        this.model = model;
        this.numberOfCrewmen = numberOfCrewmen;
    }

    public Plane(Plane plane){
        this.model = plane.model;
        this.numberOfCrewmen = plane.numberOfCrewmen;

    }

    String getModel() {
        return model;
    }

    public int getNumberOfCrewMen() {
        return numberOfCrewmen;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfCrewMen(int numberOfCrewMen) {
        this.numberOfCrewmen = numberOfCrewMen;
    }



    @Override
    public String toString() {
        return "Model =  " + model + " Number Of Crewmen = " + numberOfCrewmen ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return numberOfCrewmen == plane.numberOfCrewmen &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(model, numberOfCrewmen);
    }
}
