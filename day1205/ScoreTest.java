//�л��� ������ �Է¹޾� "��/��/��/��/���� �Ǻ��Ͽ� ��� 
//����if��
import java.util.Scanner;
class  ScoreTest
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int score;
		String r; //����̾簡�� ��Ƶ� ���ڿ� ����

		System.out.print("�л��� ������ �Է��ϼ���==>");
		score = sc.nextInt();

		if( score >=90 )
		{
			r="��";
		}
		else if( score >=80 )
		{
			r="��";
		}
		else if( score >=70 )
		{
			r="��";
		}
		else if( score >=60 )
		{
			r="��";
		}
		else 
		{
			r="��";
		}
		System.out.println("���: " + r);
	}
}