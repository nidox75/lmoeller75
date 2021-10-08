package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private int floorNumber;
    private boolean doorOpen;

    public Elevator(int totalNumberOfFloors) {
        this.floorNumber = totalNumberOfFloors;
    }

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (doorOpen != true)
            if (desiredFloor <= floorNumber) {
                if (desiredFloor > currentFloor) {
                    currentFloor = desiredFloor;
                }
            }
    }

    public void goDown(int desiredFloor) {
        if (doorOpen != true) {
            if (desiredFloor >= 1) {
                if (desiredFloor < currentFloor) {
                    currentFloor = desiredFloor;
                }
            }
        }

    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
