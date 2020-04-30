//정렬
class SortTest 
{
	public static void main(String[] args) 
	{
		int []a ={ 8,36,14, 33,38,41 };
		
		for( int i=0 ; i < a.length ; i++ ){
			for (int j = i+1 ; j < a.length ; j++ ){
				if( a[j] < a[i] ){ //오름차순.비교하는 j가 나(i)보다 작은지
					int temp ;  //작으니까 임시변수를 넣어 자리를 바꿔줌. 
					temp = a[i];
				     a[i] = a[j];
					 a[j] = temp;
			}   
		}
	}
		
	for( int i=0 ; i < a.length ; i++ ){
		System.out.print( a[i] +" ");
	}
		//8, 14, 33, 36, 38, 41 작은값부터 순서대로 (혹은 반대로)오도록 하는게 정렬.
	}
}
