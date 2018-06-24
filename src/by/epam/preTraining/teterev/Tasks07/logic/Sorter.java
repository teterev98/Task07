package by.epam.preTraining.teterev.Tasks07.logic;

import by.epam.preTraining.teterev.Tasks07.entitie.*;
import by.epam.preTraining.teterev.Tasks07.logic.Containers.PlaneArray;

public class Sorter {
    public static void main(String[] args) {

    }
    public static void sortByNumberOfCrewmem(PlaneArray planes){
        int lastToSort = planes.getPlanes().length - 1;
        for (int j = 0; j < planes.getPlanes().length - 1; j++ ){
            boolean flag = true;
            for (int i = 0 ; i < lastToSort; i++){
                int next = i + 1;
                if (planes.getPlaneByIndex(i) != null && planes.getPlaneByIndex(next) != null ){
                    if ( planes.getPlaneByIndex(i).getNumberOfCrewMen() > planes.getPlaneByIndex(next).getNumberOfCrewMen()){
                        Plane temp = planes.getPlanes()[i];
                        planes.setPlaneByIndex(planes.getPlaneByIndex(next), i);
                        planes.setPlaneByIndex(temp, next);
                    }
                    flag = false;
                }
            }
            lastToSort--;
            if (flag){
                break;
            }
        }
    }
}