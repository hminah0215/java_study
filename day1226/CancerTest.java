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
//������Ǯ��. �����Ѱ� Cancer ����.

class MyUtil
{
	public static int getYear(String jumin){	//����⵵ ��ȯ
		
		int year = Integer.parseInt( jumin.substring(0,2) );
		year += 1900;

		int flag = Integer.parseInt( jumin.substring(7,8) );
		
		if( flag == 3 || flag == 4 || flag == 7 || flag == 8){
			year += 100;
		}
		return year;
	}

	public static int getAge(String jumin){		//���� ��ȯ
	
		int year = getYear(jumin);
		int currentYear = (new Date()).getYear()+1900;
		int age = currentYear- year;
		return age;
	} 

	public static String getGender(String jumin){	//���� ��ȯ
		String re ="����";
		int f = Integer.parseInt(jumin.substring(7,8));
		if( f % 2 ==0  ){
			re = "����";
		}
		return re;
	}
}

class  CancerTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
	
		String jumin="";
		System.out.println("***���� �ϰ��� ��� Ȯ�� ���α׷�***");
		System.out.print("�ֹι�ȣ�� �Է��ϼ���==>");
		jumin = sc.next();
		
		int birthYear = MyUtil.getYear(jumin);
		int age = MyUtil.getAge(jumin);
		String gender = MyUtil.getGender(jumin);
		int currentYear = (new Date()).getYear()+1900;

		String r ="����, ����";
		
/*
	���ؿ��� - ������� 
	2019 - 1969			= ¦��			¦�� ������2 �ϸ� �������� 0. 
	2020 - 1970			= ¦��			�׷��� ���̰� ¦���� �ϰ��� �����
*/
		//if(age < 40 || age % 2 != 0){
		
		if(currentYear %2 != birthYear%2 || age<40){
		  System.out.println("���� �ϰ��� ����ڰ� �ƴմϴ�.");
			return;
		}
		if(age >= 50){
			r= r+",�����";
		}
		if(gender.equals("����")){
			r = r +",�����,�ڱþ�";
		}
		System.out.println("������ ���� �ϰ��� ������Դϴ�.");
		System.out.println("�����׸��� " + r+ "�Դϴ�.");
	}
}