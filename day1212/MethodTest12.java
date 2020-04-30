class MethodTest12 
{
	public static void printArr(int []n){
		for( int i = 0; i < n.length; i++){
			System.out.print(n[i] + " ");
		}
		System.out.println();

	}
	public static void sortArr( int s[]){
		for( int i = 0 ; i < s.length; i++){
			for( int j = i+1 ; j < s.length ; j++){
				if(s[i] > s[j]){
					int temp;
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}	
			}
			
		} 
			
			System.out.println();
	}

	public static void main(String[] args) 
	{
		int []a = { 8,5,2,9,3 };
		printArr(a); //정수형 배열을 매개변수로 전달받아 모두 출력하는 메소드
		sortArr(a);  //정수형 배열을 매개변수로 전달받아 값이 작은것부터 오도록(오름차순) 정렬
		printArr(a);
 	}
}
