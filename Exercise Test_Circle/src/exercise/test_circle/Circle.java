
package exercise.test_circle;


public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        this.diameter = radius*2;
        this.area = Math.PI*(Math.sqrt(radius));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius*2;
        this.area = Math.PI*(radius*radius);
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
    
    
    
}
