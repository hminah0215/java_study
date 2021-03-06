/*
	마지막으로 사용자에게 주민등록번호를 입력받아 무료 암검진 대상자인지 판별하는 프로그램 

	<처리조건>
	- 무료 암검진 대상자는 나이가 40세이상이고 
		올해가 짝수연도이면 짝수해에 태어난사람 
		올해가 홀수연도이면 홀수해에 태어난사람
	- 나이가 40살 이상 남자이면 검진항목이 위암, 간암
	- 나이가 40살 이상 여자이면 검진항목이 위암, 간암, 유방암, 자궁암
	- 나이가 50살 이상 남자이면 검진항목이 위암, 간암, 대장암
	- 나이가 50살 이상 여자이면 검진항목이 위암, 간암, 대장암, 유방암, 자궁암 
*/

import java.util.Scanner;
import java.util.Date;
//선생님풀이. 내가한건 Cancer 파일.

class MyUtil
{
	public static int getYear(String jumin){	//출생년도 반환
		
		int year = Integer.parseInt( jumin.substring(0,2) );
		year += 1900;

		int flag = Integer.parseInt( jumin.substring(7,8) );
		
		if( flag == 3 || flag == 4 || flag == 7 || flag == 8){
			year += 100;
		}
		return year;
	}

	public static int getAge(String jumin){		//나이 반환
	
		int year = getYear(jumin);
		int currentYear = (new Date()).getYear()+1900;
		int age = currentYear- year;
		return age;
	} 

	public static String getGender(String jumin){	//성별 반환
		String re ="남자";
		int f = Integer.parseInt(jumin.substring(7,8));
		if( f % 2 ==0  ){
			re = "여자";
		}
		return re;
	}
}

class  CancerTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
	
		String jumin="";
		System.out.println("***무료 암검진 대상 확인 프로그램***");
		System.out.print("주민번호를 입력하세요==>");
		jumin = sc.next();
		
		int birthYear = MyUtil.getYear(jumin);
		int age = MyUtil.getAge(jumin);
		String gender = MyUtil.getGender(jumin);
		int currentYear = (new Date()).getYear()+1900;

		String r ="위암, 간암";
		
/*
	올해연도 - 출생연도 
	2019 - 1969			= 짝수			짝수 나누기2 하면 나머지가 0. 
	2020 - 1970			= 짝수			그러니 나이가 짝수면 암검진 대상자
*/
		//if(age < 40 || age % 2 != 0){
		
		if(currentYear %2 != birthYear%2 || age<40){
		  System.out.println("무료 암검진 대상자가 아닙니다.");
			return;
		}
		if(age >= 50){
			r= r+",대장암";
		}
		if(gender.equals("여자")){
			r = r +",유방암,자궁암";
		}
		System.out.println("올해의 무료 암검진 대상자입니다.");
		System.out.println("검진항목은 " + r+ "입니다.");
	}
}
