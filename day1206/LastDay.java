/* ����)��������� ���� �Է¹޾� ������ ���� ����ϴ� ���α׷��� �ۼ�.
<���࿹>
���� �Է��ϼ���==> 7
7���� 31�ϱ��� �־��! 
<ó������>
31 : 1/3/5/7/8/10/12
30 : 4/6/9/11
28 : 2 */


import java.util.Scanner;
class  LastDay
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;
		String day="28��";
		System.out.println("���� �Է��ϼ���===>");
		month=sc.nextInt();

		if( month <1 || month>12 ) //�ʴ� 1~12���� ���ڸ� �Է��ؾ���.
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return; 
		}

		if(month ==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
				day="31��";
		else if(month==4 || month==6 || month==9 || month==11)
				day="30��";

		System.out.println(month+ "���� "+day +" ���� �־��!");
	

	}
}
