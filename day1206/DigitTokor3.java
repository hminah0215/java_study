import java.util.Scanner;

/*switch( ������ ���� ) ==> ()�� �ü��ִ� Ÿ�� String, Int
{
	case 0 :
	 ����1:

	case 1 :
	����1:
*/

class  DigitTokor3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String r="";
		try{
			System.out.print("0~9������ ������ �Է��Ͻÿ�. ==>");
			n=sc.nextInt();
		}catch(Exception e)
		{
			System.out.println("�Է°��� Ȯ���ϼ���");
			return;
		}

		

		switch(n) //n�� ���� ���󼭶�� ��
		{
			case 0: //n��0�϶�
				r = "��"; //��Ű���� ����
				break; //����ġ�� �߰�ȣ�� Ż��.�극��ũ �ȳ����� ����ڸ� �Է��ص� "��"�����.
			
			case 1:r= "��";break; //���ٷνᵵ �������. �������ĸ� �� ���߸� ������.
			case 2:r= "��";break;
			case 3:r= "��";break;
			case 4:r= "��";break;
			case 5:r= "��";break;
			case 6:r= "��";break;
			case 7:r= "ĥ";break;
			case 8:r= "��";break;
			case 9:r= "��";break;
			
		}
			System.out.print(r);
		}
	}