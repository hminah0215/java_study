/*
3) ����� ���� ���ڿ��� �Է¹޾� �Ųٷ� ����ϴ� ���α׷��� �ۼ��մϴ�.
���� ���� Ǯ�� StringBuffer / reverse ��� 
*/
import java.util.Scanner;
class StringReverseTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("���ڿ��� �Է��ϼ��� ===>");
		str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str); //��Ʈ�����۴� ���ϴ� ���ڿ��� ����ϱ� ����
		System.out.println( sb.reverse() );
		System.out.println(sb); //��Ʈ�����۸� ���⶧���� �������� ���ڿ��� ��µȴ�.
		
	}
}