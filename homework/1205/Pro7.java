import java.util.Scanner;
class Pro7

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c;

		System.out.println("ù��° ������ �Է��ϼ���.");
		a=sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		b=sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���.");
		c=sc.nextInt();

		if(a<b)
			if(a<c)
			System.out.println("���� ���� ���� " +a);
		    else
			System.out.println("���� ���� ���� " +c);
		else
			if(b<c)
			System.out.println("���� ���� ���� " +b);
			else
			System.out.println("���� ���� ���� " +c);


	
	}
}
