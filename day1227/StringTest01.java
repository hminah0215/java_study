/*
3) ����� ���� ���ڿ��� �Է¹޾� �Ųٷ� ����ϴ� ���α׷��� �ۼ��մϴ�.
���� ���� Ǯ��
*/
import java.util.Scanner;
class StringTest01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("���ڿ��� �Է��ϼ��� ===>");
		str = sc.nextLine();

		for( int i = str.length()-1 ; i >= 0 ; i--){
			System.out.print(str.charAt(i));
		}
	}
}
