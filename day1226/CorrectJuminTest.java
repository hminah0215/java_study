//12월 24일 주민번호 프로그램 숙제 풀이 
import java.util.Scanner;




class  CorrectJuminTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("주민번호를(하이픈 - 을 포함하여) 입력하세요==>");
		jumin = sc.next();
		System.out.println("입력한 주민번호는 " + jumin + " 입니다.");

		//	920404-2345678
		//	ㅍ = 11-{(2×ㄱ + 3×ㄴ + 4×ㄷ + 5×ㄹ + 6×ㅁ + 7×ㅂ + 8×ㅅ + 9×ㅇ + 2×ㅈ + 3×ㅊ + 4×ㅋ + 5×ㅌ) mod 11}
		// 11-(37+35+16+11+28
		int []arr = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//0은 - 하이픈자리. 건너뛰도록
		
		if(jumin.charAt(6) != '-'){ //하이픈이 아닌가요? 
				System.out.println("하이픈 - 을 입력해주세요.");
				return;
			}
					
		if(jumin.length()  !=  14){ // 입력받은 주민번호가 14자리가 아니라면	
			System.out.println("올바른 주민등록번호가 아닙니다. 확인해주세요.");
			return;
		}
		
		int tot =0 ;
		for(int i =0; i < jumin.length()-1; i++){ //jumin.length()-1 or arr.length까지
			if( i == 6){
				continue;
			}
			tot = tot + Integer.parseInt(jumin.charAt(i)+"") * arr[i]; 
			//입력받은 주민번호를 charAt으로 꺼내와서 integer로 정수변환 	
 		}
		tot = tot % 11;
		tot = 11 - tot;
		
		if( tot == 10){
			tot = 0;
		}
		if(tot == 11){
			tot = 1;
		}

		int check = Integer.parseInt(jumin.charAt(13)+"");
		if( tot == check ){
			System.out.println("올바른 주민번호 입니다.");
		}else{
			System.out.println("올바른 주민번호가 아닙니다.");
		}
	}
}
