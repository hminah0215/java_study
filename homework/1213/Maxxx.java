/*5) 정수형 배열을 매개변수로 전달받아 그 중에 큰수를 찾는 메소드를 
	참고자료 없이 만들 수 있도록 자신의 코드로 만드세요. */


class  Maxxx
{	
	//새로운 메소드를 정의한다. 큰수를 구하는 for문은 1개! 정렬2개랑 헷갈리면안됨.
	public static void ken( int a[] ){
		int max = a[0];

		for( int i = 1 ; i < a.length ; i++ ){
			if ( max < a [i]){
				max = a[i];
			}	
		}
			System.out.print("가장 큰 수는: " + max);
	}
	
	
	public static void main(String[] args) 
	{
		int ken []= { 6,1,8,13,4  };
		ken(  ken );
	}
}
