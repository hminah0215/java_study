/*
	����) ������ ���� �����ϴ� ���α׷��� �ۼ��ϼ���.
	<<���� ��>>
	�ټ��� �Է��ϼ��� ==> 3
	ĭ���� �Է��ϼ��� ==> 4
	****
	****
	****
*/
import java.util.Scanner;
class  PrintStar
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n,x;

	 System.out.print("�ټ��� �Է��ϼ��� ==>");
    	n=sc.nextInt();
	 System.out.print("ĭ���� �Է��ϼ��� ==>");
    	x=sc.nextInt();

	 for(int  i= 1  ; i <=n ; i++ ){
	 
			for(int j = 1 ; j <=x ; j++){
				System.out.print("*");
		   	}
				
			System.out.println();
     }
		

 }
}