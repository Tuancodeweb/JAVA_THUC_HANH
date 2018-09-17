/*
 * Viết chƣơng trình:
1. Khai báo (import) lớp Scanner trong gói java.util
2. Sử dụng phƣơng thức nextLine () của lớp để nhập vào một xâu và in xâu vừa nhập
ra màn hình.
 *   */
import java.util.Scanner;
public class EX1 {
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		String b ="";
		System.out.println("nhap vao xau ki tu vua nhap \n");
		b = w.nextLine();
		System.out.println("xau vua nhap la"+b);
	}
}
