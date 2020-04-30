class ArrayTest03
{
	public static void main(String[] args) 
	{
		int []a = {32,44,27,1,13,26} ; 
		//배열을 선언함과 동시에 초기화할수있다. 
		//중괄호안의 개수가 6개니까 6을 굳이 입력치 않아도 됨. 


	for(int i=0 ; i  < a.length ;  i++)  //배열의 데이터 개수보다 작을때까지로 해야함. 
		System.out.print( a[i] + " "); // x.length 배열의 길이

	}
}
