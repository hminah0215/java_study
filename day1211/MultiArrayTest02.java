class MultiArrayTest02 
{
	public static void main(String[] args) 
	{
		int [][][]a = new int [2][4][3]; //3칸짜리가 4줄있고 이런게 2장있음. 
		//		 면   행  열
		
		//첫번째 장에는 모두 0을 대입하고, 두번째 장에는 모두 1을 대입한 후 출력해보자. 
		
		for(int i =0 ; i < a.length ; i++){	//면(장)
			for( int j=0 ; j < a[i].length ; j++){  //행
				for( int k= 0 ; k < a[i][j].length ; k++){  //열
					a[i][j][k] =  i;
						System.out.print( a[i][j][k]+ " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	/*		for( int i=0 ; i < a.length; i++){
				for( int j=0; j<a[i].length; j++){
					for(int k=0; k< a[i][j].length; k++){
						System.out.print( a[i][j][k]+ " ");	
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

	}
}
