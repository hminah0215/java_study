/*
	����) ������ ���� �����ϴ� ���α׷��� �ۼ��մϴ�.
	<<���� ��>>
	�ټ��� �Է��ϼ��� ==> 5
	*
	**
	***
	****
	*****

*/
import java.util.Scanner;
class  PrintStar02
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;

	 System.out.print("�ټ��� �Է��ϼ��� ==>  ");
    	n=sc.nextInt();

		for( int i=1 ; i <= n ; i++ ){
			for( int j=1 ; j <= i ; j++){
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}