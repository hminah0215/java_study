/*����� ���� �ΰ��� ������ �Է¹޾� ��Ģ������
������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ� 

<<���࿹>> 
ù��°���� �Է��ϼ���:5
�ι�° ���� �Է��ϼ���:2
5+2=_
5-2=_
5*2=_
5/2=_
*/

import java.util.Scanner;
class CalcTest
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a,b,add,sub,mul;
	double div;
	System.out.println("ù��° ���� �Է��ϼ���.");
	a = sc.nextInt();
	System.out.println("�ι�° ���� �Է��ϼ���.");
	b = sc.nextInt();

	//a+b=add; �̷��� �ڹٿ��� �ȵ�.
	//����� �ƴ϶� =�� ����̴ϱ� add = a+b �̷���!
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/(double)b; //�Ѵ� ������ �ϳ��� ����ιٲٸ� �� �Ѵٵ� ��Ű

			System.out.printf("%d + %d = %d\n ",a,b,add ); 
			//foam ���Ŀ� ���� �������
			//%d (������������ �� d ���� f �Ǽ�) ������ ������� 
			//%d,a�� ���� �ڿ��� b....
			//System.out.println(a+"+"b+'="+add);

			System.out.printf("%d - %d = %d\n ",a,b,sub );
			System.out.printf("%d * %d = %d\n ",a,b,mul );
			
		//5������2�� 2.5�� ���ü� �ְ� 
			System.out.printf("%d / %d = %.3f\n ",a,b,div );
						//�Ҽ��� 3��°�ڸ����� ������ %���� . ����
		// \n(���๮��?)�� �ٹٲ�!println�� �ƴ϶� �־������.
		//System.out.println(a + "+"+b + "="+ add); �̷������ε� ����
	}
}
