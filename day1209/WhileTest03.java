/*
	������ ���� �����ϴ� ���α׷��� while ���� �̿��Ͽ� �ۼ��ϼ���.

	<���� ��>
	�� ���� �Է��ϼ���.==> 3
	ĭ ���� �Է��ϼ���. ==> 4

	****
	****
	****

*/
import java.util.Scanner;
class WhileTest03 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		int a,b;
		System.out.print("�� ���� �Է��ϼ��� == >");
		a=sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ��� == >");
		b=sc.nextInt();
	
		int i=1; 
		while( i <=a){
			i++;  
		
				int j=1; 
				while( j <=b){
				System.out.print("*"); 
				j++;
		}
			System.out.println();
	} 
	
    }
}
