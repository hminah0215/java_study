import java.util.Scanner;
import java.util.Date;



class Forty2{
	public static void main(String []args){
	
	int a;
	int b;
	Scanner sc = new Scanner (System.in);
	System.out.println("***���� �ϰ��� ����� Ȯ�� ***");
	
	Date today = new Date();
	
	System.out.println("����⵵�� �Է��ϼ���====>");
	a = sc.nextInt();
	b = today.getYear()+1900-a;
	
	

	if( b >= 40 )
		System.out.println("���� �ϰ��� ������Դϴ�.");
	else
		System.out.println("���� �ϰ��� ����ڰ� �ƴմϴ�.");
}

	}