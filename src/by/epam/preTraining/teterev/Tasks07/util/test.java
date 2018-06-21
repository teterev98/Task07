package by.epam.preTraining.teterev.Tasks07.util;

import by.epam.preTraining.teterev.Tasks07.entitie.Plane;
import by.epam.preTraining.teterev.Tasks07.logic.*;

import java.util.Random;

public class test {
    public static void main(String[] args) {

        testSorter();
    }



    public static Plane[] planeBuldier(int number){
        Plane[] planes = new Plane[number];
        Random random = new Random();
        for (int i = 0; i < number; i++ ){
            planes[i] = new Plane("Boeing 74" + i /* random.nextInt(10)*/, random.nextInt(10));
        }
        return planes;
    }
    public static void testSorter(){
        System.out.println("---------- Before -------------");
        Plane[] planes = planeBuldier(10);
        for (int i = 0; i < planes.length; i++ ) {
            System.out.println(planes[i].toString());
        }
        planes = Sorter.sortByNumberOfCrewmem(planes);
        System.out.println("------- After -------------");
        for (Plane plane : planes ) {
            System.out.println(plane.toString());
        }

    }
}
