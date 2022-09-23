package com.csc205.project2;

public class Cone extends Shape{
    private double radius;
    private double height;

    public Cone() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double v, double w) {
        super();
        this.radius = v;
        this.height = w;
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

    @Override
    public double SurfaceArea() {
        return radius * Math.PI * (radius +
                Math.sqrt(Math.pow(height,2) + Math.pow(radius,2)));
    }

    @Override
    public double Volume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=")
                .append(height);
        sb.append(", radius=")
                .append(radius);
        sb.append(", surface area=")
                .append(SurfaceArea());
        sb.append(", volume=")
                .append(Volume());
        sb.append('}');
        return sb.toString();
    }
}
