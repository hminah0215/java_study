class  Er
{
	public static void ken( double b[]){
		for( int i = 0; i< b.length; i++){
			for(int j= i+1 ; j< b.length; j++){
				if( b[i] > b[j]){
					double temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			} System.out.println(b[i]);
		}


	}



	public static void main(String[] args) 
	{
		double []a = { 2.1,6.1,1.8,7.7,3.2};
		ken(a);
	}
}
