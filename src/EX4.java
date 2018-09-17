import java.util.Scanner;
public class EX4 {
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		float a = 0;
		double b = 0;
		System.out.println("Nhap vao a: \n ");
		a = w.nextFloat();
		System.out.println("nhap vao b:  \n ");
		b = w.nextDouble();
		
		
		
		System.out.println("a + b = \n"+(a+b));
		System.out.println("a - b = \n"+(a-b));
		System.out.println("a * b = \n"+(a*b));
		System.out.println("a / b = \n"+(a/b));
		System.out.println("a % b = \n"+(a%b));
	}
}
