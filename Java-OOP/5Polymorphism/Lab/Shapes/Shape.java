package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;


    public abstract double calculatePerimeter();
    public abstract double calculateArea();

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double parameter) {
        this.perimeter = parameter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
