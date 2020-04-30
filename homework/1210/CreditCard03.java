//숙제 1번(프로그래밍1번) 선생님 풀이 -2번째파일
//중복된 금액이 입력된 달도 다 출력이 되는 파일. 

import java.util.Scanner;
class  CreditCard03
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
	
		System.out.println( "1년동안의 전체 사용금액 :" + total);
		System.out.println( "월별 평균 사용금액 :" + avg);
		System.out.print( "가장 지출이 많았던 월: ");
		for(int i= 0; i < cards.length ; i++){
			if ( cards[i] == max){
			System.out.print( ( i+1)+ "월," );
			}
		}
		System.out.println("\b 입니다.");
		//\b 하면 바로 앞에 한칸이 지워진다. 이경우 월 뒤에있는 콤마가 지워짐 
		
		System.out.print( "가장 지출이 적었던 월: ");
		for(int i= 0; i  < cards.length ; i++){
			if ( cards[i] == min){
			System.out.print( ( i+1)+ "월," );
			}
		}
		System.out.println("\b 입니다.");
		}
	}

