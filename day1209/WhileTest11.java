//����ڷκ��� ���� ���ϴ� ���� �Է¹��������� ����ؼ� �ݺ������Ҷ� ����.
//��������� ���� �Է¹޾� ���������� ����ϴ� ���α׷� 
//�Է��� ���� 1~12������ ���� �ƴ϶�� ����� �� ���� �Է¹��������� �ݺ� ���� 

import java.util.Scanner;
class WhileTest11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;

		while(true){
			System.out.print("���� �Է��ϼ��� ==>");
			month = sc.nextInt();
			if( month >= 1 && month <= 12){
				break;  //1~12�� ���̸� �Է¹޾Ҵٸ� Ż���ϼ���. while�� Ż��.
			}
		
		} //�Ʒ� �迭�� ���Ϲ���. 
		int []lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		//lastday[0] 0��° ����ִ� 31�� ���������� 0. 
		System.out.println(month + "���� "+ lastday[month-1]);
	}
}
