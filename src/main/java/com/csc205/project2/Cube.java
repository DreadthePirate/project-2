package com.csc205.project2;

public class Cube extends Shape{
    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double Width) {
        this.width = width;
    }
    @Override
    public double SurfaceArea() {
        return 6 * Math.pow(width, 2);
    }
    @Override
    public double Volume() {
        return (Math.pow(width, 3));
    }

    public String toString () {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=")
                .append(SurfaceArea());
        sb.append(", volume=")
                .append(Volume());
        sb.append('}');
        return sb.toString();
    }
}



