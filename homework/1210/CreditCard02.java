//���� 1��(���α׷���1��) ������ Ǯ��

import java.util.Scanner;
class  CreditCard02
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
			total = total + cards[i];  //total += cards[i]; 
		}
		double avg = total / cards.length;
		
		double max = cards[0]; //�� ���� ���ݾ��� ������ ���Ŀ� �����ؾ���.
		int maxIdx = 0;				 //�迭���� �Է¹ް� ����.
		double min = cards[0];
		int minIdx = 0;
		//����ū��,������ ���°� ���ε����ؾ���. 

		for ( int i =1 ;  i < cards.length ; i++ ){
			if( cards[i] > max ){
				max =  cards[i];
				maxIdx = i;
			}
			if( cards[i] < min){
				min = cards[i];
				minIdx = i;
			}
		}  //�ݺ����� ���������� else�� ���� �ȵ�.
	
		System.out.println( "1�⵿���� ��ü ���ݾ� :" + total);
		System.out.println( "���� ��� ���ݾ� :" + avg);
		System.out.println( "���� ������ ���Ҵ� �� : " +(maxIdx+1) ); 
		System.out.println( "���� ������ ������ �� : " +(minIdx+1) );
		//���� ǥ���ؾ��ؼ� +1 �������. 
		
		}
	}
