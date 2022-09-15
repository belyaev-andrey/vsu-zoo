package ru.vsu.csf.zoo;

public class Main {
    public static void main(String[] args) {

        Cat niko = new Cat("Niko");
        System.out.println(niko);
        System.out.println(niko.talk());
        niko.move(new Direction(3, 5));
        System.out.println(niko);

    }
}