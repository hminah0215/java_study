class  MultiArrayTest03
{
	public static void main(String[] args) 
	{
		//int []a = {1,2,3,4,5};
		
		//int[][]b = {{1,2,3},{4,5,6},{8,9,10}}; //3행 3열의 2차원 배열이 됨 

		int[][]c = {{1,2},{3,4,5,6,7,},{8,9,10}}; //행마다 열의 사이즈가 다를 수 있음. 

		//c배열의 모든요소를 출력해보자.

		for(	int i=0; i < c.length; i++){
			for( int j=0 ; j < c[i].length ; j++){
				System.out.print(  c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
