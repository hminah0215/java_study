//사주팔자. 이름/띠음력생월/생일/ 생시를 입력받아 사주풀이.

import java.util.Scanner;
class  Saju
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int  zodiac, mon,day, time;
		int abc= 0; //이동하는 값
		int def= 0;
		int ghi= 0;
		int jkl= 0;
		
		System.out.println("***사주팔자 확인 프로그램입니다***");
		System.out.print("이름을 입력하세요===>");
		name=sc.nextLine();
		System.out.print("띠를 입력하세요===>");
		zodiac=sc.nextInt();
		//1.자 2.축 3.인 4.묘 5.진 6.사 7.오 8.미 9.신 10.유 11.술 12.해
		System.out.print("태어난 월을 입력하세요===>");
		mon=sc.nextInt();
		System.out.print("태어난 일을 입력하세요===>");
		day=sc.nextInt();
		System.out.print("태어난 시간을 입력하세요===>");
		time=sc.nextInt();

		for( int a=0; a <= zodiac ; a++ ){ //띠
		
			a = zodiac;
				
				
				for(int b=0; b  <= mon  ; b++){ //태어난 월
			
						abc = a-2;
						
							//if( mon ==1 )
							//	mon = abc;
									abc++;
					
					for( int c=0; c <=day ; c++){ //태어난 일
						def = b-3;
							//if( day ==1 )
							//	day = def;
									def++;
						
						
						
					
					for( int d=0 ; d <= time  ; d++){ //태어난 시간
						ghi = c-4;
						//	if( time ==1 )
								//time = ghi;
									ghi++;

					}
					
					
					}
				
				}
		
		}
				System.out.println(zodiac);
				System.out.println(abc);
				System.out.println(def);
				System.out.println(ghi);
				


	}
}
