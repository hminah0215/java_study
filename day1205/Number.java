/*
����) ��������� 0~9������ ������ �Է¹޾� �ѱ�ǥ��� ����ϴ� ���α׷��� ��������.
<���࿹>
0~9������ ���� �Է��ϼ��� ==>7
ĥ!
*/

/*
import java.util.Scanner;
class  Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("0~9 ������ ������ �Է��Ͻÿ�. ==>");
		a=sc.nextInt();

		if( a==0 )
			System.out.print("��");
		
		else if( a==1 ){
			System.out.print("��");
		}
		else if( a==2 ){
			System.out.print("��");
		}
		else if( a==3 ){
			System.out.print("��");
		}
		else if( a==4 ){
			System.out.print("��");
		}
		else if( a==5 ){
			System.out.print("��");
		}
		else if( a==6 ){
			System.out.print("��");
		}
		else if( a==7 ){
			System.out.print("ĥ");
		}
		else if( a==8 ){
			System.out.print("��");
		}
		else if( a==9 ){
			System.out.print("��");
		}	
		
	}
}
*/


//������ Ǯ�� 

import java.util.Scanner;
class  Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String r="";

		System.out.print("���ڸ� �Է��Ͻÿ�. ==>");
		n=sc.nextInt();
		
			if( n<0 || n>9){  //����ڰ� �Է��� ���� 0~9�����϶��� �ƿ� ��������. 
			System.out.print("�Է°��� Ȯ���ϼ���!");
			return;
		}
		
		

		if ( n==0 )
			r="��";
		
		else if ( n==1 )
			r="��";
		
		else if ( n==2 )
			r="��";
		
		else if ( n==3 )
			r="��";
		else if ( n==4 )
			r="��";
		else if ( n==5 )
			r="��";

		System.out.print(r);
	
		}
		}
		