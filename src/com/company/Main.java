package com.company;

public class Main {

    public static void main(String[] args) {

        Train pendolino = new Train();
        pendolino.w1 = new Wagon();
        pendolino.w2 = new Wagon();
        pendolino.w3 = new Wagon();
        pendolino.w4 = new Wagon();

        pendolino.w1.typeOfWagon = "Locomotive Pen502";
        pendolino.w2.typeOfWagon = "FirstClass Pen502";
        pendolino.w3.typeOfWagon = "SecondClass Pen502";
        pendolino.w4.typeOfWagon = "DinningCar Pen502";

        System.out.println("Pendolino: " + pendolino.w1.typeOfWagon + " " + pendolino.w2.typeOfWagon
                + " " + pendolino.w3.typeOfWagon + " " + pendolino.w4.typeOfWagon + " ");

        Train leo = new Train();
        leo.w1 = new Wagon();
        leo.w2 = new Wagon();
        leo.w3 = new Wagon();
        leo.w4 = new Wagon();

        leo.w1.typeOfWagon = "Locomotive LEO-L";
        leo.w2.typeOfWagon = "NormalClass LEO-1";
        leo.w3.typeOfWagon = "NormalClass LEO-2";
        leo.w4.typeOfWagon = "NormalClass LEO-3";

        System.out.println("Leo: " + leo.w1.typeOfWagon + " " + leo.w2.typeOfWagon
                + " " + leo.w3.typeOfWagon + " " + leo.w4.typeOfWagon + " ");

        //prohození lokomotivy

        System.out.println("Locomotive swap:");
        Wagon temp = pendolino.w1;
        pendolino.w1 = leo.w1;
        leo.w1 = temp;

        System.out.println("Pendolino: " + pendolino.w1.typeOfWagon + " " + pendolino.w2.typeOfWagon
                + " " + pendolino.w3.typeOfWagon + " " + pendolino.w4.typeOfWagon + " ");

        System.out.println("Leo: " + leo.w1.typeOfWagon + " " + leo.w2.typeOfWagon
                + " " + leo.w3.typeOfWagon + " " + leo.w4.typeOfWagon + " ");
    }
}
