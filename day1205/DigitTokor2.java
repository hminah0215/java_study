import java.util.Scanner;
class  DigitTokor2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String r="";
		try{
			System.out.print("���ڸ� �Է��Ͻÿ�. ==>");
			n=sc.nextInt();
		}catch(Exception e)
		{
			System.out.println("�Է°��� Ȯ���ϼ���");
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
		else if ( n==6 )
			r="��";
		else if ( n==7 )
			r="ĥ";
		else if ( n==8 )
			r="��";
		else if ( n==9 )
			r="��";
	else
		{
			System.out.print("�߸��� �Է°��Դϴ�.");
			
		}
			System.out.print(r);
		}
	}