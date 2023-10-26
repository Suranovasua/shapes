import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape type:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter the name of the rectangle: ");
                String name = scanner.nextLine();
                System.out.print("Enter the width of the rectangle: ");
                double width = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the height of the rectangle: ");
                double height = Double.parseDouble(scanner.nextLine());
                Shape shape = new Rectangle(name, width, height);
                System.out.println("Name of the rectangle: " + shape.name);
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
            } else if (choice.equals("2")) {
                System.out.print("Enter the name of the circle: ");
                String name = scanner.nextLine();
                System.out.print("Enter the radius of the circle: ");
                double radius = Double.parseDouble(scanner.nextLine());
                Shape shape = new Circle(name, radius);
                System.out.println("Name of the circle: " + shape.name);
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
            } else if (choice.equals("3")) {
                System.out.print("Enter the name of the triangle: ");
                String name = scanner.nextLine();
                System.out.print("Enter the length of side 1: ");
                double side1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the length of side 2: ");
                double side2 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the length of side 3: ");
                double side3 = Double.parseDouble(scanner.nextLine());
                Shape shape = new Triangle(name, side1, side2, side3);
                System.out.println("Name of the triangle: " + shape.name);
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
            } else if (choice.equals("4")) {
                System.out.print("Enter the name of the square: ");
                String name = scanner.nextLine();
                System.out.print("Enter the side length of the square: ");
                double sideLength = Double.parseDouble(scanner.nextLine());
                Shape shape = new Square(name, sideLength);
                System.out.println("Name of the square: " + shape.name);
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
            } else if (choice.equals("5")) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
