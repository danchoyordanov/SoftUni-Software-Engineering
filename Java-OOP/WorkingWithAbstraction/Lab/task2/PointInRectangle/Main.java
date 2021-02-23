package PointInRectangle;

import IOUtils.ConsoleReader;
import IOUtils.InputParser;


public class Main {
    public static void main(String[] args)  {
        ConsoleReader reader = new ConsoleReader();
        int[] rectangleInfo = InputParser.parseArray(reader.readLine(),"\\s+");

        Rectangle rectangle = GeometryFactory.createRectangle(rectangleInfo);
        int n = Integer.parseInt(reader.readLine());

        while (n-- >0){
            int[] pointInfo = InputParser
                    .parseArray(reader.readLine(), "\\s+");

            Point2D point2D = GeometryFactory.createPoint2D(pointInfo);
            System.out.println(rectangle.contains(point2D));
        }
    }
}
