import java.util.Scanner;
import java.util.Date;

class CurrentAge{
	public static void main(String []args){
	
	Date today = new Date();
	int thisYear = today.getYear()+1900;
	
	Scanner sc = new Scanner(System.in);
	int birthYear;
	
	System.out.println("����⵵�� �Է��ϼ���.");
	birthYear = sc.nextInt();

	System.out.println("����� ���̴� "+ (thisYear-birthYear)+ "�� �Դϴ�.");



	}
}