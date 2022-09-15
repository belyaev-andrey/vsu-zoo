package ru.vsu.csf.zoo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, new Coord(0, 0));
    }

    @Override
    public String talk() {
        return "Meow";
    }

    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", position=" + getPosition() +
                '}';
    }


}
