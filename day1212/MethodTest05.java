import java.util.Scanner; 
class  MethodTest05
{ 
	public static void max( int a, int b){
		int q;
		if ( a < b ){
			
			q = b;
		
		}else{
			
			q = a;
		}
		System.out.println("큰수는  :" + q);
	}

//두개의 정수를 매개변수로 전달받아 그중에 큰수를 찾아 출력하는 메소드를 정의 

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s,d;
		System.out.print("첫번째 정수를 입력하세요==>");
		s = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요==>");
		d = sc.nextInt();

		max(s,d);
		max(7,5);
	}
}
