package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car mycar = new Car("Peugeot", "308","Galosina");

        mycar.isTachometerGreaterThanZero();
        mycar.start();
        mycar.start();
        mycar.stop();
        mycar.accelerate();
        mycar.stop();
        mycar.accelerate();
        mycar.accelerate();
        mycar.brake();
        mycar.brake();
        mycar.turnAngleOfWheels(20);
        mycar.turnAngleOfWheels(40);
        mycar.turnAngleOfWheels(-40);
        mycar.turnAngleOfWheels(-40);
        mycar.turnAngleOfWheels(-40);
        mycar.brake();
        mycar.setReverse(true);
        mycar.accelerate();
        mycar.setReverse(true);
    }
}