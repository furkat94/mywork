public class Elevator {


    private int currentFloor = 1;
    public int minFloor = -3;
    public int maxFloor = 26;

    public Elevator(int i, int i1) {
    }


    public void floorUp() {

        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void floorDown() {

        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {

        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        currentFloor = currentFloor + 1;
        currentFloor = currentFloor - 1;
    }

    public int getCurrentFloor() {

        return currentFloor;
    }
}
