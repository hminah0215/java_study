// ����ڿ��� 0~99 ������ ���� �Է¹޾� �ѱ�ǥ����� ����ϴ� ���α׷��� �ۼ��غ��ô�

import java.util.Scanner;
class  Four
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ten,one;

		String tenk = "";
		String onek = "";
		
		System.out.print("���� �ڸ����� �Է��ϼ���==>");
		ten = sc.nextInt();
		System.out.print("���� �ڸ����� �Է��ϼ���==>");
		one = sc.nextInt();

		if( ten ==1 )
			tenk = "��";
		else if ( ten ==2 )
			tenk = "�̽�";
		else if ( ten ==3 )
			tenk = "���";
		else if ( ten ==4 )
			tenk = "���";
		else if ( ten ==5 )
			tenk = "����";
		else if ( ten ==6 )
			tenk = "����";
		else if ( ten ==7 )
			tenk = "ĥ��";
		else if ( ten ==8 )
			tenk = "�Ƚ�";
		else if ( ten ==9 )
			tenk = "����";

		if ( one ==1 )
			onek = "��";
		else if ( one==2 )
			onek = "��";
		else if ( one==3 )
			onek = "��";
		else if ( one==4 )
			onek = "��";
		else if ( one==5 )
			onek = "��";
		else if ( one==6 )
			onek = "��";
		else if ( one==7 )
			onek = "ĥ";
		else if ( one==8 )
			onek = "��";
		else if ( one==9 )
			onek = "��";
		else  ( one==0 )
			onek = "��";

		System.out.println(tenk+onek);


	}
}
