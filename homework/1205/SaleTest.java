//5일숙제. 프로그래밍 3번 홈워크폴더 pro3
import java.util.Scanner;
class  SaleTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int base = 100;
		int cnt, total;
		System.out.println("**100원 상점입니다.**");
		System.out.print("구입 수량을 입력하세요 ==>");
		cnt=sc.nextInt();

		total = base*cnt;

		if( cnt>=10 ){
			total=(int)(total * 0.9);
			System.out.println("10개이상 구매하여 10%할인되었습니다.");
		}	
		System.out.print("전체가격은 "+total+ " 원 입니다.");

	}
}
