//����ǥ���� [] ���
import java.util.Scanner;
class  CellTestRex
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.print("��ȭ��ȣ�� �Է��ϼ���==>");
		phone = sc.next();
		
							//����ȣ�� 0~9������ ���ڷ� ���Ĵ�� �̷�����ִ��� �ѹ��� üũ!
		if( phone.matches("[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]") ){ 
			System.out.println("�ùٸ� ��ȭ��ȣ�Դϴ�.");
		}else{
			System.out.println("�ùٸ� ��ȭ��ȣ�� �ƴմϴ�.");
		}

	
	}	
}