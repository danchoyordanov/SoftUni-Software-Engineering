import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            double squareFace = a * a;
            System.out.printf("%.3f",squareFace);
        } else if (type.equals("rectangle")){
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            double rectangleFace = b * c ;
            System.out.printf("%.3f",rectangleFace);
        } else if (type.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            double circleFace = r * r * Math.PI ;
            System.out.printf("%.3f",circleFace);
        } else if (type.equals("triangle")){
            double d = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double triangleFace = (d * 0.5) * h;
            System.out.printf("%.3f",triangleFace);
        }
    }
}

