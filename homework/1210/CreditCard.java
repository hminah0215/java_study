//���� ���α׷��� 1��
import java.util.Scanner;
class	CreditCard
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []card = new double[12];
		double amt = 0; //1�⵿�� �� ���ݾ�
		double avg = 0; // ���� ��� ���ݾ�

		
	 for( int i= 0; i <card.length ; i++){
		System.out.print( ( i+1) + "���� ī�� ���ݾ��� ===>");
			card[i]= sc.nextDouble();
			if( card[i] <0){
				System.out.println("����� �Է��Ͽ��ּ���.");
				return;
			}
			amt += card[i];
	 }
			avg = amt / 12;
			
	
				double max = card[0]; //���� ������ ���Ҵ� ���� �ݾ�
				int idx = 0; // ���� ���� �� ���� �ڸ�(�ε���) 
				double min = card[0];
				int xxx = 0; //���� ���Ծ� ���� �ڸ� 
				
				for( int i=0 ; i < card.length; i++){

					if( card[i] > max){
						max= card[i];
							idx = i;	
				}
					}
		
				
				for( int i=0 ; i < card.length; i++){
						if( card[i] < min){
						min = card[i];
						xxx = i;
				
				}
			}
			
				System.out.println( "1�⵿���� ��ü ���ݾ� :" + amt);
				System.out.println( "���� ��� ���ݾ� :" + avg);
				System.out.println( "���� ������ ���Ҵ� ��: " +(idx+1) );
				System.out.println( "���� ������ ������ ��: " +(xxx+1) );
			}
			
}


		