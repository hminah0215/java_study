class  Ty
{
	public static void max( int a[]){
		int ken = a[0];
		for( int i =1; i < a.length ; i++){
			if( ken < a[i] ){
				ken = a[i];
			}
		} System.out.println("가장 큰 수는 : " + ken );
	}



	public static void main(String[] args) 
	{
		int jung[] ={24,8,1,9,17};
		max(jung);
	}
}
