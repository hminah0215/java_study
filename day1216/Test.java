/* 메소드 중복!!! 반환하는 !!!! 
연습 ) 다음의 기능을 갖도록 메소드를 중복하세요.
-정수두개중에 큰수를 구하여 반환하는 메소드
-정수 세개중에 큰 수를 구하여 반환하는 메소드
- 실수 두개중에 큰수를 반환하는 메소드
-정수배열중에 큰수를 구하여 반환하는 메소드 
-실수 배열중에 큰수를 구하여 반환하는 메소드 
*/

class Test01
{
	//정수두개중 큰수
	public void max(int a, int b){  
		int c = a;
			if(a > b){
				c = a;
	    	}
			System.out.println("가장 큰수는: "+c);	
		}

	//정수세개중 큰수	
	public void max(int a, int b, int c){ 
		int m = a;
		if(b > a){
			if(b > c){
				m=b;
			}else {
				m=c;
				}
			}else if( a> c){
				m =a;
			}else{
				m=c;
			}
			System.out.println("가장 큰수는: "+m);
		}

	//실수 두개 중 큰수 
	public void max(double a, double b){ 
		double c = a;
			if( a < b){
				c = b;
			}
			System.out.println("가장 큰수는: "+c);
	}
	//정수배열 중 큰수
	public void max(int a[])	{ 
		int b = a[0];
		for(int i = 1 ; i < a.length ; i++){
			if( b <a[i] ){
				b = a[i];
			}
		} 
		System.out.println("가장 큰수는: "+b);
}
	//실수배열 중 큰수 
	public void max(double a[]){ 
		double b = a[0];
		for(int i = 1 ; i < a.length ; i++){
			if( b <a[i] ){
				b = a[i];
			}
		} 
		System.out.println("가장 큰수는: "+b);
	}
}



class  Test
{
	public static void main(String[] args) 
	{
		Test01 t = new Test01();
		t.max(9,2);  //정수두개
		t.max(8,1,7);	//정수세개
		t.max(3.2 , 6.8);	//실수두개 
		int []a = {1, 5, 3, 8,2 };
		t.max(a);
		double []z = {10.2, 5.6, 7.9, 2.7};
		t.max(z);
	
		

	}
}
