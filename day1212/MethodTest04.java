class  MethodTest04
{
	// n을 매개변수로 전달받아 1에서 n 까지의 합을 누적하여 출력하는 메소드를 
	//정의하고 호출해보세요.
	
	public static void sum( int n ){
		
		int tot = 0;
		for( int i =1 ; i <= n; i++){
			tot = tot + i;
		}
			System.out.println("1에서 "+ n + "까지의 합은 " + tot );
			//return;  생략되어있음. 아래 main에 있는 호출문으로 되돌아가!
 	}

	public static void gugudan( int dan ){
		System.out.println( dan +"단\n");
		for(int i=1; i<= 9; i++){
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

	}
   //두개의 정수를 매개변수로 전달받아 더하기 한 결과를 출력하는 메소드를 정의 
	public static void plus( int a, int b ){
			int r = a+b;
			System.out.println("\n더하기 결과 "+ r);
	}



	public static void main(String[] args) 
	{
		sum(5);
		sum(100);
		gugudan(2);
		gugudan(7);
		plus( 2,3 );
		
	}
}
