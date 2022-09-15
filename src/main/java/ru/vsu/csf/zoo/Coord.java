package ru.vsu.csf.zoo;

public class Coord {

    public final int x;
    public final int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coord moveTo(Direction d) {
        return new Coord(x+d.dx, y+d.dy);
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
