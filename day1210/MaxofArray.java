//배열중에 큰수찾기

class	MaxofArray
{
	public static void main(String[] args) 
	{
		int []a = { 10, 31, 10, 11, 100 };
		
		int max = a[0];
		int position= 0;

		for( int i=1 ; i < a.length ; i++ ){
			if( a[i] > max){
				max = a[i];
				position  = i;
		}
				
			}
				System.out.println("가장큰값이 위치한 index  : " + position ); 
				System.out.println("가장큰수 : " +  max);
	}
}
