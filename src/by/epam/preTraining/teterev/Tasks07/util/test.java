package by.epam.preTraining.teterev.Tasks07.util;

import by.epam.preTraining.teterev.Tasks07.entitie.*;
import by.epam.preTraining.teterev.Tasks07.entitie.Plane;
import by.epam.preTraining.teterev.Tasks07.logic.*;
import by.epam.preTraining.teterev.Tasks07.logic.Containers.PlaneArray;
import by.epam.preTraining.teterev.Tasks07.logic.Containers.PlaneList;

import java.util.Random;

public class test {
    public static void main(String[] args) {


        testSorter();
    }



    public static PlaneArray planeBuldier(int number){
        PlaneArray planes = new PlaneArray(number);
        Random random = new Random();
        for (int i = 0; i < number; i++ ){
            planes.addPlane(new Plane("Boeing 74" + i , random.nextInt(10)));
        }
        return planes;
    }

    public static PlaneList airlinerBuldier(int number){
        PlaneList airliners = new PlaneList(number);
        Random random = new Random();
        for (int i = 0; i < number; i++ ){
            airliners.getPlanes()[i] = new Airliner("Boeing 74" + i /* random.nextInt(10)*/, random.nextInt(10),
                    random.nextInt(100) + 100, (random.nextDouble() +1)*100);
        }
        return airliners;
    }

    public  static void testSorter(){
        System.out.println("---------- Before -------------");
        PlaneArray planes = planeBuldier(10);
        System.out.println(planes.toString());
        Sorter.sortByNumberOfCrewmem(planes);
        System.out.println("------- After -------------");
        for (Plane plane : planes.getPlanes() ) {
            if (plane != null) {
                System.out.println(plane.toString());
            }else System.out.println("null");
        }
        System.out.println("---------- Before -------------");
        PlaneList planeList = airlinerBuldier(5);
        System.out.println(planeList.toString());
        Sorter.sortByNumberOfCrewmem(planeList);
        System.out.println(planeList);
        planeList.add(planes.getPlanes());
        System.out.println("------- After -------------");
        System.out.println(planeList);
        Sorter.sortByNumberOfCrewmem(planeList);
        System.out.println(planeList);
        System.out.println( Airline.getPlanesOfSameModel(planeList, "Boeing 742").toString());

    }

    public static void rest(PlaneArray planes){
        Random random = new Random();
        for (int i = 0; i < 11; i++ ){
            planes.addPlane( new Plane("Boeing 74" + i /* random.nextInt(10)*/, random.nextInt(10)));
        }


    }

}
