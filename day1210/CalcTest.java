/*							���α׷���1�� ���� 
������ ���� ���α׷��� �ۼ��Ͽ�����. ���� ����ڷκ��� �ϳ��� ���ڸ� �Է¹޴´�. 
�̾ ����ڷκ��� 2���� ���ڸ� �Է¹޴´�. ����ڷκ��� ���� ���ڰ� '+' �̸� �μ��� 
������, ���ڰ� '-' �̸� ������, ���ڰ� '*'�̸� ������, ���ڰ� '/' �̸� �������� �����ϵ���
�ۼ��϶�. if-else ���� ����϶�. �������� ���, �и� 0�� �ƴ����� ���� �˻��Ͽ����Ѵ�.
*/

import java.util.Scanner;
class  CalcTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String op;
		int a,b;
		double r=0;
		System.out.println("***������ ����***");
		System.out.print("�����ڸ� �Է�(+,-,*,/)�ϼ���==>");
		op=sc.next();

		if( !op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) { 
		//���ϱⰡ �ƴϳ�. �տ� ! ����. +,-,*,/�� �ƴ϶��~~ 
		System.out.println("�ùٸ� �����ڸ� Ȯ���ϼ���.");
		return;
		}

		System.out.print("ù��° ���� �Է��ϼ��� ==>");
		a=sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� ==>");
		b=sc.nextInt();

		
		if( op.equals("+") ){   //���ڿ��� ==���� ���ٰ� ���ϰ� .equals("���ڿ�")���� ǥ��
			r = a + b;
		}else if (op.equals("-")){
			r = a - b;
		}else if (op.equals("*")){
			r = a * b;
		}else if (op.equals("/")){
			if ( b  == 0 ){
				System.out.println("0���� �������� �����.");
				return;
			}
			r = a / (double) b;
		}
		
		System.out.printf("��� : %.2f ", r); //�Ҽ��� ��°�ڸ����� ��µǵ���. ����Ʈf ( %.2)
		


	}
}