/*
6) 실수형 배열을 매개변수로 전달받아 오름차순 정렬하는 메소드를 
	참고자료 없이 만들 수 있도록 자신의 코드로 만드세요.
*/

class Silsu
{
	public static void up ( double s[] ){
		for( int i = 0 ; i < s.length ; i++){
			for( int j = i+1 ; j < s.length ; j++ ){
				if ( s[i] > s[j] ){
					double temp;
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;

				}
			}	System.out.println( s[i]);
		}
		
	}




	public static void main(String[] args) 
	{
		double a[] = {10.1, 23.4 , 3.6, 3.24, 2.15};
		up( a );
	}
}
