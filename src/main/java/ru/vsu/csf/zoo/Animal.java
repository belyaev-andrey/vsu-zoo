package ru.vsu.csf.zoo;

public abstract class Animal {

    public final String name;

    private Coord position;

    public Animal(String name, Coord position) {
        this.name = name;
        this.position = position;
    }

    public abstract String talk();

    public Coord move(Direction direction){
        position = position.moveTo(direction);
        return position;
    }

    public Coord getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
