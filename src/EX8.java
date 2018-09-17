import java.util.Scanner;
public class EX8 {
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		int n=0 , dem=0;
		System.out.println("nhap vao n: ");
		n = w.nextInt();
		for(int i=2 ; i<n ; i++){
			for(int j=1 ; j<=i ; j++){
				if(i%j==0)
					dem =dem+1;
			}
			if(dem==2)
				System.out.printf("%d",i);
			dem=0;
		}
	}
}
