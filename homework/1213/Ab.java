/*5) 정수형 배열을 매개변수로 전달받아 그 중에 큰수를 찾는 메소드를 
	참고자료 없이 만들 수 있도록 자신의 코드로 만드세요. */


class  Ab
{
 public static void ken(int a[]){
	int b = a[0];
	for( int i = 1 ; i < a.length ; i++){
		if( b < a[i]){
			b = a[i];
		}	
	}
	System.out.print("가장 큰 수는: " + b);
 }


	public static void main(String[] args) 
	{
		int max[] = { 4,7,9,16,3,24};
		ken(max);

	}
}
