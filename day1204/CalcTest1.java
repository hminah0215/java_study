import java.util.Scanner;
class CalcTest1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a,b,add,sub,mul;
	double div;
	System.out.println("첫번째 수를 입력하세요.");
	a = sc.nextInt();
	System.out.println("두번째 수를 입력하세요.");
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
