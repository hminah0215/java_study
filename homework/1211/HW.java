/*
	����) 5�� �л��� �̸�, ����, ����, ������ �Է¹޾� ������ ����� ���� ���� ������ ���������� �����Ͽ� ����մϴ�. 

	<���� ��>
1��° �л��� �̸�==> ������
1��° �л��� ����==> 40
1��° �л��� ����==> 70
1��° �л��� ����==> 80


*** ���� ó�� ��� ***
�̸�	����	����	����	����	���
�̼���	100	100	100	300	100
�̼���	90	90	90	270	90
...

*/

import java.util.Scanner;
class   HW
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];  //�̸�
		int []korean = new int[5];  //��������
		int []eng = new int[5];	//��������
		int []math = new int[5];	//��������
		int []tot = new int[5]; //����
		double []avg = new double[5]; //���
		
		for( int i=0; i < name.length; i++ ){
		
			System.out.print( (i+1) + "�� �л��� �̸��� �Է��ϼ���==>");
			name[i] = sc.next();

			System.out.print( (i+1)+ "�� �л��� ���� ������ �Է��ϼ���==>");
			korean[i] = sc.nextInt();

			System.out.print( (i+1)+ "�� �л��� ���� ������ �Է��ϼ���==>");
			eng[i] = sc.nextInt();

			System.out.print( (i+1)+ "�� �л��� ���� ������ �Է��ϼ���==>");
			math[i] = sc.nextInt();
		
			tot[i] = korean[i] + eng[i] + math[i]; //����
			avg[i] = tot[i] /3;  // ���
							
		}
		System.out.println("***������ ����***");
		
		for( int i=0 ; i < 4 ; i++ ){
				for( int j= i+1 ; j < 5 ; j++ ){
					if(	avg[j] > avg[i]){ //������ ����������
						String temp = name[i];
						name[i] = name[j];
						name[j] = temp;
						
						int temp2 = korean[i];
						korean[i] = korean[j];
						korean[j] = temp2;
						
						temp2 = eng[i];
						eng[i] = eng[j];
						eng[j] = temp2;
						
						temp2 = math[i];
						math[i] = math[j];
						math[j] = temp2;
						
						temp2 = tot[i];
						tot[i] = tot[j];
						tot[j] = temp2;
						
						double temp3 = avg[i];
						avg[i] = avg[j];
						avg[j] = temp3;
					
				} 	
			}   		
		}	
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		for (int i =0 ; i < name.length ; i++ ){
			System.out.println(name[i]+"\t"+korean[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
			System.out.println();
	}
}