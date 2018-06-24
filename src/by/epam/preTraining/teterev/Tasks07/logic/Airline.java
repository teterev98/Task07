package by.epam.preTraining.teterev.Tasks07.logic;

import by.epam.preTraining.teterev.Tasks07.entitie.Plane;
import by.epam.preTraining.teterev.Tasks07.logic.Containers.PlaneArray;
import by.epam.preTraining.teterev.Tasks07.logic.Containers.PlaneList;

public class Airline {
    public int countAllCrewmen(PlaneArray planes){
        int count = 0;
        for (Plane plane: planes.getPlanes()) {
            if (plane != null){
                count += plane.getNumberOfCrewMen();
            }
        }
        return count;
    }

    public static PlaneArray getPlanesOfSameModel(PlaneArray planes, String model){
        PlaneList planeArray = new PlaneList(1);
        for (Plane plane : planes.getPlanes()){
            if (plane != null){
                if (plane.getModel().equals(model)){
                    planeArray.add(plane);
                }
            }
        }
        return planeArray;
    }
}
