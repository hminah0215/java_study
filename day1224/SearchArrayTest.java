class NotFoundException extends Exception
{
	public NotFoundException(String msg){
		super(msg);
	}
}

class SearchArray
{
	public static int search(int []arr, int value) throws NotFoundException {  //(	배열, 이배열안에 데이터가 있는지 찾을 변수 ) 
		int idx = -1; //0으로 초기화하면 찾는값이 없어도 배열의 0번째값이 출력되니까 -1, -100해도됨
		for( int i=0; i < arr.length ; i++){
			if( arr[i] == value ){
				idx = i;
				break;
			}
		}
		if( idx == -1){
			throw new NotFoundException("찾고자 하는 값이 배열에 없어요.");
		}

		return idx;
	}
}


class  SearchArrayTest
{
	public static void main(String[] args) 
	{
		try{
		int []a ={ 16, 18, 29, 33, 36, 39 };
		//int n = SearchArray.search( a,33 );  // a배열속에 33이 있는지 물음
		int n = SearchArray.search( a,2);
		System.out.println( n + "번째에 있어요.");
	}catch(NotFoundException e){
		System.out.println(e.getMessage());
		}
	}
}
