package by.epam.preTraining.teterev.Tasks07.logic;

import by.epam.preTraining.teterev.Tasks07.entitie.Plane;
import by.epam.preTraining.teterev.Tasks07.logic.Containers.PlaneArray;
import by.epam.preTraining.teterev.Tasks07.logic.Containers.PlaneList;

public class Searcher {
    public static PlaneArray findPlanesOfSameModel(PlaneArray planes, String model){
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

    public static Plane findPlanesByCrewmen(PlaneArray planeArray, int number){
        int first = 0;
        int last = planeArray.getPlanes().length - 1;
        int position = (first + last) / 2;

        while ((planeArray.getPlaneByIndex(position).getNumberOfCrewMen() != number) && (first <= last)) {
            if (planeArray.getPlaneByIndex(position).getNumberOfCrewMen() > number) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            return planeArray.getPlaneByIndex(position);
        }
        return null;
    }

}
