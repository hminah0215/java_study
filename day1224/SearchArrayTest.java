class NotFoundException extends Exception
{
	public NotFoundException(String msg){
		super(msg);
	}
}

class SearchArray
{
	public static int search(int []arr, int value) throws NotFoundException {  //(	�迭, �̹迭�ȿ� �����Ͱ� �ִ��� ã�� ���� ) 
		int idx = -1; //0���� �ʱ�ȭ�ϸ� ã�°��� ��� �迭�� 0��°���� ��µǴϱ� -1, -100�ص���
		for( int i=0; i < arr.length ; i++){
			if( arr[i] == value ){
				idx = i;
				break;
			}
		}
		if( idx == -1){
			throw new NotFoundException("ã���� �ϴ� ���� �迭�� �����.");
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
		//int n = SearchArray.search( a,33 );  // a�迭�ӿ� 33�� �ִ��� ����
		int n = SearchArray.search( a,2);
		System.out.println( n + "��°�� �־��.");
	}catch(NotFoundException e){
		System.out.println(e.getMessage());
		}
	}
}