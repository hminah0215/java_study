//����3�� ������ ����Ǯ�� 
/*3) ����ڷ� ���� N�� �Է¹޾� 1���� N������ ¦������, Ȧ���� ��, ¦���� ����, 
	Ȧ���� ������ ���� ���Ͽ� ����ϼ���. 
*/
import java.util.Scanner;
class  SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n, sumEven=0, sumOdd=0, cntEven=0, cntOdd=0;
     //�Է¹�����, ¦������, Ȧ������, ¦���ǰ���, Ȧ���� ����

		System.out.print("N�� �Է��ϼ��� ==>");
		n=sc.nextInt();
		//i : 1,2,3,4,5,....,n

		for(int i = 1; i <= n ; i++) //i++�� i=i+1�� ����.
		{
			if( i % 2 == 0 ) //¦�� ���� ����
			{
				sumEven = sumEven + i; //sumEven += i �� ����.
				cntEven = cntEven+1; //������ ���ؾ��ؼ� +1, cntEven++, cntEven+=1 �� ����.
		
			}else{
				sumOdd+=i;
				cntOdd++;
				}
			
		}
		
		System.out.println("¦���� ��:" +sumEven);
		System.out.println("¦���� ����:" +cntEven);
		System.out.println("Ȧ���� ��:" +sumOdd);
		System.out.println("Ȧ���� ����:" +cntOdd);
	}
}
