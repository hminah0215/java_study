import java.util.Scanner;
class  ForTest03
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int dan;
		System.out.print("����� ����ұ��?");
		dan=sc.nextInt();

		System.out.println(dan+ "�� ���");
		
		for( int i = 1; i <=9 ; i++ ){
			System.out.println(dan+"*"+i+"="+(dan*i));
		}

	}
}