/*�л� 10���� �̸��� ������ �Է¹޾�  ���հ� ��� ���ϱ�
++ ���� ���� ������ ���� �л��� ���� ���� ������ ���� �л� ��±�� �߰� */
import java.util.Scanner;
class  StudentTest04
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String []name = new String[5];
		int []score=new int[5];
		int tot=0, avg=0;
		int max = score[0]; //max�� 0�� ���� ũ�ٰ� ���� ��Ȳ. ����߿��� ū���� ã�°Ŷ�� ��������
		//������ ������ �� ���� ���� ū���� ��ã��.
		int idx = 0;
		
		for( int i =0 ; i < name.length ; i++){
			System.out.print(  (i+1)+ " ��° �л��� �̸��� ===>");
			name[i]= sc.next();
			System.out.print(  (i+1)+ " ��° �л��� ���� ===>");
			score[i]= sc.nextInt();
			
			tot += score[i];
			
			//3�����ϰ� �޸� for�� ���� ���ϰ� �����ִ� for���� �߰��ϴ� ���
			if( score[i] > max ){
						max= score[i];
						idx = i;
				} 
		}
			avg = tot / score.length;
			System.out.println( " ** �л��� ���� ** " );
			for( int i=0 ; i < name.length ; i++){
					System.out.println( name[i] + "	\t" + score[i]); 
				
			}
			
				System.out.println( "��ü���� :" + tot);
				System.out.println( "��ü��� :" + avg);
				System.out.println( "�ְ������: " +name[idx] );
				System.out.println( "�ְ�����: " +max );
				
	}
}

