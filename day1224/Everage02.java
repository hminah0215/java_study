// ��������� �μ��� �Է¹޾� �μ��� ��ȭ����� ���Ͽ� ����ϴ� 
// ���α׷��� �ۼ��غ��ϴ�.

// 2ab/(a+b)

import java.util.Scanner;


class NotFoundHarmonicMeanException extends Exception
{
	public NotFoundHarmonicMeanException(String msg){
		super(msg);
	}
}

class  Everage02
{
	public static void main(String[] args) 
	{
		int a, b; 
		double r =0;
		
		try{
		Scanner sc = new Scanner(System.in);

		System.out.println("***��ȭ ��� ���α׷�***");
		System.out.print("ù��° ���� �Է��ϼ��� ==>");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� ==>");
		b = sc.nextInt();

		if( a == -b){
			throw new NotFoundHarmonicMeanException("�μ��� ��ȭ����� �����.");
		}

			r = 2 * a * b / (a+b);	

			System.out.print("��ȭ����� "+r);	
		}catch(NotFoundHarmonicMeanException e){
			System.out.print(e.getMessage());	
		}
	}

}