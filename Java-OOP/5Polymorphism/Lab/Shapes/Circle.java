package Shapes;

public class Circle extends Shape{
    private double radius;

    final public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        if(getPerimeter() == null){
            double parameter = 2 * Math.PI * radius;
            setPerimeter(parameter);
        }
        return getPerimeter();
    }

    @Override
    public double calculateArea() {
        if(getArea() == null){
            double area = Math.PI * radius * radius;
            setArea(area);
        }
        return getArea();
    }
}
