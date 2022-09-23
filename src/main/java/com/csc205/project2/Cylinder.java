package com.csc205.project2;

public class Cylinder extends Shape {
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


        @Override
        public double SurfaceArea () {
            return 2.0 * Math.PI * Math.pow(radius, 2) * (radius + height);
        }

        @Override
        public double Volume () {
            return (Math.PI * Math.pow(radius, 2) * height);
        }


        @Override
        public String toString () {
            final StringBuilder sb = new StringBuilder("Cylinder {");
            sb.append("height=").append(height);
            sb.append(", radius=").append(radius);
            sb.append(", surface area=").append(SurfaceArea());
            sb.append(", volume=")
                    .append(Volume());
            sb.append('}');
            return sb.toString();
        }
    }
