//����ǥ���� 
import java.util.Scanner;
class  CellTestRex02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.print("��ȭ��ȣ�� �Է��ϼ���==>");
		phone = sc.next();
		
							//0~9������ 1�ڸ� ���ڰ� {3}�� �ԷµǾ��ִ°� ��...! 
		if( phone.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}") ){ 
			System.out.println("�ùٸ� ��ȭ��ȣ�Դϴ�.");
		}else{
			System.out.println("�ùٸ� ��ȭ��ȣ�� �ƴմϴ�.");
		}

	
	}	
}
