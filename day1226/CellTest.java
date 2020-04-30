import java.util.Scanner;

class  CellTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.print("전화번호를 입력하세요==>");
		phone = sc.next();
		
		String []arr = phone.split("-");
		if(arr.length != 3 ){
			System.out.println("올바른 전화번호 형식이 아닙니다.");
			return;
		}
		if( arr[0].length() != 3 || arr[1].length() != 4 || arr[2].length() !=4 ){
			System.out.println("올바른 전화번호 형식이 아닙니다.");
			return;
		}

		try{
			for(String str : arr){
				Integer.parseInt(str);
			}
			System.out.println("올바른 전화번호 형식입니다.");
		}catch(Exception e){
			System.out.println("올바른 전화번호 형식이 아닙니다.");
			return;
		}	
	}
}
