//���� 1��(���α׷���1��) ������ Ǯ�� -2��°����
//�ߺ��� �ݾ��� �Էµ� �޵� �� ����� �Ǵ� ����. 

import java.util.Scanner;
class  CreditCard03
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		double []cards = new double[12];
		//cards[0], cards[1],..... cards[11]���� 12���� ������ ����� �� ����. 
		double total = 0;
		
		for( int i=0 ; i < cards.length ; i++ ){
			System.out.print( ( i+1) + "���� ī�� ���Ḧ �Է��ϼ��� ==>");
			cards[i] = sc.nextDouble();
			total = total + cards[i];  
		}
		double avg = total / cards.length;
		
		double max = cards[0]; 
		double min = cards[0];
		
		

		for ( int i =1 ;  i < cards.length ; i++ ){
			if( cards[i] > max ){
				max =  cards[i];
				
			}
			if( cards[i] < min){
				min = cards[i];
				
			}
		}  
	
		System.out.println( "1�⵿���� ��ü ���ݾ� :" + total);
		System.out.println( "���� ��� ���ݾ� :" + avg);
		System.out.print( "���� ������ ���Ҵ� ��: ");
		for(int i= 0; i < cards.length ; i++){
			if ( cards[i] == max){
			System.out.print( ( i+1)+ "��," );
			}
		}
		System.out.println("\b �Դϴ�.");
		//\b �ϸ� �ٷ� �տ� ��ĭ�� ��������. �̰�� �� �ڿ��ִ� �޸��� ������ 
		
		System.out.print( "���� ������ ������ ��: ");
		for(int i= 0; i  < cards.length ; i++){
			if ( cards[i] == min){
			System.out.print( ( i+1)+ "��," );
			}
		}
		System.out.println("\b �Դϴ�.");
		}
	}

