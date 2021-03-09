package Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        if(getPerimeter() == null){
            double parameter = width * 2 + height * 2;
            setPerimeter(parameter);
        }
        return getPerimeter();
    }

    @Override
    public double calculateArea() {
        if(getArea() == null){
            double area = width * height;
            setArea(area);
        }
        return getArea();
    }
}
