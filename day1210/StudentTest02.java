/*�л� 10���� �̸��� ������ �Է¹޾�  ���հ� ��� ���ϱ�
*/
import java.util.Scanner;
class  StudentTest02
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String []name = new String[5];
		int []score=new int[5];
		int tot=0, avg=0;
		for( int i =0 ; i < name.length ; i++){
			System.out.print(  (i+1)+ " ��° �л��� �̸��� ===>");
			name[i]= sc.next();
			System.out.print(  (i+1)+ " ��° �л��� ���� ===>");
			score[i]= sc.nextInt();
		

			tot += score[i];
		}
			avg = tot / score.length;
			System.out.println( " ** �л��� ���� ** " );
			for( int i=0 ; i < name.length ; i++){
					System.out.println( name[i] + "	\t" + score[i]); 
					//\t ���������� �ǰŸ��� ������ٴ� �ǹ�
					//\n ���� ������ٴ� �ǹ�.
				
			}

				System.out.println( "��ü���� :" + tot);
				System.out.println( "��ü��� :" + avg);
				
			
	}
}
