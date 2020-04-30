//구구단 2단부터 9단까지 출력하시오. 
//중첩반복문

class  GugudanAll
{
	public static void main(String[] args) 
	{
		for( int dan=2 ; dan <=9 ;dan++ ){
				System.out.println(dan+ "단");	
				for( int i =1 ; i <=9  ; i++ ){
					System.out.println(dan+ "*"+i+"="+(dan*i));
				}
				System.out.println(); //단 사이에 빈줄추가하고 싶을때.
		}
	}
}
