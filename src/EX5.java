import java.io.*;
import java.util.Scanner;
public class EX5 {
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		int i=0;
		System.out.println("Nhap vao day so i bat ki");
		i = w.nextInt();
		
		
		
		System.out.println("gia tri tang"+(i++));
		System.out.println("gia tri giam"+(i--));
	}
}
