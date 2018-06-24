package by.epam.preTraining.teterev.Tasks07.logic.Containers;

import by.epam.preTraining.teterev.Tasks07.entitie.Plane;

public class PlaneList extends PlaneArray {

    private int size;

    public PlaneList() {
        planes = new Plane[DEFAULT_SIZE];
    }

    public PlaneList(int size){
        super(size);
        this.size = size;
    }

    public PlaneList(Plane[] planes) {
        super(planes);
        size = planes.length;
    }


    public Plane[] copyPlanes(Plane[] planes, PlaneArray planeArray){
        for (int i = 0; i < planeArray.planes.length; i++){
            planes[i] = planeArray.planes[i];
        }
        return planes;
    }


    public void add(Plane plane){
         Plane[] newPlanes = new Plane[planes.length + 1];
         newPlanes = copyPlanes(newPlanes, this);
         newPlanes[newPlanes.length - 1] = plane;
         this.planes = newPlanes;
    }

    public void add(Plane[] addedPlanes){
        int last = this.planes.length;
        Plane[] newPlanes = new Plane[planes.length + addedPlanes.length];
        newPlanes = copyPlanes(newPlanes, this);
        for (int i = last, j = 0; i < newPlanes.length; i++, j++ ){
            newPlanes[i] = addedPlanes[j];
        }
        this.planes = newPlanes;
    }
    public void delete(int index){
        this.planes[index + 1] = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
