import java.util.Scanner;
class Pro9 

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x;

		System.out.println("x를 입력하세요.");
		x=sc.nextInt();

		if(x<=0)
			System.out.println(x*x*x-9*x+2);
		else
			System.out.println(7*x+2);
	
	}
}
