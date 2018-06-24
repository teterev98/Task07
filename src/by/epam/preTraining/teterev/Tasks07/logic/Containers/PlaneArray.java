package by.epam.preTraining.teterev.Tasks07.logic.Containers;
import by.epam.preTraining.teterev.Tasks07.entitie.*;
import by.epam.preTraining.teterev.Tasks07.entitie.Plane;

public class PlaneArray {
    protected Plane[] planes;
    protected static final int DEFAULT_SIZE = 10;

    public PlaneArray(){
        planes = new Plane[DEFAULT_SIZE];
    }

    public PlaneArray(int size){
        planes = new Plane[size];
    }

    public PlaneArray(Plane[] planes){
        this.planes = planes;
    }

    public Plane[] getPlanes() {
        return planes;
    }

    public void setPlanes(Plane[] planes) {
        this.planes = planes;
    }

    public void setPlaneByIndex( Plane plane, int index) {
        this.planes[index] = plane;
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

    public void addPlane(Plane plane){
        for (int i = 0; i < this.planes.length - 1; i++){
            if (this.planes[i] == null){
                this.planes[i] = plane;
                break;
            }
        }
    }
    public PlaneList toPlaneList(){
        PlaneList planeList = new PlaneList(this.planes.length);
        planeList.planes = this.planes;
        return planeList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Plane plane : this.getPlanes()) {
            if (plane != null) {
                sb = sb.append(plane.toString() + "\n");
            }
            else sb.append("null \n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
