/*�л� 10���� ������ �Է¹޾�  ���հ� ��� ���ϱ�*/
import java.util.Scanner;
class  StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int []score=new int[10];
		int tot=0; //�հ踦 ������ ����
		int avg;

		for (	int i=0	; i < score.length ; i++ ){
			System.out.println( (i+1)+ "��° �л��� ������ �Է��ϼ���===>");
			score[i] =sc.nextInt();
			tot += score[i];  //tot= tot+ score[i];
		}
			avg= tot / score.length;
			System.out.println("��ü�հ�: " + tot);
			System.out.println("��ü���: " + avg);
	}
}
