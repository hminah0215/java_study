//�����ߴ��� ���ôٸ�������� Ǯ��.
import java.util.Scanner;
class  CellTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.print("��ȭ��ȣ�� �Է��ϼ���==>");
		phone = sc.next();
		
		int n1 = phone.indexOf("-");
		int n2 = phone.lastIndexOf("-");
		if(n1 != 3 || n2 != 8 || phone.length() != 13 ){
			System.out.println("�ùٸ� ��ȭ��ȣ ������ �ƴմϴ�. ");
			return;
		}
		for( int i = 0; i < phone.length(); i++){ //���� ���ڸ��� 0���� 9���� üũ
			if( i !=3 && i !=8 ){ //������ �ִ� �ڸ��� �ƴ϶��
				char ch = phone,chatAt(i);
				if( ch < '0' || ch >'9' ) //������ ������ �ƴѵ� �ִ����� ����
					System.out.println("�ùٸ� ��ȭ��ȣ ������ �ƴմϴ�. ");
					return;
			}
		}
		System.out.println("�ùٸ� ��ȭ��ȣ ���� �Դϴ�.");
	}	
}
