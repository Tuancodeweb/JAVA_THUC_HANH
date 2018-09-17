import java.util.Scanner;
public class EX3 {
	
	public static  Scanner w = new Scanner(System.in);
	
	
	public static void show(int[] arr) {
		int sun = 0;
		for(int i=0 ; i<arr.length ; i++){
			System.out.printf(arr[i] + " ");
			sun = sun + arr[i];
		}
		System.out.printf("Chu vi da giac tren la :" + sun);
	}
	
	public static void main(String[] args) {
		System.out.printf("nhap vao day so canh da giac \n");
		int n = w.nextInt();
		
		if(n>2){
			int [] arr = new int[n];
			for (int i = 0; i < n; i++)
			{
				System.out.printf("a[%d] = ",i);
				arr[i] = w.nextInt();
			}
			System.out.printf("phan phan tu vua nhap vao canh \n");
			show(arr);
		}
		else{
			System.out.println("yeu cau nhap lai cho hop le so canh >2");
		}
	}
}
