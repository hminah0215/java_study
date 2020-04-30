

class  ExceptionTest04
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);  //스트링을 정수로 바꿔주는 기능 사용
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println("결과: " + r);
			
		
		//해당 캐치절을 수행하고 종료가 된다.그래서 반드시 마무리 해야한다고 finally 사용
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("나누기 할 두수를 전달해 주세요.");
		}catch(NumberFormatException n){
			System.out.println("숫자를 전달해야합니다.");
		}catch(ArithmeticException a){
			System.out.println("0으로 나눌 수는 없어요.");
		}finally{
			System.out.println("작업종료");
		}


	}
}
