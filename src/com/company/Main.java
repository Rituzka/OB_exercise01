package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        int numDoors = car1.addDoor();
        System.out.println(numDoors);

      int a = 12;
      int b = 6;
      int c = 10;
      int result = addNumber(a, b, c);


    }

    public static int addNumber(int a, int b, int c) {

        return a + b + c;
    }
}
class Car {

    int NumOfDoors = 4;

    public int addDoor() {
        return NumOfDoors++;
    }
}
