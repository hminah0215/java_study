/* ����ڷκ��� �ϳ��� ���ڸ� �Է¹޾Ƽ� ���ڰ� 'R'�̸� �簢���� ������ ����ϰ� 
'T'�̸� �ﰢ���� ������, 'C'�̸� ���� ������ ����Ѵ�. ������ ����ϴµ�
�ʿ��� ���ڵ��� ����ڷκ��� �Է¹޴´�. 

�簢�� ����= �غ����� * ����
�ﰢ�� ����= �غ����� * ���� /2
���� ���� = ������ * ���� * ���� /4
*/

import java.util.Scanner;
class Pro2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a;
		int l,h,d; //�غ�����, ����, ����
		double c;
		
		
		System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ�. ==>");
		a=sc.next();
		
		System.out.print("�غ��� ���̸� �Է��Ͻÿ�. ==>");
		l=sc.nextInt();
		
		System.out.print("���̸� �Է��Ͻÿ�. ==>");
		h=sc.nextInt();

		System.out.print("������ �Է��Ͻÿ�. ==>");
		d=sc.nextInt();
		
		
		 if ( a.equal("R") ){
			c=l*h;
		}
		
		
		System.out.print("�簢���� ������ " +c+ " �Դϴ�." );

		
	
		
		
		
			}
}
