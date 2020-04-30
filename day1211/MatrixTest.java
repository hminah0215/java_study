// 5행 5열의 2차원 배열을 만들고, 각각 배열의 요소에 1부터 1씩 증가한 값을 
//차례로 대입한 후 출력하는 프로그램 작성 

class MatrixTest 
{
	public static void main(String[] args) 
	{
		int [][]a = new int[5][5];  //앞이 줄(행), 뒤에가 칸 (열)
		int n = 1;	//1씩 증가하는 값?을 받을 변수?
		for( int i = 0;  i < a.length ; i++	){ //2차원 배열에서 a랭쓰 하면 행의수를 알려줌.
			for( int j = 0 ; j < a[i].length ; j++){  // j는 칸수만큼 진행. 
				a[i][j] = n++; // n을먼저 넣고 나중에 증가해. 
				
			}
		}
		for (	 int i=0; i < a.length ; i++ ){
			for(int j=0 ; j< 5; j++){
				System.out.print(a[i][j]+ " \t");
			}
				System.out.println();
		}
		
	}
}
