package by.epam.preTraining.teterev.Tasks07.logic;
import by.epam.preTraining.teterev.Tasks07.entitie.*;
import by.epam.preTraining.teterev.Tasks07.entitie.Plane;

public class PlaneList {
    private Plane[] planes;
    private static final int DEFAULT_SIZE = 25;

    public PlaneList(){
        planes = new Plane[DEFAULT_SIZE];
    }

    public PlaneList(int size){
        planes = new Plane[size];
    }

    public PlaneList(Plane[] planes){
        this.planes = planes;
    }

    public Plane getPlaneByIndex(int index){
        return this.planes[index];
    }

    public void deletePlaneByIndex(int index){
        for (int i = index - 1; i < this.planes.length - 1; i++){
            if (this.planes[i] != null){
                this.planes[i] = this.planes[i+1];
            }
        }
        this.planes[this.planes.length - 1] = null;

    }

    public void cutPlanesByIndex (int index){
        for (int i = index - 1; i < this.planes.length; i++){
            this.planes[i] = null;
        }
    }
//    public int getCommonPassengersCapacity(PlaneList planeList){
//        for ( ) {
//
//        }
//    }

}
