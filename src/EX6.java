import java.util.Scanner;

import com.sun.prism.impl.Disposer.Target;
public class EX6 {
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		int a = 0;
		System.out.println("nhap vao day so thap phan \n");
		a = w.nextInt();
		System.out.println("so vua nhap la"+a);
		System.out.println("thập phân sang nhi phan \n");
		System.out.println(Integer.toBinaryString(a));
	}
}
