package by.epam.preTraining.teterev.Tasks07.logic;

import by.epam.preTraining.teterev.Tasks07.entitie.*;

public class Sorter {
    public static void main(String[] args) {

    }
    public static Plane[] sortByNumberOfCrewmem(Plane[] planes){
        int lastToSort = planes.length - 1;
        for (int j =0; j < planes.length - 1; j++ ){
            boolean flag = true;
            for (int i = 0 ; i < lastToSort; i++){
                int next = i + 1;
                if ( planes[i].getNumberOfCrewMen() > planes[next].getNumberOfCrewMen()){
                    Plane temp = planes[i];
                    planes[i] = planes[next];
                    planes[next] = temp;
                }
                flag = false;
            }
            lastToSort--;
            if (flag){
                break;
            }
        }
        return planes;
    }
}
