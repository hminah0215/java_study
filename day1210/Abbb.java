 /*���α׷��� 2�� ����. 
 ����ڷκ��� �ϳ��� ���ڸ� �Է¹޾Ƽ� ���ڰ� 'R'�̸� �簢���� ������ ����ϰ� 
'T'�̸� �ﰢ���� ������, 'C'�̸� ���� ������ ����Ѵ�. ������ ����ϴµ�
�ʿ��� ���ڵ��� ����ڷκ��� �Է¹޴´�. 

�簢�� ����= �غ����� * ����
�ﰢ�� ����= �غ����� * ���� /2
���� ���� = ������*������*������ 
*/
import java.util.Scanner;
class  Abbb
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String mun;
		int l,h,d;
		double x=0; //���� ��Ƶ� ����

		System.out.print("������ ����� ������ �Է��ϼ���(R:�簢��, T:�ﰢ��, C:��) ===>");
		mun= sc.next();
		
		if( !mun.equals("R") &&  !mun.equals("T") &&  !mun.equals("C") && 
			 !mun.equals("r") && !mun.equals("t") && !mun.equals("c")) { 
				System.out.println("�ùٸ� �Է°��� Ȯ���ϼ���.");
				return;
			}
		
			if( mun.equals ("R") || mun.equals ("r") ){
			System.out.print("�簢�� �غ��� ���̸� �Է��ϼ��� ===>");
			l = sc.nextInt();
			System.out.print("�簢���� ���̸� �Է��ϼ��� ===>");
			h = sc.nextInt();
			x = l*h;
			}
		
			else if(mun.equals ("T") || mun.equals ("t") ){
			System.out.print("�ﰢ�� �غ��� ���̸� �Է��ϼ��� ===>");
			l = sc.nextInt();
			System.out.print("�ﰢ���� ���̸� �Է��ϼ��� ===>");
			h = sc.nextInt();
			x = ( l*h)/2;
			}

			else if( mun.equals ("C") || mun.equals ("c") ){
			System.out.print("���� �������� �Է��ϼ��� ===>");
			d = sc.nextInt();
			x = (d*d*3.14);
			
			}
				System.out.println("�Է��� ������ ������ "+ x+ " �Դϴ�.");

	}
}