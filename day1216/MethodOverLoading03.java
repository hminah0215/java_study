/* 메소드 중복!!! 반환하는 !!!! 
연습 ) 다음의 기능을 갖도록 메소드를 중복하세요.
-정수두개중에 큰수를 구하여 반환하는 메소드
-정수 세개중에 큰 수를 구하여 반환하는 메소드
- 실수 두개중에 큰수를 반환하는 메소드
-정수배열중에 큰수를 구하여 반환하는 메소드 
-실수 배열중에 큰수를 구하여 반환하는 메소드 
*/
class MaxUtil
{
	//정수두개중에 큰수를 구하여 반환하는 메소드
	public int max(int a, int b){
		int r = a;
		if( b > r){
			r = b;
		}
		return r;
	}

	//정수 세개중에 큰 수를 구하여 반환하는 메소드
	public int max(int a, int b, int c){
		int r;
		r = max(max( a,b ),c);  //맥스 인트 2개짜리가 있어서 쓸 수 있음. 
		return r;
	}

	//실수 두개중에 큰수를 반환하는 메소드
	public double max(double a, double b){
		double r = a;
		if( b > r ){
			r = b;
		}
		return r;
		/*
		 if( a> b)
			return a;
		else
			return b; 
			*/
		/*
		if( b > a)
			a=b;
		return a;
		*/
	}

	//정수배열중에 큰수를 구하여 반환하는 메소드 
	public int max(int a[]){
		int v = a[0];
		for( int i = 1 ; i < a.length ; i++){
			if(v < a[i]){
				v = a[i];
			}
		}
		return v;
	}

	//실수 배열중에 큰수를 구하여 반환하는 메소드 
	public double max(double a[]){
		double v = a[0];
		for( int i = 1 ; i < a.length ; i++){
			if(v < a[i]){
				v = a[i];
			}
		}
		return v;
	}

}


class MethodOverLoading03

{
	public static void main(String[] args) 
	{
		MaxUtil mu = new MaxUtil();

		System.out.println( mu.max(2,3));
		System.out.println( mu.max(2,7,3));
		System.out.println( mu.max(9.1, 2.8));
		int []arr = {1, 5, 3, 8, 2 };
		System.out.println( mu.max(arr));
		double []z = {10.2, 5.6, 7.9, 2.7};
		System.out.println( mu.max(z));
	}
}
