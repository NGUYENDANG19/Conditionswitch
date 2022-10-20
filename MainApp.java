package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int thang, nam ;
		System.out.println("nhap thang ");
		thang = sc.nextInt();
		System.out.println("nhap nam ");
	nam = sc.nextInt();
		
		switch (thang)	{
			case   1,3, 5, 7, 8, 10, 12:
				System.out.println("thang co 31 ngay");
				break;
			case 4, 6, 9, 11 :
				System.out.println("thang co 30 ngay");
			case 2:
				if ((nam % 4 ==0 && nam % 100 != 0 || (nam % 400 ==0   )))	{
				System.out.println ("thang co 29 ngay");
				
				}else {
					System.out.println("thang co 28 ngay");
				}
			default:
				System.out.println("sai du lieu");
		}
		
	}

}
