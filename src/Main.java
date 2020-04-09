import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Input side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Input side 3: ");
        int side3 = scanner.nextInt();

        Triangle triangle = new Triangle(side1, side2, side3);
        try {
            triangle.checkSide();
            System.out.println(triangle.toString());
        } catch (Exception e){
            System.out.println("Triangle's sides are incorrect");
        }
    }
}
