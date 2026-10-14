import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius); 
        this.height = height;
    }

    double area() {
        return 2 * super.area() + 2 * Math.PI * radius * height;
    }
}

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height of cylinder: ");
        double height = sc.nextDouble();

        Circle c = new Circle(radius);
        Cylinder cy = new Cylinder(radius, height);

        System.out.println("Area of Circle = " + c.area());
        System.out.println("Surface Area of Cylinder = " + cy.area());

        sc.close();
    }
}