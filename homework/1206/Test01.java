//1206���� 5�� lab 4�� ������Ǯ��

import java.util.Scanner;
class  Test01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		long a = 0, b= 1, c; //�� long���� ���� �ʾƵ� ��. ��Ʈ�� ����
		int i, n;
		System.out.println("***�Ǻ���ġ ���� ��� ���α׷�***");
		System.out.print("�� �ױ��� ����ұ��?");
		n=sc.nextInt();

		if(n < 3)
		{	
		    System.out.println("��� 3�̻��� �Է��ϼ���.");
			return;
		}
		System.out.print(a+" "+b+" ");

		for(i=2; i < n; i++) //���⼭i�� �ݺ�Ƚ���� ���� ����ϴ� ����. 
		//��� 3��°�׺��� ������ �����Ҽ��־ i=2��� ������� ��. 

		{
			c  = a+b;	//����a�� b�� ���Ͽ� ����c�� �����Ѵ�.
			System.out.print(c+" ");

			a = b;	    //����b�� ���� ���� a�� �ű��.
			b = c;	    //����c�� ���� ����b�� �ű��.
			

		}
		
	}
}
