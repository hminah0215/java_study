import java.util.Scanner;
class Pro7

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c;

		System.out.println("첫번째 정수를 입력하세요.");
		a=sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		b=sc.nextInt();
		System.out.println("세번째 정수를 입력하세요.");
		c=sc.nextInt();

		if(a<b)
			if(a<c)
			System.out.println("가장 작은 수는 " +a);
		    else
			System.out.println("가장 작은 수는 " +c);
		else
			if(b<c)
			System.out.println("가장 작은 수는 " +b);
			else
			System.out.println("가장 작은 수는 " +c);


	
	}
}
