import java.util.Scanner;

public class EX7{
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		int a , b , c , hople;
		System.out.println("Nhap ngay cua ban : \n");
		a =w.nextInt();
		System.out.println("Nhap thang cua ban: \n");
		b =w.nextInt();
		System.out.println("Nha[ nam cua ban: \n");
		c =w.nextInt();
		hople=0;
		
		
		if((a>=1)&&(a<=31)&&((b==1)||(b==3)||(b==5)||(b==7)||(b==8)||(b==10)||(b==12))){
			hople = 1;
		}
		if((a>=1)&&(a<=30)&&((b==4)||(b==6)||(b==9)||(b==11))){
			hople = 1;
		}
		if((a>=1)&&(a<=28)){
			hople = 1;
		}
		if((a>=1)&&(a<=29)){
			if(c%4==0){
				hople=2;
			}
		}
		
		if(hople==0){
			System.out.println("nhập dữ liệu không hợp lệ");
		}
		
		int songay = a;
		for(int i=0 ; i<b ; i++){
			switch (i) {
			case 1: songay = songay + 31; break;
			case 2: if(hople==1){
					songay = songay +28; break;
				}
					if(hople==2){
					songay = songay +29; break;
					}
			case 3: songay = songay + 31; break;
			case 4: songay = songay + 30; break;
			case 5: songay = songay + 31; break;
			case 6: songay = songay + 30; break;
			case 7: songay = songay + 31; break;
			case 8: songay = songay + 31; break;
			case 9: songay = songay + 30; break;
			case 10: songay = songay + 31; break;
			case 11: songay = songay + 30; break;
			case 12: songay = songay + 31; break;
			}
		}
		System.out.println("so ngay trong nam la"+songay+" ");
	}
}