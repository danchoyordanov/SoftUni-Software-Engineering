package PointInRectangle;

public class Rectangle {
    private Point2D bottomLeft;
    private Point2D topRight;

    public Rectangle(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point2D point2D){
        return point2D.isGreaterOrEqualByX(bottomLeft)
                && point2D.isLessOrEqualByX(topRight)
                && point2D.isLessOrEqualByY(topRight)
                && point2D.isGreaterOrEqualByY(bottomLeft);
    }
}
