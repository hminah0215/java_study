//숙제 프로그래밍 1번
import java.util.Scanner;
class	CreditCard
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []card = new double[12];
		double amt = 0; //1년동안 총 사용금액
		double avg = 0; // 월별 평균 사용금액

		
	 for( int i= 0; i <card.length ; i++){
		System.out.print( ( i+1) + "월의 카드 사용금액은 ===>");
			card[i]= sc.nextDouble();
			if( card[i] <0){
				System.out.println("양수를 입력하여주세요.");
				return;
			}
			amt += card[i];
	 }
			avg = amt / 12;
			
	
				double max = card[0]; //가장 지출이 많았던 때의 금액
				int idx = 0; // 가장 많이 쓴 달의 자리(인덱스) 
				double min = card[0];
				int xxx = 0; //가장 적게쓴 달의 자리 
				
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
			
				System.out.println( "1년동안의 전체 사용금액 :" + amt);
				System.out.println( "월별 평균 사용금액 :" + avg);
				System.out.println( "가장 지출이 많았던 월: " +(idx+1) );
				System.out.println( "가장 지출이 적었던 월: " +(xxx+1) );
			}
			
}


		