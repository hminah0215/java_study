import java.util.Scanner;
class PasswordTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pass,pass2;

		System.out.print("��ȣ�� �Է��ϼ���(6~10������)==>");
		pass = sc.next();
		System.out.print("��ȣ�� �ٽ� �Է����ּ���==>");
		pass2 = sc.next();

		if(! pass.equals(pass2)){
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� Ȯ�����ּ���!");
				return;
		}
		int n = pass.length();
		if(n >= 6 && n <=10){
			System.out.println("�ùٸ� ��ȣ�Դϴ�.");
		}else{
			System.out.println("�ùٸ� ��ȣ�� �ƴմϴ�.");
		}
	}
}
