package Ejercicios.GeometricObject;

public class Circle implements GeometricObject {
    private double radius; // [cite: 135]

    public Circle(double radius) { this.radius = radius; } // [cite: 136]

    @Override
    public double getArea() { return Math.PI * radius * radius; } // [cite: 138]

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; } // [cite: 139]

    @Override
    public String toString() { return "Circle[radius=" + radius + "]"; } // [cite: 147]
}
