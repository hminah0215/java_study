/*5) 정수형 배열을 매개변수로 전달받아 그 중에 큰수를 찾는 메소드를 
	참고자료 없이 만들 수 있도록 자신의 코드로 만드세요. */


class  A01
{
	public static void maxx( int n[] ){
		int max = n[0];

		for( int i =1 ; i < n.length; i++){
			if( max < n[i]   ){
				max = n[i];
			}
		}
		System.out.print("가장 큰 수는: " + max);
	}


	public static void main(String[] args) 
	{
		int maxx [] = { 40,2,1,9,8 };
		maxx( maxx );
	}
}
