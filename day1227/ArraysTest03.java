import java.util.Arrays;
class ArraysTest03
{
	public static void main(String[] args) 
	{
		int []a = {100,200,300};
		int []b = {100,200,300};

		//Arrays 클래스의 메소드를 이용하여 두 배열이 서로 같은 요소인지 판별하도록 하세요.
		
		boolean flag = Arrays.equals(a,b);
		if( flag ){
			System.out.println("두 배열은 같습니다.");
		}else{
			System.out.println("두 배열은 다릅니다.");
		}

		/*
		if( Arrays.equals(a,b) ){ 바로 그냥 집어넣어도 됨.
			System.out.println("두 배열은 같습니다.");
		}else{
			System.out.println("두 배열은 다릅니다.");
		}
		*/
	
	}
}
