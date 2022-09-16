package com.csc205.project2;

public class Cylinder {
    private double height, radius;

    public Cylinder() {
        super();
        this.radius = 0.0;
    }

    public Cylinder(double h, double v) {
        super();
        this.radius = v;
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {

        return 2.0 * Math.PI * Math.pow(radius, 2) * (radius + height);
    }

    public double volume() {

        return (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
