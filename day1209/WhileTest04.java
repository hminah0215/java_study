//��������� N�� �Է¹޾� 1���� N������ ¦���� ���� �����Ͽ� ����ϴ� ���α׷� 
// while���̿�

import java.util.Scanner;
class WhileTest04 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		int sum=0;
		System.out.print("N�� �Է��ϼ���===>");
		n=sc.nextInt();
		
		int i=1;
		while(i <=n ){
			if( i %2 ==0 ){
			sum= sum+i;
		}
		i++;
	}
		System.out.println("1���� " +n+ "������ ¦����:" + sum);
	}
}
