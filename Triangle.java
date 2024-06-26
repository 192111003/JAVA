import java.util.Scanner;
public class Triangle {
    public static void main(String arg[]) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base length of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        double area = 1/2 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }
}
