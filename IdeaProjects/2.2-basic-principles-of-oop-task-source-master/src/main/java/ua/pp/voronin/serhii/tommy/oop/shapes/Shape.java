package ua.pp.voronin.serhii.tommy.oop.shapes;

public abstract class Shape {

    public abstract double getArea();

    public abstract String getName();

    @Override
    public String toString() {
        return "[Фігура: " + getName() + " площею " + getArea() + "]";
    }
}
