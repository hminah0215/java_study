/*
	��������� ��ȭ��ȣ�� �Է¹޾� �ùٸ� ��ȭ��ȣ ��������
	�Ǻ��ϴ� ���α׷� 
	0123456789
	000-0000-0000
	1) ������ 2���� �����Ͽ� 13�ڸ� �����̾���մϴ�.
	2) ù��° �������� ���������� 3�ڸ� ���ڿ����մϴ�.
	3) ù��° �����°� �ι�° ������ �ڿ��� 4�ڸ� ���ڿ��� �մϴ�. 
*/
import java.util.Scanner;
class  Phone
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String num="";

		System.out.print("��ȭ��ȣ��(������ - �� ������) �Է��ϼ��� ==>");
		num = sc.next();

		if(num.length()  !=  13){ 
			System.out.println("�߸��� ��ȭ��ȣ �Դϴ�. Ȯ�����ּ���.");
			return;
		}

		if(num.length() == 13){
			
			int n = num.indexOf("-"); //ù��° �������� ã�ƾ���. �� ���� 3�ڸ�������.
			String a = num.substring(4,8);  // �ι�° ������ ���� 4�ڸ�
			String b = num.substring(9); // �ι�° ������ �ڵ� 4�ڸ� 

			if(n != 3 || a.length() != 4 || b.length() != 4){
				System.out.println("�߸��� ��ȭ��ȣ �Դϴ�. Ȯ�����ּ���.");
			}else{
			System.out.println("�ùٸ� ��ȭ��ȣ �Դϴ�.");	
			}
			
		}
	}
}
