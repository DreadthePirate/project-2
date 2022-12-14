package com.csc205.project2;

public class Sphere extends Shape{

    private double radius;

    public Sphere() {
        super();
        this.radius = 0.0;
    }

    public Sphere(double v) {
        super();
        this.radius = v;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double SurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double Volume() {
        return  (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=")
                .append(radius);
        sb.append(", surface area=")
                .append(SurfaceArea());
        sb.append(", volume=")
                .append(Volume());

        sb.append('}');
        return sb.toString();
    }
}
