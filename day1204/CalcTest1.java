import java.util.Scanner;
class CalcTest1
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

	
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/(double)b;

			System.out.println(a + "+"+b + "="+ add);
			System.out.println(a + "-"+b + "="+ sub);
			System.out.println(a + "*"+b + "="+ mul);
			System.out.println(a + "/"+b + "="+ div);


	}
}
