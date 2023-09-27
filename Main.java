import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean continueCalculations = true;

        while(continueCalculations) {
            Scanner user = new Scanner(System.in);
            System.out.println("Choose the shape: ");
            System.out.println("1.Rectangle");
            System.out.println("2.Triangle");
            System.out.println("3.Circle");
            System.out.println("4.Square");
            System.out.println("Enter the shape: ");


            String shape = user.nextLine();

            if (shape.equals("1")){


                System.out.println("Enter the height: ");
                double height = user.nextDouble();

                System.out.println("Enter the width: ");
                double width = user.nextDouble();

                Rectangle r = new Rectangle(shape, height, width);
                System.out.println("Area: " + r.getArea());
                System.out.println("Perimeter: " + r.getPerimeter());

                continue;
            } else if (shape.equals("2")) {


                System.out.println("Enter the 1st side: ");
                double s1 = user.nextDouble();

                System.out.println("Enter the 2nd side: ");
                double s2 = user.nextDouble();

                System.out.println("Enter the 3rd side: ");
                double s3 = user.nextDouble();

                Triangle t = new Triangle(shape, s1, s2, s3);

                System.out.println("Area: " + t.getArea());
                System.out.println("Perimeter: " + t.getPerimeter());

            } else if (shape.equals("3")) {


                System.out.println("Enter the radius: ");
                double radius = user.nextDouble();


                Circle c = new Circle(shape, radius);
                System.out.println("Area: " + c.getArea());
                System.out.println("Perimeter: " + c.getPerimeter());

            } else if (shape.equals("4")) {


                System.out.println("Enter the length of 1 side: ");
                double side = user.nextDouble();


                Square s = new Square(side);
                System.out.println("Area: " + s.getArea());
                System.out.println("Perimeter: " + s.getPerimeter());

            } else {
                System.out.println("Invalid input");
            }

        }
    }
}