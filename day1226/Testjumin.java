/*
	��������� �ֹι�ȣ�� �Է¹޾� 
	������ �ľ��Ͽ� ����ϴ� ���α׷��� �ۼ�
*/
import java.util.Scanner;
class  Testjumin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin;

		System.out.print("�ֹι�ȣ��(������ - �� �����Ͽ�) �Է��ϼ���");
		jumin = sc.next();
		System.out.println("�Է��� �ֹι�ȣ�� " + jumin + " �Դϴ�.");

		if(jumin.length() != 14){
			System.out.println("�ֹι�ȣ�� �ùٸ��� �ʽ��ϴ�. �ٽ� Ȯ�����ּ���.");
			return;
		} 
		
		if(jumin.length() == 14){
			int n = jumin.indexOf("-")+1;
			String a = jumin.substring(n,n+1);
		
		if(a.equals ("1") || a.equals ("3") || a.equals ("5") ||  a.equals ("7") ||  a.equals ("9")){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("�����Դϴ�.");
			}
		}
	}
}