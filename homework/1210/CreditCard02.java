//숙제 1번(프로그래밍1번) 선생님 풀이

import java.util.Scanner;
class  CreditCard02
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		double []cards = new double[12];
		//cards[0], cards[1],..... cards[11]까지 12개의 변수를 사용할 수 있음. 
		double total = 0;
		
		for( int i=0 ; i < cards.length ; i++ ){
			System.out.print( ( i+1) + "월달 카드 사용료를 입력하세요 ==>");
			cards[i] = sc.nextDouble();
			total = total + cards[i];  //total += cards[i]; 
		}
		double avg = total / cards.length;
		
		double max = cards[0]; //각 월의 사용금액이 정해진 이후에 선언해야함.
		int maxIdx = 0;				 //배열값을 입력받고 선언.
		double min = cards[0];
		int minIdx = 0;
		//가장큰값,작은값 묻는건 따로따로해야함. 

		for ( int i =1 ;  i < cards.length ; i++ ){
			if( cards[i] > max ){
				max =  cards[i];
				maxIdx = i;
			}
			if( cards[i] < min){
				min = cards[i];
				minIdx = i;
			}
		}  //반복문이 돌고있으니 else가 오면 안됨.
	
		System.out.println( "1년동안의 전체 사용금액 :" + total);
		System.out.println( "월별 평균 사용금액 :" + avg);
		System.out.println( "가장 지출이 많았던 월 : " +(maxIdx+1) ); 
		System.out.println( "가장 지출이 적었던 월 : " +(minIdx+1) );
		//월을 표시해야해서 +1 해줘야함. 
		
		}
	}

