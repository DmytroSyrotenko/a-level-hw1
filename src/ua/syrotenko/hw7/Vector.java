package ua.syrotenko.hw7;

import java.util.Arrays;

public class Vector {

    double x;
    double y;
    double z;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double vectorLength(Vector obj) {

        double vl = Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
        return vl;

    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Vector vectorProduct(Vector a, Vector b) {

        double i = (a.y * b.z) - (a.z * b.y);
        double j = -((a.x * b.z) - (a.z * b.x));
        double k = (a.x * b.y) - (a.y * b.x);

        return new Vector(i, j, k);


    }

    public double cosOfTheAngleBetweenVectors(Vector a, Vector b) {
        double power = 2;
        double cosOfAngle = ((a.x * b.x) + (a.y * b.y) + (a.z * b.z)) /
                (Math.sqrt(Math.pow(a.x, power) + Math.pow(a.y, power) + Math.pow(a.z, power)) *
                        Math.sqrt((b.x * b.x) + (b.y * b.y) + (b.z * b.z)));
        ////// просто написал двумя разніми способами-через pow или умножением на себя.
        return cosOfAngle;
    }

    public Vector sumOfVectors(Vector a, Vector b) {
        double i = a.x + b.x;
        double j = a.y + b.y;
        double k = a.z + b.z;

        return new Vector(i, j, k);
    }

    public Vector differenceOfVectors(Vector a, Vector b) {
        double i = a.x - b.x;
        double j = a.y - b.y;
        double k = a.z - b.z;

        return new Vector(i, j, k);
    }

    public static Vector[] randomVectorsInArray(int qty) {

        Vector[] array = new Vector[qty];

        for (int i = 0; i < array.length; i++) {

            array[i] = new Vector((int) (Math.random() * 8) - 3, (int) (Math.random() * 8) - 3, (int) (Math.random() * 8) - 3);

        }
        return array;
    }
}

