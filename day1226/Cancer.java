/*
	���������� ����ڿ��� �ֹε�Ϲ�ȣ�� �Է¹޾� ���� �ϰ��� ��������� �Ǻ��ϴ� ���α׷� 

	<ó������>
	- ���� �ϰ��� ����ڴ� ���̰� 40���̻��̰� 
		���ذ� ¦�������̸� ¦���ؿ� �¾��� 
		���ذ� Ȧ�������̸� Ȧ���ؿ� �¾���
	- ���̰� 40�� �̻� �����̸� �����׸��� ����, ����
	- ���̰� 40�� �̻� �����̸� �����׸��� ����, ����, �����, �ڱþ�
	- ���̰� 50�� �̻� �����̸� �����׸��� ����, ����, �����
	- ���̰� 50�� �̻� �����̸� �����׸��� ����, ����, �����, �����, �ڱþ� 
*/

import java.util.Scanner;
import java.util.Date;

class  Cancer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
	
		String jumin="";
		System.out.println("***���� �ϰ��� ��� Ȯ�� ���α׷�***");
		System.out.print("�ֹι�ȣ�� �Է��ϼ���==>");
		jumin = sc.next();

		int year = Integer.parseInt( jumin.substring(0,2) ); //91��� 
		year += 1900;

		int flag = Integer.parseInt( jumin.substring(7,8) );// �������� �������� 
		
		if( flag == 3 || flag == 4 || flag == 7 || flag == 8){ //2000������ ����ڵ� ���̰�� 
			year += 100;
		}
		int currentYear = (new Date()).getYear()+1900;
		int age = currentYear- year;
		
		String a = "����, ����";

		if(currentYear %2 == year%2 && age>=40 ){ 
			System.out.println("����ϰ��� ������Դϴ�.");
		
		if(flag ==1 || flag ==3 ){
				if( age <= 50 ){
					a = a;
				}else if( age >= 50){
					a = a+", �����";
					}
				}
				
		if(flag ==2 || flag ==4 ){
				if( age <= 50 ){
					a = a + ", �����, �ڱþ�";
				}else if( age >= 50){
					a = a + ", �����, �ڱþ�, �����";
					}
				}System.out.println("���� ���� �׸��� "+a+ "�Դϴ�.");
		
		}else{
			System.out.println("���ش� ��������ڰ� �ƴմϴ�.");
			
		}
		
	}
}
		
