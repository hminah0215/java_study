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

class  Cancer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
	
		String jumin="";
		System.out.println("***무료 암검진 대상 확인 프로그램***");
		System.out.print("주민번호를 입력하세요==>");
		jumin = sc.next();

		int year = Integer.parseInt( jumin.substring(0,2) ); //91년생 
		year += 1900;

		int flag = Integer.parseInt( jumin.substring(7,8) );// 남자인지 여자인지 
		
		if( flag == 3 || flag == 4 || flag == 7 || flag == 8){ //2000년이후 출생자들 나이계산 
			year += 100;
		}
		int currentYear = (new Date()).getYear()+1900;
		int age = currentYear- year;
		
		String a = "위암, 간암";

		if(currentYear %2 == year%2 && age>=40 ){ 
			System.out.println("무료암검진 대상자입니다.");
		
		if(flag ==1 || flag ==3 ){
				if( age <= 50 ){
					a = a;
				}else if( age >= 50){
					a = a+", 대장암";
					}
				}
				
		if(flag ==2 || flag ==4 ){
				if( age <= 50 ){
					a = a + ", 유방암, 자궁암";
				}else if( age >= 50){
					a = a + ", 유방암, 자궁암, 대장암";
					}
				}System.out.println("올해 검진 항목은 "+a+ "입니다.");
		
		}else{
			System.out.println("올해는 검진대상자가 아닙니다.");
			
		}
		
	}
}
		
